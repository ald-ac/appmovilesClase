package com.appsmoviles.contador;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button btnBaja, btnSube;
    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView);
        btnBaja = findViewById(R.id.button);
        btnSube = findViewById(R.id.button2);

        btnBaja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador = (contador == 0) ? 0 : contador-1;
                tv.setText(""+contador);
            }
        });

        btnSube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador = (contador == 10) ? 10 : contador+1;
                tv.setText(""+contador);
            }
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("contador",contador);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        contador = savedInstanceState.getInt("contador");
        tv.setText(""+contador);
    }
}