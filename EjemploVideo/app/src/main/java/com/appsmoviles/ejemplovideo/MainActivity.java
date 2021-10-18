package com.appsmoviles.ejemplovideo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView vv1;
    Button btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String loc1 = "android.resource://"+getPackageName()+"/"+R.raw.minions,
                loc2 = "android.resource://"+getPackageName()+"/"+R.raw.pelea;
        getSupportActionBar().hide();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        vv1 = findViewById(R.id.videoView);
        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);

        vv1.setMediaController(new MediaController(this));

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vv1.setVideoURI(Uri.parse(loc1));
                vv1.start();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vv1.setVideoURI(Uri.parse(loc2));
                vv1.start();
            }
        });
    }
}