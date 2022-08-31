package com.example.aulas178;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivityChips extends AppCompatActivity {

    Chip ch1, ch3;
    ChipGroup chipGroup;
    Button bt;
    TextView textView;
    String texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_chips);

        ch1 = findViewById(R.id.chip1);
        ch3 = findViewById(R.id.chip3);
        chipGroup  = findViewById(R.id.chipGroup1);
        bt  = findViewById(R.id.buttonChip);
        textView  = findViewById(R.id.textViewChip);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                texto = "";
                List<Integer> listIds = chipGroup.getCheckedChipIds();

                ArrayList<Chip> arrayListChip = new ArrayList<>();

                for(Integer idItem: listIds){
                    Chip chip = chipGroup.findViewById(idItem);
                    arrayListChip.add(chip);
                }

                //exibir chips marcados:
                for(Chip chipItem: arrayListChip){
                    texto = texto + chipItem.getText().toString();
                }
                textView.setText(texto);
            }
        });

        ch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
               if(b){
                   String texto = ch1.getText().toString();
                   //Toast.makeText(getApplicationContext(),texto + " on.",Toast.LENGTH_SHORT).show();
               }
                else{
                   String texto = ch1.getText().toString();
                   //Toast.makeText(getApplicationContext(),texto + "OFF",Toast.LENGTH_SHORT).show();
               }
            }
        });

        //fechando um chip do tipo Entry
        ch3.setOnCloseIconClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chipGroup.removeView(ch3);
            }
        });

    }
}