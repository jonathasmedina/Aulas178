package com.example.aulas178;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivityBotoes
        extends AppCompatActivity implements View.OnClickListener     {

    Button bt1, bt2, bt3, bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_botoes);

        bt1 = findViewById(R.id.button1Acao);
        bt2 = findViewById(R.id.button2Acao);
        bt3 = findViewById(R.id.button3Acao);
        bt4 = findViewById(R.id.button4Acao);

        //forma 1:
        /*bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Forma de ação 1",
                        Toast.LENGTH_SHORT).show();
            }
        });*/

        //forma 2:
        //bt2.setOnClickListener(mOuvinte);

        //forma 4:
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
    }

    //forma 3:
    /*public void funcao(View v){
        Toast.makeText(getApplicationContext(),
                "Ação forma 3",
                Toast.LENGTH_SHORT).show();
    }*/

    /*View.OnClickListener mOuvinte = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(getApplicationContext(),
                    "Ação forma 2",
                    Toast.LENGTH_SHORT).show();
        }
    };*/

    //forma 4: implementando a OnClickListener e o método onClick
    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button1Acao){
            Toast.makeText(getApplicationContext(),
                    "ação forma 4 - botão 1",
                    Toast.LENGTH_SHORT).show();
        }
        if (view.getId() == R.id.button2Acao){
            Toast.makeText(getApplicationContext(),
                    "ação forma 4 - botão 2",
                    Toast.LENGTH_SHORT).show();
        }
    }
}