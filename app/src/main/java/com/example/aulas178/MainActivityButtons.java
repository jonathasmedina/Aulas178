package com.example.aulas178;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivityButtons extends AppCompatActivity {

    ImageButton imageButton_;
    FloatingActionButton floatingActionButton_;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_buttons);

        imageButton_ = findViewById(R.id.imageButton);
        floatingActionButton_ = findViewById(R.id.floatingActionButton);

        floatingActionButton_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Clicado",
                        Toast.LENGTH_SHORT).show();
            }
        });

        imageButton_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Clicado",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}