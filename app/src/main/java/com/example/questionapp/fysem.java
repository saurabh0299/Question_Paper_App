package com.example.questionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fysem extends AppCompatActivity {
  Button sem1,sem2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fysem);
        sem1=(Button) findViewById(R.id.sem1);
        sem2=(Button) findViewById(R.id.sem2);

        sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(fysem.this,sem1.class);
                startActivity(intent);
            }
        });
        sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(fysem.this,sem2.class);
                startActivity(intent);
            }
        });
    }
}
