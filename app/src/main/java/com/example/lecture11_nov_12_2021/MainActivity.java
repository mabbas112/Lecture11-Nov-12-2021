package com.example.lecture11_nov_12_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast toast= Toast.makeText(this,"First toast created", Toast.LENGTH_LONG);
        toast.show();

    }
}