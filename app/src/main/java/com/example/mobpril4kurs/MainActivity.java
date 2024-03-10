package com.example.mobpril4kurs;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

Button buttonCamera;
Button buttonTg;
Button buttonCall;
Button buttonInternet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         buttonCamera = findViewById(R.id.buttonCamera);
         buttonTg = findViewById(R.id.buttonTg);
         buttonCall = findViewById(R.id.buttonCall);
         buttonInternet = findViewById(R.id.buttonInternet);


        buttonCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, camera.class);
                startActivity(intent);            }
        });

        buttonTg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Tg.class);
                startActivity(intent);            }
        });

        buttonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, call.class);
                startActivity(intent);            }
        });

        buttonInternet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, internet.class);
                startActivity(intent);            }
        });
    }
}