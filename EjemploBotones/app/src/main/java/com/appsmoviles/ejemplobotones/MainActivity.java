package com.appsmoviles.ejemplobotones;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {
    TextView tv;
    Button btnAzul, btnRojo, btnVerde, btnMagenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView);
        btnAzul = findViewById(R.id.button);
        btnRojo = findViewById(R.id.button2);
        btnVerde = findViewById(R.id.button3);
        btnMagenta = findViewById(R.id.button4);

        btnAzul.setOnClickListener(this);
        btnRojo.setOnClickListener(this);
        btnVerde.setOnClickListener(this);
        btnMagenta.setOnClickListener(this);
        tv.setOnClickListener(this);

        tv.setOnLongClickListener(this);
        btnAzul.setOnLongClickListener(this);
        btnRojo.setOnLongClickListener(this);
        btnVerde.setOnLongClickListener(this);
        btnMagenta.setOnLongClickListener(this);;
    }

    @Override
    public void onClick(View v) {
        int idV = v.getId();
        switch (idV) {
            case R.id.button:
                tv.setText("AZUL");
                tv.setTextColor(Color.BLUE);
                break;
            case R.id.button2:
                tv.setText("ROJO");
                tv.setTextColor(Color.RED);
                break;
            case R.id.button3:
                tv.setText("VERDE");
                tv.setTextColor(Color.GREEN);
                break;
            case R.id.button4:
                tv.setText("MAGENTA");
                tv.setTextColor(Color.MAGENTA);
                break;
            case R.id.textView:
                tv.setText("COLOR");
                tv.setTextColor(Color.BLACK);
                break;
        }
    }

    @Override
    public boolean onLongClick(View v) {
        int idV = v.getId();
        switch (idV) {
            case R.id.textView:
                finish();
                break;
            case R.id.button:
                btnAzul.setTextColor(Color.BLUE);
                break;
            case R.id.button2:
                btnRojo.setTextColor(Color.RED);
                break;
            case R.id.button3:
                btnVerde.setTextColor(Color.GREEN);
                break;
            case R.id.button4:
                btnMagenta.setTextColor(Color.MAGENTA);
                break;
        }
        return true;
    }
}