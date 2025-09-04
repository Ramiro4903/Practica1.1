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

    private EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);
        b = (Button) findViewById(R.id.button5);
        t = (TextView) findViewById(R.id.textView4);
        e = (EditText) findViewById(R.id.editTextText3);

        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String user = e.getText().toString();
        e.setText("Hola "+user);
    }
}
