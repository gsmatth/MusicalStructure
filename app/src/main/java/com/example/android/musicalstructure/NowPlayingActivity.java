package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import com.example.android.musicalstructure.R;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by djp on 3/6/17.
 * to add the lyrics, twitter and facebook functionality:
 * leverage misixmatch api https://developer.musixmatch.com/ to pull in lyrics
 * include OAuth into app and register app with twitter and add twitter SDK.
 * http://www.tutorialspoint.com/android/android_twitter_integration.htm
 * Integrarte facebook: https://developers.facebook.com/docs/android/getting-started/
 */

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        Button buyTicket = (Button) findViewById(R.id.ticket_button);
        buyTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ticketsIntent = new Intent(NowPlayingActivity.this, TicketsActivity.class);
                startActivity(ticketsIntent);
            }
        });
    }
}
