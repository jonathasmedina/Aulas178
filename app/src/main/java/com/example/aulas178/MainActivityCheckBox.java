package com.example.aulas178;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivityCheckBox extends AppCompatActivity {

    CheckBox checkBox_1, checkBox_2, checkBox_3;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_check_box);

        checkBox_1 = findViewById(R.id.checkBox1);
        checkBox_2 = findViewById(R.id.checkBox2);
        checkBox_3 = findViewById(R.id.checkBox3);
        bt = findViewById(R.id.button1);

        checkBox_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Checkbox 1 marcado", Toast.LENGTH_SHORT).show();
            }
        });


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox_1.isChecked())
                    Toast.makeText(getApplicationContext(), "Checkbox 1 marcado", Toast.LENGTH_SHORT).show();
                if (checkBox_2.isChecked())
                    Toast.makeText(getApplicationContext(), "Checkbox 2 marcado", Toast.LENGTH_SHORT).show();
            }
        });

    }
}