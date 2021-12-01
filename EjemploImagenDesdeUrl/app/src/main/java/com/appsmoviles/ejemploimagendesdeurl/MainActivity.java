package com.appsmoviles.ejemploimagendesdeurl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = findViewById(R.id.imageView);

        String url = "http://huasteco.tiburcio.mx/~dam17090994/rem.jpeg";

        Picasso.get().load(url).into(iv);
    }
}