package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

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
    }
}
