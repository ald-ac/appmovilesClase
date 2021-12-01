package com.appsmoviles.ejemplohilos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvNumero, tvContador;
    Button btnIncrementar, btnP1;
    int contador = 0, i, cont;
    int[] idImagenes = {R.mipmap.an1, R.mipmap.an2, R.mipmap.an3, R.mipmap.an4, R.mipmap.an5,
            R.mipmap.an6, R.mipmap.an7, R.mipmap.an8, R.mipmap.an9, R.mipmap.an10};
    ImageView ivAnimacion;
    public void pausa(int tiempo) {
        try {
            Thread.sleep(tiempo);
        }catch (Exception e) { }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvNumero = findViewById(R.id.textView);
        btnIncrementar = findViewById(R.id.button);
        btnP1 = findViewById(R.id.button2);
        tvContador = findViewById(R.id.textView2);
        ivAnimacion = findViewById(R.id.iv_animacion);

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
                        pausa(10000);
                        //Implementar hilo para manipular UI porque android no permite
                        //usarlo por otro hilo directamente
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(getApplicationContext(), "Proceso terminado", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                }); //Aqui termina declaracion de hilo

                hiloProceso1.start();
            }
        });

        tvContador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Thread hiloContador = new Thread(new Runnable() {
                    @Override
                    public void run() {

                        for(i=0; i <= 10; i++) {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    tvContador.setText(""+i);
                                }
                            });
                            pausa(1000);
                        }
                    }
                });

                hiloContador.start();
            }
        });

        ivAnimacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Thread animacion = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        cont = 0;
                        while(true) {
                            runOnUiThread(new Runnable() { //Modificar resource de iv
                                @Override
                                public void run() {
                                    ivAnimacion.setImageResource(idImagenes[cont]);
                                }
                            });
                            cont = (cont == 9) ? 0 : cont+1;
                            System.out.println(cont);
                            pausa(100);
                        }
                    }
                });
                animacion.start();
            }
        });
    }
}