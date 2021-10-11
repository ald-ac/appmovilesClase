package com.appsmoviles.enviandovalores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ReceptoraActivity extends AppCompatActivity {

    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receptora);

        tvResultado = findViewById(R.id.textView);
        Bundle bolsa = getIntent().getExtras();
        String nombre = bolsa.getString("nombre");
        int edad = bolsa.getInt("edad");
        Double peso = bolsa.getDouble("peso");

        tvResultado.setText("Nombre: " + nombre + "\n Edad: " + edad + "\n Peso: " + peso);
    }
}