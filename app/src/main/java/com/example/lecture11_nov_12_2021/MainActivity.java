package com.example.lecture11_nov_12_2021;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String [] Colors = {"Red", "Green", "Blue"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // Toast.makeText(getApplicationContext(),"Toast created", Toast.LENGTH_LONG).show();
        //NOw creating a custom toast
        LayoutInflater lf= getLayoutInflater();
        View mylayout= lf.inflate(R.layout.my_layout,(ViewGroup) findViewById(R.id.dialog_container));
        ImageView img= mylayout.findViewById(R.id.imageView);
        img.setImageResource(R.drawable.ic_launcher_background);
        TextView tv= mylayout.findViewById(R.id.textView);
        tv.setText("My custom toast");
        Toast t=new Toast(this);
        t.setView(mylayout);
        t.setDuration(Toast.LENGTH_LONG);
        t.show();



    }
    public void showDialog(View view){
        AlertDialog.Builder b=new AlertDialog.Builder(MainActivity.this);
        /*b.setMessage("Do you want to exit? ");
        b.setTitle("ALERT!");
        b.setCancelable(false);
        b.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        b.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });*/
        b.setTitle("Colors");
        b.setItems(Colors, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,Colors[i],Toast.LENGTH_LONG).show();
            }
        });
        AlertDialog alertDialog = b.create();
        alertDialog.show();
    }
}