package com.example.aulas178;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivityButtons extends AppCompatActivity {

    ImageButton imageButton_;
    FloatingActionButton floatingActionButton_;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_buttons);

        imageButton_ = findViewById(R.id.imageButton);
        floatingActionButton_ = findViewById(R.id.floatingActionButton);
        textView = findViewById(R.id.textView2);

        textView.setText(" aklsdjhfaksjd hfalkd jshflak jshdf lkajshfd lkajhsdf \" +\n" +
                "                \"lkjahsd flkjahsd flkjha sdlkfjh alskjdhf lakjsdhf lakjsdhf \" +\n" +
                "                \"lkajshdf asd f  sdaklsdjhfaksjd hfalkd jshflak jshdf lkajshfd lkajhsdf \" +\n" +
                "                \"lkjahsd flkjahsd flkjha sdlkfjh alskjdhf lakjsdhf lakjsdhf \" +\n" +
                "                \"lkajshdf asd f  sdaklsdjhfaksjd hfalkd jshflak jshdf lkajshfd lkajhsdf \" +\n" +
                "                \"lkjahsd flkjahsd flkjha sdlkfjh alskjdhf lakjsdhf lakjsdhf \" +\n" +
                "                \"lkajshdf asd f  sdaklsdjhfaksjd hfalkd jshflak jshdf lkajshfd lkajhsdf \" +\n" +
                "                \"lkjahsd flkjahsd flkjha sdlkfjh alskjdhf lakjsdhf lakjsdhf \" +\n" +
                "                \"lkajshdf asd f  sdaklsdjhfaksjd hfalkd jshflak jshdf lkajshfd lkajhsdf \" +\n" +
                "                \"lkjahsd flkjahsd flkjha sdlkfjh alskjdhf lakjsdhf lakjsdhf \" +\n" +
                "                \"lkajshdf asd f  sdaklsdjhfaksjd hfalkd jshflak jshdf lkajshfd lkajhsdf \" +\n" +
                "                \"lkjahsd flkjahsd flkjha sdlkfjh alskjdhf lakjsdhf lakjsdhf \" +\n" +
                "                \"lkajshdf asd f  sdfkj hsdkf jhs kdjfh sdf sdf sd fsd fsd fs df sdf sdf sfd sdf sdfs skjfdh skjdfh ksjd hfksjh d");

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