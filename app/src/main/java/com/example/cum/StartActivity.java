package com.example.cum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button10 = findViewById(R.id.button10);


        button1.setOnClickListener(view -> {
            startActivity(new Intent(StartActivity.this, ExerciseActivity1.class));
        });
        button2.setOnClickListener(view -> {
            startActivity(new Intent(StartActivity.this, ExerciseActivity2.class));
        });
        button3.setOnClickListener(view -> {
            startActivity(new Intent(StartActivity.this, ExerciseActivity3.class));
        });
        button4.setOnClickListener(view -> {
            startActivity(new Intent(StartActivity.this, ExerciseActivity4.class));
        });
        button5.setOnClickListener(view -> {
            startActivity(new Intent(StartActivity.this, ExerciseActivity5.class));
        });
        button6.setOnClickListener(view -> {
            startActivity(new Intent(StartActivity.this, ExerciseActivity6.class));
        });
        button7.setOnClickListener(view -> {
            startActivity(new Intent(StartActivity.this, ExerciseActivity7.class));
        });
        button8.setOnClickListener(view -> {
            startActivity(new Intent(StartActivity.this, ExerciseActivity8.class));
        });
        button9.setOnClickListener(view -> {
            startActivity(new Intent(StartActivity.this, ExerciseActivity9.class));
        });
        button10.setOnClickListener(view -> {
            startActivity(new Intent(StartActivity.this, ExerciseActivity10.class));
        });

    }
}