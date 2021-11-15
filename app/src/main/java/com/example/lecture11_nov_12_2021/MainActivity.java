package com.example.lecture11_nov_12_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater inflater= getLayoutInflater();
        View my_layout= inflater.inflate(R.layout.my_layout,(ViewGroup)findViewById(R.id.dialog_container));
        ImageView camImage= my_layout.findViewById(R.id.imageView);
        camImage.setImageResource(R.drawable.ic_launcher_background);
        TextView msg= (TextView) my_layout.findViewById(R.id.textView);
        msg.setText("Custom toast created");
        Toast t= new Toast(getApplicationContext());
        t.setDuration(Toast.LENGTH_LONG);
        t.setView(my_layout);
        t.show();

    }
}