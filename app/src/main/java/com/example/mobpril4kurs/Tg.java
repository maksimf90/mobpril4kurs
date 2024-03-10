package com.example.mobpril4kurs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.URLEncoder;

public class Tg extends AppCompatActivity {
    private EditText editTextTg;
    Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tg);

        editTextTg = findViewById(R.id.editTextTg);
    }

    public void SendTg(View view) {
        String message = editTextTg.getText().toString();
        shareTextToTelegram(message);
    }

    public void shareTextToTelegram(String message) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, message);
        intent.setPackage("org.telegram.messenger"); // Укажите пакетное имя приложения Telegram
        startActivity(Intent.createChooser(intent, "Отправить через"));


        buttonBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Tg.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}