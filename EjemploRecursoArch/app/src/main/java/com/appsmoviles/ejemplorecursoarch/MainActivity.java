package com.appsmoviles.ejemplorecursoarch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    TextView tvArchivo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvArchivo = findViewById(R.id.textView);
        try {
            InputStream flujo = getResources().openRawResource(R.raw.datos);
            InputStreamReader lector = new InputStreamReader(flujo);
            BufferedReader buffer = new BufferedReader(lector);

            //Comprobar que existe una linea cuando menos
            String linea = buffer.readLine();
            while(linea != null) {
                String[] campos = linea.split(":");
                String nombre = campos[0];
                double altura = Double.parseDouble(campos[1]);
                int peso = Integer.parseInt(campos[2]);
                String procedencia = campos[3];
                double imc = peso/(altura*altura);

                tvArchivo.append("\n" + nombre + " de " + procedencia + "-> IMC:" + String.format("%.2f", imc));
                linea = buffer.readLine();
            }

            //Cerrar flujos
            buffer.close();
            lector.close();
            flujo.close();
        }catch (Exception e) {
            tvArchivo.setText("Error: " + e.getMessage());
        }
    }
}