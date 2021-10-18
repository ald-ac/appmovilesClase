package com.appsmoviles.circulos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import geometria.figurasplanas.Circulo;

public class MainActivity extends AppCompatActivity {

    TextView tv_res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referenciando
        tv_res = findViewById(R.id.resultado);

        //Calculos
        tv_res.setText("Radio   " + "Area   " + "Perimetro");
        Circulo circulo = new Circulo();

        for (double r=0; r <= 100; r+=0.5) {
            circulo.setRadio(r);
            double area = circulo.area();
            double perimetro = circulo.perimetro();

            tv_res.append(String.format("\n%.2f\t %.4f\t %.4f", r, area, perimetro));
        }
    }
}