package com.example.questionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sem2 extends AppCompatActivity {

    Button c,paython2,linux,datastructure,calculus,statistic,greentech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem2);


        c=(Button)findViewById(R.id.cprogram);
        paython2=(Button)findViewById(R.id.python2);
        linux=(Button)findViewById(R.id.linux);
        datastructure=(Button)findViewById(R.id.datastruc);
        calculus=(Button)findViewById(R.id.calculus);
        statistic=(Button)findViewById(R.id.stats2);
        greentech=(Button)findViewById(R.id.greentech);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem2.this,programingC.class);
                startActivity(intent);
            }
        });

        paython2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem2.this,python2.class);
                startActivity(intent);
            }
        });

        linux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem2.this,linux.class);
                startActivity(intent);
            }
        });

        datastructure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem2.this,datastructure.class);
                startActivity(intent);
            }
        });

        calculus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem2.this,calculus.class);
                startActivity(intent);
            }
        });

        statistic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem2.this,statistic2.class);
                startActivity(intent);
            }
        });

        greentech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem2.this,greentechnology.class);
                startActivity(intent);
            }
        });



    }
}
