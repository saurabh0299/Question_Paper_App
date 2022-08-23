package com.example.questionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sem6 extends AppCompatActivity {

    Button wsnmobile,cc,cf,ir,digitaimg,ds,eh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem6);


        wsnmobile=(Button)findViewById(R.id.wsnm);
        cc=(Button)findViewById(R.id.clocomp);
        cf=(Button)findViewById(R.id.cybfore);
        ir=(Button)findViewById(R.id.inforetr);
        digitaimg=(Button)findViewById(R.id.dip);
        ds=(Button)findViewById(R.id.datasc);
        eh=(Button)findViewById(R.id.ethicalhack);

        wsnmobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem6.this,wsnetworkandmobliecommnication.class);
                startActivity(intent);
            }
        });

        cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem6.this,cloudomputing.class);
                startActivity(intent);
            }
        });

        cf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem6.this,cyberforensics.class);
                startActivity(intent);
            }
        });

        ir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem6.this,informationretrieval.class);
                startActivity(intent);
            }
        });

        digitaimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem6.this,dagitalimageprocessing.class);
                startActivity(intent);
            }
        });

        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem6.this,datascience.class);
                startActivity(intent);
            }
        });

        eh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem6.this,ethicalhacking.class);
                startActivity(intent);
            }
        });










    }
}
