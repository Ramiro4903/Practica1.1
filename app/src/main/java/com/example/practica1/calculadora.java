package com.example.practica1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class calculadora  extends AppCompatActivity implements View.OnClickListener{

    private Button b;

    private TextView t;

    private EditText e, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        b = (Button) findViewById(R.id.button6);
        t = (TextView) findViewById(R.id.textView9);
        e = (EditText) findViewById(R.id.editTextText5);
        e2 = (EditText) findViewById(R.id.editTextText6);

        b.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String numero = e.getText().toString();
        String numero2 = e2.getText().toString();

        //lo convertimos a un entero usando parseInt
        int n1 = Integer.parseInt(numero);
        int n2 = Integer.parseInt(numero2);

        t.setText("Resultado = "+(n1 + n2));
    }
}
