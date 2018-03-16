package com.androidapps.cmt34.jamplayer;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Player extends Activity {

    //define our variables and elements
    Button btnSongOne, btnSongTwo;
    MediaPlayer mpSongOne, mpSongTwo;
    int playing;

    Button.OnClickListener bSongOne = new Button.OnClickListener() {

        @Override
        //handle play or stop logic
        public void onClick(View v) {
            switch(playing) {
                case 0:
                    mpSongOne.start();
                    playing = 1;
                    btnSongOne.setText("Pause");
                    btnSongTwo.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpSongOne.pause();
                    playing = 0;
                    btnSongOne.setText("Play");
                    btnSongTwo.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };


    Button.OnClickListener bSongTwo = new Button.OnClickListener() {
        @Override

        //handle play or stop logic
        public void onClick(View v) {
            switch(playing) {
                case 0:
                    mpSongTwo.start();
                    playing = 1;
                    btnSongTwo.setText("Pause");
                    btnSongOne.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpSongTwo.pause();
                    playing = 0;
                    btnSongTwo.setText("Play");
                    btnSongOne.setVisibility((View.VISIBLE));
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        //define buttons
        btnSongOne = findViewById(R.id.btnPlayOne);
        btnSongTwo = findViewById(R.id.btnSongTwo);

        //set button onclick listeners
        btnSongOne.setOnClickListener(bSongOne);
        btnSongTwo.setOnClickListener(bSongTwo);

        //media players
        mpSongOne = new MediaPlayer();
        mpSongOne = MediaPlayer.create(this, R.raw.aliceinchains_brother);

        mpSongTwo = new MediaPlayer();
        mpSongTwo = MediaPlayer.create(this, R.raw.barenakedladies_theoldapartment);

        playing = 0;








    }
}
