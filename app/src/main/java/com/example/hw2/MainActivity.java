package com.example.hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int num=0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView number =findViewById(R.id.number);
        Button plus1=findViewById(R.id.plus1);
        Button plus5=findViewById(R.id.plus5);
        Button plus10=findViewById(R.id.plus10);
        Button minus1=findViewById(R.id.minus1);
        Button minus5=findViewById(R.id.minus5);
        Button minus10=findViewById(R.id.minus10);
        Button reset=findViewById(R.id.reset);
        plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num += 1;
                number.setText(String.valueOf(num));
            }
        });
        plus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num += 5;
                number.setText(String.valueOf(num));
            }
        });
        plus10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num += 10;
                number.setText(String.valueOf(num));
            }
        });
        minus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num-=1;
                number.setText(String.valueOf(num));
            }
        });
        minus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num-=5;
                number.setText(String.valueOf(num));
            }
        });
        minus10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num-=10;
                number.setText(String.valueOf(num));
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=0;
                number.setText(String.valueOf(num));
            }
        });
    }
}