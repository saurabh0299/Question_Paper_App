package com.example.questionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class stream extends AppCompatActivity {
  Button fy,sy,ty;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stream);
        fy=(Button)findViewById(R.id.fy);
        sy=(Button)findViewById(R.id.sy);
        ty=(Button)findViewById(R.id.ty);

        fy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(stream.this,fysem.class);
                startActivity(intent);
            }
        });
        sy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(stream.this,sysem.class);
                startActivity(intent);
            }
        });
        ty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(stream.this,tysem.class);
                startActivity(intent);
            }
        });
    }
}
