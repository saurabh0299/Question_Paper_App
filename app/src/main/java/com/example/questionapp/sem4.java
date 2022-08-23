package com.example.questionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sem4 extends AppCompatActivity {
Button foa,aj,cn,la,dotnet,andro,se,ste;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem4);

        foa=(Button)findViewById(R.id.foa);
        aj=(Button)findViewById(R.id.advjava);
        cn=(Button)findViewById(R.id.cn);
        la=(Button)findViewById(R.id.linalgebra);
        dotnet=(Button)findViewById(R.id.dotnet);
        andro=(Button)findViewById(R.id.android);
        ste=(Button)findViewById(R.id.ext);




        ste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem4.this,softwareengineer.class);
                startActivity(intent);
            }
        });










        foa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem4.this,fundamentalofalgorithm.class);
                startActivity(intent);
            }
        });
        aj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem4.this,advjava.class);
                startActivity(intent);
            }
        });



        cn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem4.this,computernetwork.class);
                startActivity(intent);
            }
        });



        la.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem4.this,linearalgebra.class);
                startActivity(intent);
            }
        });

        dotnet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem4.this,dotnet.class);
                startActivity(intent);
            }
        });

        andro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem4.this,android.class);
                startActivity(intent);
            }
        });


    }
}
