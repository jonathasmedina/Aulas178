package com.example.aulas178;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivityIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_intent);

        Intent i = getIntent();

        String nome_recebido = (String) i.getSerializableExtra("nome_");

        Toast.makeText(getApplicationContext(),
                nome_recebido,
                Toast.LENGTH_SHORT).show();

    }
}