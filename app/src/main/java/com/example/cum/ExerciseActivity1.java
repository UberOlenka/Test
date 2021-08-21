package com.example.cum;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class ExerciseActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1);
        Random rnd = new Random();

//      Находим View
        Button buttonKnopka = findViewById(R.id.buttonKnopka);
        TextView textVitalya = findViewById(R.id.textVitalya);

//      Меняем текст при нажатии на кнопку
        buttonKnopka.setOnClickListener(view -> {
            int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
            int color2 = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
            textVitalya.setText("Говно собачье");
            buttonKnopka.setText("Лобок");
            buttonKnopka.setBackgroundColor(color);
            textVitalya.setTextColor(color2);

        });



    }
}

