package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by djp on 3/6/17.
 * A music service would be available to this app.  The music services would know what
 * songs and artists you have already selected and would have an algorithm
 * that generate suggestions of songs/artists you may like
 */

public class RecommendationsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);

        Button nowPlayingButton = (Button) findViewById(R.id.now_playing_button);
        nowPlayingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlaying = new Intent(RecommendationsActivity.this, NowPlayingActivity.class);
                startActivity(nowPlaying);
            }
        });
    }
}
