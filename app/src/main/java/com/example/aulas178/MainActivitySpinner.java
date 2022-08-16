package com.example.aulas178;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivitySpinner extends AppCompatActivity {

    Button bt;
    Spinner spinner;
    ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_spinner);

        bt = findViewById(R.id.buttonSpinner);
        spinner = findViewById(R.id.spinner);

        arrayList.add("Opção 1");
        arrayList.add("Opção 2");
        arrayList.add("Opção 3");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                arrayList
        );

        spinner.setAdapter(arrayAdapter);
        spinner.setSelection(0, false);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selecionado = spinner.getSelectedItem().toString();
                Toast.makeText(getApplicationContext(), "Selecionado:" + selecionado, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selecionado = spinner.getSelectedItem().toString();

                Toast.makeText(getApplicationContext(), "Selecionado:" + selecionado, Toast.LENGTH_SHORT).show();

            }
        });
    }
}