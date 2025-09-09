package com.example.practica1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
        b3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button6){
            String numero = e.getText().toString();
            String numero2 = e2.getText().toString();

            //lo convertimos a un entero usando parseInt
            int n1 = Integer.parseInt(numero);
            int n2 = Integer.parseInt(numero2);

            t.setText("Resultado = "+(n1 + n2));
        }
        //Modificar else if por un switch para que funcionen todos los botones
        //Y no dividir entre 0
        //Y en la division parse float
        else if(view.getId() == R.id.button7){
            String numero = e.getText().toString();
            String numero2 = e2.getText().toString();

            //lo convertimos a un entero usando parseInt
            int n1 = Integer.parseInt(numero);
            float n2 = Float.parseFloat(numero2);

            t.setText("Resultado = "+(n1 - n2));
        }

    }

}
