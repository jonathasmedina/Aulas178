package com.example.aulas178;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class MainActivityCalendarView extends AppCompatActivity {

    CalendarView calendar1;
    Button exibeTimePickerButton;
    int hora, minuto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calendar_view);

        calendar1 = findViewById(R.id.calendarView1);
        exibeTimePickerButton = findViewById(R.id.buttonTimePicker);

        exibeTimePickerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(
                        MainActivityCalendarView.this,
                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker timePicker, int i, int i1) {
                                hora = i;
                                minuto = i;
                                exibeTimePickerButton.setText(
                                        String.format(Locale.getDefault(),
                                        "%02d:%02d",
                                        hora,
                                        minuto
                                ));
                            }
                        },
                        hora,
                        minuto,
                        true
                );
                timePickerDialog.setTitle("Horas");
                timePickerDialog.show();
            }
        });



        calendar1.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                Calendar dataSelecionada = new GregorianCalendar(i, i1, i2);

                Toast.makeText(getApplicationContext(),
                        dataSelecionada.getTime().toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });

    }

}