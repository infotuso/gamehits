package cz.tuso.gamehits;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.content.Context;
import java.util.ArrayList;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import android.util.Log;
import android.widget.ListView;

/**
 * Created by Alex on 9.7.2016.
 */
public class GameAdapter extends ArrayAdapter<Game> {

    GameAdapter (Context context, int resource, ArrayList<Game> list) {
        super(context,resource,list);
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {

        Game game = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.games_list_item, parent, false);
        }

        //TextView positionView = (TextView) convertView.findViewById(R.id.position);
        //positionView.setText(String.valueOf(position + 1) + ".");

        TextView nameView = (TextView) convertView.findViewById(R.id.name);
        nameView.setText(game.getName());

        //TextView yearView = (TextView) convertView.findViewById(R.id.year);
        //yearView.setText(String.valueOf(game.getYear()));

        TextView votesView = (TextView) convertView.findViewById(R.id.votes);
        votesView.setText(String.valueOf(game.getVotes()) + " votes");

        ImageView imageView = (ImageView) convertView.findViewById(R.id.image);
        imageView.setImageResource(game.getImage());

        Button button = (Button) convertView.findViewById(R.id.vote);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ((ListView) parent).performItemClick(v,position,0);
            }
        });

        return convertView;
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

}
