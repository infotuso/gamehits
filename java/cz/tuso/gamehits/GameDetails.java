package cz.tuso.gamehits;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GameDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_details);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            TextView nameView = (TextView) findViewById(R.id.name);
            nameView.setText(extras.getString("Name"));

            TextView yearView = (TextView) findViewById(R.id.year);
            yearView.setText(extras.getString("Year"));

            TextView descView = (TextView) findViewById(R.id.desc);
            descView.setText(extras.getString("Desc"));

            TextView votesView = (TextView) findViewById(R.id.votes);
            votesView.setText(extras.getString("Votes") + " votes");

            ImageView imageView = (ImageView) findViewById(R.id.image);
            imageView.setImageResource(Integer.parseInt(extras.getString("Image")));
        }
    }
}
