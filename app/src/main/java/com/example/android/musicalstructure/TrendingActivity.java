package com.example.android.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static android.R.string.no;

/**
 * Created by djp on 3/6/17.
 * requires integration of some music service that tracks trending songs.  The service
 * would be smart enough to understand your interests and could limit the suggestions
 * based on your tastes.
 */

public class TrendingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trending);

        Button musicPreferenceButton = (Button) findViewById(R.id.music_preference_button);
        musicPreferenceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent musicPreference = new Intent(TrendingActivity.this, PreferencesActivity.class);
                startActivity(musicPreference);
            }
        });
    }
}
