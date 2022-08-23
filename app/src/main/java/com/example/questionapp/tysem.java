package com.example.questionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tysem extends AppCompatActivity {
Button sem5,sem6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tysem);

        sem5=(Button) findViewById(R.id.sem5);
        sem6=(Button) findViewById(R.id.sem6);

        sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(tysem.this,sem5.class);
                startActivity(intent);
            }
        });
        sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(tysem.this,sem6.class);
                startActivity(intent);
            }
        });

    }
}
