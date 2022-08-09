package com.example.aulas178;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    SearchView searchView;
    ListView listView;

    ArrayList<String> arrayListItens = new ArrayList<>();
    ArrayAdapter<String> meuAdapter;
    ArrayList<String> arrayListItensCopia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        searchView  = findViewById(R.id.searchView1);
        listView  = findViewById(R.id.listView1);


        arrayListItens.add("Item 1");
        arrayListItens.add("Item 2");
        arrayListItens.add("Item 3");
        arrayListItens.add("Item 4");
        arrayListItens.add("Item 5");

        arrayListItensCopia = new ArrayList<>(arrayListItens);

        meuAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                arrayListItens
        );

        listView.setAdapter(meuAdapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {

                fazerBusca(s);
                meuAdapter.notifyDataSetChanged();


                return false;
            }
        });


    }

    private void fazerBusca(String s) {
        //limpando o array
        arrayListItens.clear();

        s = s.toLowerCase();

        for(String item: arrayListItensCopia){
            if(item.toLowerCase().contains(s)){
                arrayListItens.add(item);
            }
        }

    }
}