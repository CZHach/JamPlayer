package com.androidapps.cmt34.jamplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimerTask task = new TimerTask() {
            @Override

            public void run() {
                finish();

                startActivity(new Intent(MainActivity.this, Player.class));

            }
        };
        Timer opening = new Timer();
        opening.schedule(task, 5000);
    }
}
