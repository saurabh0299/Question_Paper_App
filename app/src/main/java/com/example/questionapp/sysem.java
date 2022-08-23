package com.example.questionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sysem extends AppCompatActivity {
Button asem4;
    Button asem3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sysem);

        asem3=(Button) findViewById(R.id.asem3);


        asem4=(Button) findViewById(R.id.asem4);

        asem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(sysem.this,sem3.class);
                startActivity(intent);
            }
        });


        asem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(sysem.this,sem4.class);
                startActivity(intent);
            }
        });
    }
}
