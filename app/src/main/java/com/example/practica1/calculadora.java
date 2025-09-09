package com.example.practica1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Color;

import androidx.appcompat.app.AppCompatActivity;

public class calculadora  extends AppCompatActivity implements View.OnClickListener{

    private Button b,b1,b2,b3;

    private TextView t;

    private EditText e, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        b = (Button) findViewById(R.id.button6);
        b1 = (Button) findViewById(R.id.button7);
        b2 = (Button) findViewById(R.id.button8);
        b3 = (Button) findViewById(R.id.button9);
        t = (TextView) findViewById(R.id.textView9);
        e = (EditText) findViewById(R.id.editTextText5);
        e2 = (EditText) findViewById(R.id.editTextText6);

        b.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
            String numero = e.getText().toString();
            String numero2 = e2.getText().toString();
            //lo convertimos a un entero usando parseInt
            float n1 = Float.parseFloat(numero);
            float n2 = Float.parseFloat(numero2);

            //Suma
            if(view.getId() == R.id.button6){
                t.setText("Resultado = "+(n1+n2));
                t.setTextColor(Color.parseColor("#4CAF50"));
            }

            //Resta
            else if(view.getId() == R.id.button7){
                t.setTextColor(Color.parseColor("#4CAF50"));
                t.setText("Resultado = "+(n1-n2));
            }

            //Multiplicacion
            else if(view.getId() == R.id.button8){
                t.setTextColor(Color.parseColor("#4CAF50"));
                t.setText("Resultado = "+(n1*n2));
            }


            //Division
            else if(view.getId() == R.id.button9){
                if (n2 == 0){
                    t.setText("No se puede dividir entre 0");
                    //cambio el color a rojo
                    t.setTextColor(Color.parseColor("#FF0000"));
                }
                else{
                    t.setTextColor(Color.parseColor("#4CAF50"));
                    t.setText("Resultado = "+(n1/n2));
                }
            }

        }


    }

