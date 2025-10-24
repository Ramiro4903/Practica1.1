package com.example.practica1;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class bases_datos extends AppCompatActivity {

    EditText Enombre, Eapellido;
    Button guardar, buscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Enombre = (EditText) findViewById(R.id.nombre);
        Eapellido = (EditText) findViewById(R.id.apellido);
        guardar = (Button) findViewById(R.id.guardar);
        buscar = (Button) findViewById(R.id.buscar);

        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DB db = new DB(getApplicationContext(), null, null, 1);
                String nombre = Enombre.getText().toString();
                String apellido = Eapellido.getText().toString();
                String mensaje = db.guardar(nombre,apellido);
                Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_SHORT).show();
            }
        });

        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bases_datos.this, buscar_eliminear_actualizar.class);
                startActivity(intent);
            }
        });
    }
}
