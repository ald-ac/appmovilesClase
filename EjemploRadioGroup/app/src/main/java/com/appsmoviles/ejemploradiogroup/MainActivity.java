package com.appsmoviles.ejemploradiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvTitulo;
    RadioGroup rgColor;
    Button btnSeleccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitulo = findViewById(R.id.textView);
        rgColor = findViewById(R.id.radioGroup);
        btnSeleccion = findViewById(R.id.button);

        btnSeleccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int idSel = rgColor.getCheckedRadioButtonId();
                switch (idSel) {
                    case R.id.r0:
                        tvTitulo.setText("Azul");
                        tvTitulo.setTextColor(Color.BLUE);
                        break;
                    case R.id.r1:
                        tvTitulo.setText("Rojo");
                        tvTitulo.setTextColor(Color.RED);
                        break;
                    case R.id.r2:
                        tvTitulo.setText("Verde");
                        tvTitulo.setTextColor(Color.GREEN);
                        break;
                    case R.id.r3:
                        tvTitulo.setText("Amarillo");
                        tvTitulo.setTextColor(Color.YELLOW);
                        break;
                }
            }
        });
    }
}