package com.example.aulas178;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivityRadioButton extends AppCompatActivity {

    RadioGroup radioGroup;
    Button bt;
    String texto = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_radio_button);

        radioGroup  = findViewById(R.id.radioGroup);
        bt  = findViewById(R.id.button);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (radioGroup.getCheckedRadioButtonId()){
                    case R.id.radioButton1:
                        Toast.makeText(getApplicationContext(), "Opção 1", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton2:
                        Toast.makeText(getApplicationContext(), "Opção 2", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton3_:
                        Toast.makeText(getApplicationContext(), "Opção 3", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (radioGroup.getCheckedRadioButtonId()){
                    case R.id.radioButton1:
                        texto = "RadioButton 1 checado";
                        break;
                    case R.id.radioButton2:
                        texto = "RadioButton 2 checado";
                        break;
                    case R.id.radioButton3_:
                        texto = "RadioButton 3 checado";
                        break;
                }
                Toast.makeText(getApplicationContext(), texto, Toast.LENGTH_SHORT).show();
            }
        });
    }
}