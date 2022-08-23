package com.example.aulas178;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    //campo de busca
    SearchView searchView;
    //lista de itens
    ListView listView;

    ArrayList<String> arrayListItens = new ArrayList<>();
    ArrayAdapter<String> meuAdapter;
    ArrayList<String> arrayListItensCopia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        searchView = findViewById(R.id.searchView1);
        listView = findViewById(R.id.listView1);

        arrayListItens.add("CheckBox");
        arrayListItens.add("RadioButton");
        arrayListItens.add("Janela de Diálogo");
        arrayListItens.add("Spinner");
        arrayListItens.add("Calculadora 4 operações - 2 números");
        arrayListItens.add("CalendarView e TimePicker");

        arrayListItensCopia = new ArrayList<>(arrayListItens);

        //adapter: vincular arrayList com a ListView
        meuAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                arrayListItens
        );

        //...usando o adapter. Aqui a lista é atualizada/exibida
        listView.setAdapter(meuAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent intent = new Intent(
                            MainActivity2.this,
                            MainActivityCheckBox.class
                    );

                    startActivity(intent);
                }
                if (i == 1) {
                    Intent intent = new Intent(
                            MainActivity2.this,
                            MainActivityRadioButton.class
                    );

                    startActivity(intent);
                }
                if (i == 2) {
                    Intent intent = new Intent(
                            MainActivity2.this,
                            MainActivityDialogo.class
                    );

                    startActivity(intent);
                }
                if (i == 3) {
                    Intent intent = new Intent(
                            MainActivity2.this,
                            MainActivitySpinner.class
                    );

                    startActivity(intent);
                }
                if (i == 4) {
                    Intent intent = new Intent(
                            MainActivity2.this,
                            MainActivityBotoes.class
                    );

                    startActivity(intent);
                }
                if (i == 5) {
                    Intent intent = new Intent(
                            MainActivity2.this,
                            MainActivityCalendarView.class
                    );

                    startActivity(intent);
                }



            }
        });

        //expande item
        searchView.setIconified(false);
        //fecha o teclado
        searchView.clearFocus();

        //ouvinte do searchView para mudanças na digitação
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            //este método é chamado no submit
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            //este método é chamado ao digitar
            @Override
            public boolean onQueryTextChange(String s) {
                //forma 1: utilizar filter pronto (não busca letras dentro de palavras)
                //MainActivity2.this.meuAdapter.getFilter().filter(s);

                //forma 2: fazer a busca manualmente (busca letras dentro de palavras)
                //método para atualizar itens do arraylist
                 fazerBusca(s);
                //atualiza lista com arrayList alterado
                meuAdapter.notifyDataSetChanged();

                return false;
            }
        });
    }

    private void fazerBusca(String s) {
        //limpando o array
        arrayListItens.clear();

        s = s.toLowerCase();

        //percorre array de cópia com todos os itens e busca
        for (String item : arrayListItensCopia) {
            if (item.toLowerCase().contains(s)) {
                //se item encontrado, adicionada de volta no array -
                arrayListItens.add(item);
            }
        }
    }
}