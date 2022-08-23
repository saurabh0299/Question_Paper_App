package com.example.questionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sem5 extends AppCompatActivity {

    Button ai,linixsa,st,ins,aiot,ws,gp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem5);

        ai=(Button)findViewById(R.id.ai);
        linixsa=(Button)findViewById(R.id.linuxsa);
        st=(Button)findViewById(R.id.softest);
        ins=(Button)findViewById(R.id.ins);
        aiot=(Button)findViewById(R.id.archiot);
        ws=(Button)findViewById(R.id.webservice);
        gp=(Button)findViewById(R.id.gameprog);

        ai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem5.this,ai.class);
                startActivity(intent);
            }
        });

        linixsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem5.this,linuxserveradministration.class);
                startActivity(intent);
            }
        });

        st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem5.this,softwaretesting.class);
                startActivity(intent);
            }
        });

        ins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem5.this,networksecurity.class);
                startActivity(intent);
            }
        });

        aiot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem5.this,architectureofiot.class);
                startActivity(intent);
            }
        });

        ws.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem5.this,webservices.class);
                startActivity(intent);
            }
        });

        gp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sem5.this,gameprograming.class);
                startActivity(intent);
            }
        });






    }
}
