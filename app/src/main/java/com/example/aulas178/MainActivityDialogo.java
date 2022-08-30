package com.example.aulas178;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.content.DialogInterface;
import android.content.Intent;
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
                AlertDialog.Builder janela = new AlertDialog.Builder(MainActivityDialogo.this);
                janela.setTitle("Título");
                janela.setMessage("Mensagem da janela");
                janela.setIcon(R.drawable.ic_eye);
                //janela.setNeutralButton("Botão ok", null);
                janela.setPositiveButton("Botão de ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //implementar - voltar para primeira tela
                    }
                });
                janela.setNegativeButton("Botão de Cancelar", null);
                janela.show();
            }
        });
    }
}