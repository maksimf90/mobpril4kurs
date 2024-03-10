package com.example.mobpril4kurs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class internet extends AppCompatActivity {

     WebView webView;
     EditText editText;
     Button button;
     Button buttonBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internet);

        webView = findViewById(R.id.webView);
        editText = findViewById(R.id.editTextText);
        button = findViewById(R.id.button);
        buttonBack = findViewById(R.id.buttonBack);

        webView.setWebViewClient(new WebViewClient());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String query = editText.getText().toString();
                String url = "https://www.google.com/search?q=" + query;

                webView.loadUrl(url);
            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(internet.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}