package com.example.practica1;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class inicio extends AppCompatActivity implements View.OnClickListener {
    private Button b;
    private Button b2;
    private TextView t;

    private Button b3;
    private Button b4;

    private ImageView i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_inicio);

        b = (Button) findViewById(R.id.button);
        t = (TextView) findViewById(R.id.textView2);
        i = (ImageView) findViewById(R.id.imageView2);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);

        b.setOnClickListener(this);
        b2.setOnClickListener(this);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   Toast.makeText(inicio.this, "Vas a Inicio", Toast.LENGTH_SHORT).show();
                   Intent intent = new Intent(inicio.this, MainActivity.class);
                   startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(inicio.this, Web.class);
                startActivity(intent);
            }
        });



    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button){
            t.setText("Mario ya chambea");
            i.setImageResource(R.drawable.ya_chambea);
        }
        else if(v.getId() == R.id.button2){
            t.setText("Mario se dio de baja");
            i.setImageResource(R.drawable.baja);
        }
    }


}

