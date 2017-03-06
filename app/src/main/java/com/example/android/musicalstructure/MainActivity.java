package com.example.android.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.onClick;
import static android.R.string.no;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nowPlaying = (TextView) findViewById(R.id.now_playing);
        nowPlaying.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        TextView preferences = (TextView) findViewById(R.id.preferences);
        preferences.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent preferencesIntent = new Intent(MainActivity.this, PreferencesActivity.class);
                startActivity(preferencesIntent);
            }
        });

        TextView recommendations = (TextView) findViewById(R.id.recommendations);
        recommendations.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent recommendationsIntent = new Intent(MainActivity.this, RecommendationsActivity.class);
                startActivity(recommendationsIntent);
            }
        });

        TextView trending = (TextView) findViewById(R.id.trending);
        trending.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent trendingIntent = new Intent(MainActivity.this, TrendingActivity.class);
                startActivity(trendingIntent);
            }
        });

        TextView tickets = (TextView) findViewById(R.id.tickets);
        tickets.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent ticketsIntent = new Intent(MainActivity.this, TicketsActivity.class);
                startActivity(ticketsIntent);
            }
        });

    }
}
