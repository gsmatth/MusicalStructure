package com.example.android.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.android.musicalstructure.R;

/**
 * Created by djp on 3/6/17.
 * To set-up or change your preferences, I envision some type of music service that is available to this app.
 * The service would know your account ID  and would have your prefences stored locally.  The service
 * would show you what your current preferences were as well as other songs in the genres that
 * you have not selected yet.
 */

public class PreferencesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);

        Button nowPlayingButton = (Button) findViewById(R.id.now_playing_button);
        nowPlayingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(PreferencesActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });
    }
}
