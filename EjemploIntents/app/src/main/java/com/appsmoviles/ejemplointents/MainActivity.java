package com.appsmoviles.ejemplointents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvAzul, tvVerde, tvRoja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAzul = findViewById(R.id.textView);
        tvVerde = findViewById(R.id.textView2);
        tvRoja = findViewById(R.id.textView3);

        tvAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAzul = new Intent(getApplicationContext(), AzulActivity.class);
                startActivity(intentAzul);
            }
        });

        tvVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVerde = new Intent(getApplicationContext(), VerdeActivity.class);
                startActivity(intentVerde);
            }
        });

        tvRoja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentRoja = new Intent(getApplicationContext(), RojaActivity.class);
                startActivity(intentRoja);
            }
        });
    }
}