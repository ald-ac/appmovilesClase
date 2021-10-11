package com.appsmoviles.ejemplospinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spFrutas;
    TextView tvSeleccion;
    Button btnSeleccion;
    String[] frutas = { "Mango","Fresa", "Uva", "Pera", "Manzana", "Mandarina", "Kiwi" };

    ArrayAdapter<String> adFrutas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSeleccion = findViewById(R.id.textView);
        btnSeleccion = findViewById(R.id.button);
        spFrutas = findViewById(R.id.spinner);

        adFrutas = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, frutas);
        spFrutas.setAdapter(adFrutas);

        btnSeleccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String frutaSeleccionada = spFrutas.getSelectedItem().toString();
                tvSeleccion.setText(frutaSeleccionada);
                tvSeleccion.append("\n" + spFrutas.getSelectedItemPosition());
            }
        });
    }
}