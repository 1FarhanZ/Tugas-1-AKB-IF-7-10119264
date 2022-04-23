package com.example.a10119264_muhammadfarhan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView daftar = (TextView)findViewById(R.id.txtCreate);                             //Dikerjakan 22 April 2022, 10119264, Muhammad Farhan, AKB_IF-7
        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Register.class);
                startActivity(i);
            }
        });


        TextView Login = (TextView)findViewById(R.id.txtLogin);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Isi.class);
                startActivity(i);
            }
        });
    }
}