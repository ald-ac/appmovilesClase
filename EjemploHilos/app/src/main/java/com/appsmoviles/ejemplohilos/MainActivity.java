package com.appsmoviles.ejemplohilos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvNumero;
    Button btnIncrementar, btnP1;
    int contador = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNumero = findViewById(R.id.textView);
        btnIncrementar = findViewById(R.id.button);
        btnP1 = findViewById(R.id.button2);

        btnIncrementar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvNumero.setText(""+contador);
                contador++;
            }
        });

        btnP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Thread hiloProceso1 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(10000);
                        }catch (Exception e) { }
                    }
                }); //Aqui termina declaracion de hilo

                hiloProceso1.start();
                //Toast.makeText(getApplicationContext(), "Proceso terminado", Toast.LENGTH_SHORT).show();
            }
        });
    }
}