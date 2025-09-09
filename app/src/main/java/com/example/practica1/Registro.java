package com.example.practica1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Registro  extends AppCompatActivity implements View.OnClickListener {
    private Button b;

    private  TextView t;
    private TextView t2;

    private EditText e;

    private EditText e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);
        b = (Button) findViewById(R.id.button5);
        t = (TextView) findViewById(R.id.textView4);
        e = (EditText) findViewById(R.id.editTextText3);
        e2 = (EditText) findViewById(R.id.editTextText4);
        t2 = (TextView) findViewById(R.id.textView6);

        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        // cacha y convierte en texto utilizable lo del edit text 2
        String user = e.getText().toString();
        String pass = e2.getText().toString();
        //muestra en edit text 2 la variable user

        if("admin".equals(user) && "admin".equals(pass)){
            t2.setText("Hola "+user);
        }else {
            t2.setText("Datos incorrectos");
        }
        }

    }

