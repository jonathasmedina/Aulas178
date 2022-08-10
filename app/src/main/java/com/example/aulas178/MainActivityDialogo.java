package com.example.aulas178;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivityDialogo extends AppCompatActivity {

    Button btDiag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dialogo);

        btDiag = findViewById(R.id.buttonDiag);

        btDiag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder janelaDiag = new AlertDialog.Builder(getApplicationContext());
                janelaDiag.setTitle("Título");
                janelaDiag.setMessage("Mensagem da janela");
                janelaDiag.setPositiveButton("Ok", null);
                janelaDiag.setNegativeButton("Cancelar", null);

                janelaDiag.show();
            }
        });
    }
}