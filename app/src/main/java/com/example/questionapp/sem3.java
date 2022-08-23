package com.example.questionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sem3 extends AppCompatActivity {

    Button tofc,cj,operatings,data,graph,iothings,wp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem3);
        tofc=(Button)findViewById(R.id.toc);
        cj=(Button)findViewById(R.id.corejava);
        operatings=(Button)findViewById(R.id.os);
        data=(Button)findViewById(R.id.dbms2);
        graph=(Button)findViewById(R.id.graphtheo);
        iothings=(Button)findViewById(R.id.iot);
        wp=(Button)findViewById(R.id.webp);

        tofc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem3.this,theoryofcomputer.class);
                startActivity(intent);
            }
        });

        cj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem3.this,corejava.class);
                startActivity(intent);
            }
        });

        operatings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem3.this,operatingsystem.class);
                startActivity(intent);
            }
        });

        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem3.this,dbms2.class);
                startActivity(intent);
            }
        });

        graph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem3.this,graphtheory.class);
                startActivity(intent);
            }
        });

        iothings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem3.this,iot.class);
                startActivity(intent);
            }
        });

        wp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem3.this,webprograming.class);
                startActivity(intent);
            }
        });





    }
}
