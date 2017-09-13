package beaumont.danny.musicapipoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LyricsActivity extends AppCompatActivity {

    @BindView(R.id.lyricsText)
    TextView lyricsText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyrics);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        String lyrics = intent.getStringExtra("Lyrics");
        if (lyrics != null) {
            lyricsText.setText(lyrics);
        }
    }

}
