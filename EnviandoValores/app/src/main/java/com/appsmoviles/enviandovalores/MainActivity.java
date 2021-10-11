package com.appsmoviles.enviandovalores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etNombre, etEdad, etPeso;
    Button btnEnviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = findViewById(R.id.editTextNombre);
        etEdad = findViewById(R.id.editTextEdad);
        etPeso = findViewById(R.id.editTextPeso);
        btnEnviar = findViewById(R.id.button);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = etNombre.getText().toString();
                int edad = Integer.parseInt(etEdad.getText().toString());
                Double peso = Double.parseDouble(etEdad.getText().toString());

                //Bolsa que contiene todos los valores para enviarlos juntos
                Bundle bolsa = new Bundle();
                bolsa.putString("nombre", nombre);
                bolsa.putInt("edad", edad);
                bolsa.putDouble("peso", peso);

                Intent intentReceptora = new Intent(getApplicationContext(), ReceptoraActivity.class);
                intentReceptora.putExtras(bolsa); //Enviando bolsa con valores
                startActivity(intentReceptora);
            }
        });
    }
}