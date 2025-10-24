package com.example.practica1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class buscar_eliminear_actualizar extends AppCompatActivity {

    EditText Ebuscar;
    TextView nombre, apellido;
    Button buscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_eliminear_actualizar);
        Ebuscar = (EditText) findViewById(R.id.Ebuscar);
        nombre = (TextView) findViewById(R.id.nombre);
        apellido = (TextView) findViewById(R.id.apellido);
        buscar = (Button) findViewById(R.id.buscar);


        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DB db = new DB(getApplicationContext(), null, null,1 );
                String buscar = Ebuscar.getText().toString();
                String[] datos;
                datos = db.buscar_reg(buscar);
                nombre.setText(datos[0]);
                apellido.setText(datos[1]);
                toast.makeText(getApplicationContext(), datos[2], Toast.LENGTH_SHORT);
            }
        });

    }
}
