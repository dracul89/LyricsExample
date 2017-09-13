package beaumont.danny.musicapipoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import beaumont.danny.musicapipoc.injection.Injector;
import beaumont.danny.musicapipoc.model.LyricsResponse;
import beaumont.danny.musicapipoc.model.ResultsItem;
import beaumont.danny.musicapipoc.network.ItunesService;
import beaumont.danny.musicapipoc.network.LyricsService;
import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;


public class FullscreenActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    @BindView(R.id.searchView)
    SearchView searchView;

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @Inject
    ItunesService artistService;

    @Inject
    LyricsService lyricsService;

    private List<ResultsItem> items;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fullscreen);
        Injector.getComponent().inject(this);
        ButterKnife.bind(this);


        initSearchView();
        initRecyclerView();

    }

    private void initRecyclerView() {
        items = new ArrayList();
        adapter = new MyAdapter(items);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void initSearchView() {
        searchView.setOnSuggestionListener(null);//no suggestions
        searchView.setSubmitButtonEnabled(true);
        searchView.setOnQueryTextListener(this);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        String artist = searchView.getQuery().toString();
        artistService.getSearchResults(artist)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnNext(response -> {
                    // remove previous results from list
                    if (items != null && !items.isEmpty()) {
                        items.clear();
                    }
                    items.addAll(response.getResults());
                    adapter.notifyDataSetChanged();
                })
                .doOnError(e -> Log.e("iTunes Service", "Error", e))
                .subscribe();
        return true;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }

    public void doLyrics(View view) {
        String artist = searchView.getQuery().toString();
        String song = ((TextView)view.findViewById(R.id.songText)).getText().toString();
        StringBuilder stringBuilder = new StringBuilder();
        lyricsService.getLyrics("getSong",artist,song,"json")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnNext(response ->{
                            String[] parts = response.string().split("=");
                            if(parts.length > 1) {
                                Gson gson = new GsonBuilder().create();
                                LyricsResponse lyricsResponse = gson.fromJson(parts[1],LyricsResponse.class);
                                Intent intent = new Intent(this,LyricsActivity.class);
                                intent.putExtra("Lyrics",lyricsResponse.getLyrics());
                                startActivity(intent);
                            }

                        }
                )
                .doOnError(e -> Log.e("Lyrics Service","Error",e))
                .subscribe();
        if (!stringBuilder.toString().isEmpty()) {

        }
    }

}
