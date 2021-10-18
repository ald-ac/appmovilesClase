package com.appsmoviles.ejemplocheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvSeleccion;
    Button btnSeleccionar;
    CheckBox checkBox[] = new CheckBox[4];
    int ids[] = { R.id.checkBox, R.id.checkBox2, R.id.checkBox3, R.id.checkBox4 } ;
    String paises[] = { "Alemania", "Argentina", "Nigeria", "Japon" };
    String capitales[] = { "Berlín", "Buenos aires", "Abuya", "Tokio" };
    int delegados[] = { 25, 15, 10, 30};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSeleccion = findViewById(R.id.textView2);
        btnSeleccionar = findViewById(R.id.button);
        for(int i=0; i < checkBox.length; i++) checkBox[i] = findViewById(ids[i]);

        btnSeleccionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mensaje = "";
                int numDelegados=0;
                for (int i=0; i < checkBox.length; i++) {
                    if(checkBox[i].isChecked()) {
                        mensaje+=capitales[i]+"(" + delegados[i] + ")\n";
                        numDelegados+=delegados[i];
                    }
                }
                mensaje+= "Total: " + numDelegados;

                tvSeleccion.setText(mensaje);
            }
        });
    }
}