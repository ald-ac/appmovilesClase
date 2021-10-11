package com.appsmoviles.ejemplomusica;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView iPlay, iStop, iExit;
    MediaPlayer mp = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iPlay = findViewById(R.id.imageView);
        iStop = findViewById(R.id.imageView2);
        iExit = findViewById(R.id.imageView3);

        iPlay.setEnabled(true);
        iStop.setEnabled(false);
        iExit.setEnabled(true);

        iPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iPlay.setEnabled(false);
                iStop.setEnabled(true);
                iExit.setEnabled(false);
                mp = MediaPlayer.create(getApplicationContext(), R.raw.crazylittle);
                mp.start();
            }
        });

        iStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iPlay.setEnabled(true);
                iStop.setEnabled(false);
                iExit.setEnabled(true);
                mp.stop();
            }
        });

        iExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Hasta luego", Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}