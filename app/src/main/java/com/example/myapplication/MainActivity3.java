package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    public Button button;
    public Button button2;
    public Button button3;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main3);

            button = (Button) findViewById(R.id.button8);
            button2 = (Button) findViewById(R.id.button4);
            button3 = (Button) findViewById(R.id.button5);

            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(com.example.myapplication.MainActivity3.this, MainActivity4.class);
                    startActivity(intent);
                }
            });

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(com.example.myapplication.MainActivity3.this, MainActivity5.class);
                    startActivity(intent);
                }
            });
            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(com.example.myapplication.MainActivity3.this, MainActivity4.class);
                    startActivity(intent);
                }
            });
        }
    }
