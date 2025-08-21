package com.example.practica1;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread thread = new Thread(){
            @Override
            public void run()
            {
                try {
                    sleep(3000);
                }

                catch (InterruptedException e){e.printStackTrace();}
                finally {
                    Intent intent = new Intent(MainActivity.this,inicio.class);
                    startActivity(intent);
                    finish();
                }
            }
        }; thread.start();

    }
}