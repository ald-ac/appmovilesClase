package com.appsmoviles.raizcuadrada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etNumero;
    private TextView tvResultado;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalcular = findViewById(R.id.button);
        etNumero = findViewById(R.id.editTextTextPersonName);
        tvResultado = findViewById(R.id.textView2);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double numero = Double.parseDouble(etNumero.getText().toString());
                    double raiz = Math.sqrt(numero);
                    tvResultado.setText(String.format("Resultado: %.4f",raiz));
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Eror en la captura", Toast.LENGTH_LONG).show();
                }
            }
        });

        tvResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNumero.setText("");
                tvResultado.setText("Resultado:");
            }
        });
    }
}