package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

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
    }
}
