package com.example.questionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sem1 extends AppCompatActivity {

    Button cod,python1,foss,dbms,dmaths,stats,softskill;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem1);

        cod=(Button)findViewById(R.id.COD);
        python1=(Button)findViewById(R.id.python1);
        foss=(Button)findViewById(R.id.foss);
        dbms=(Button)findViewById(R.id.dbs);
        dmaths=(Button)findViewById(R.id.dmaths);
      stats=(Button)findViewById(R.id.stats);
        softskill=(Button)findViewById(R.id.softskill);


        cod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem1.this,cod.class);
                startActivity(intent);
            }
        });

        python1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem1.this,python1.class);
                startActivity(intent);
            }
        });

        foss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem1.this,foss.class);
                startActivity(intent);
            }
        });

        dbms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem1.this,dbms.class);
                startActivity(intent);
            }
        });

        dmaths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem1.this,dmaths.class);
                startActivity(intent);
            }
        });

        stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem1.this,stats.class);
                startActivity(intent);
            }
        });

        softskill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem1.this,softskill.class);
                startActivity(intent);
            }
        });
    }
}
