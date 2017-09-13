package beaumont.danny.musicapipoc;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import beaumont.danny.musicapipoc.model.ResultsItem;

/**
 * Created by dracul89 on 9/12/17.
 */

class MyAdapter extends android.support.v7.widget.RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<ResultsItem> items;

    public MyAdapter(List<ResultsItem> items) {
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setFields(items.get(position));
    }


    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView album;
        TextView track;
        TextView song;
        public ViewHolder(View card){
            super(card);
            album = card.findViewById(R.id.albumText);
            track = card.findViewById(R.id.trackText);
            song = card.findViewById(R.id.songText);
        }
        public void setFields(ResultsItem item) {
            album.setText(item.getCollectionCensoredName());
            track.append(Integer.toString(item.getTrackNumber()));
            song.setText(item.getTrackCensoredName());
        }
    }
}
