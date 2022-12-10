package com.example.linuxforbeginners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class commandsact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commandsact);

        ImageView i1=findViewById(R.id.filenavimg);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),fileactnav.class);
                startActivity(intent);
            }
        });

        TextView t1=findViewById(R.id.filenavtext);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),fileactnav.class);
                startActivity(intent);
            }
        });

        ImageView i2=findViewById(R.id.filesimg);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),filesact.class);
                startActivity(intent);
            }
        });


        TextView t2=findViewById(R.id.filestext);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),filesact.class);
                startActivity(intent);
            }
        });

        ImageView i3=findViewById(R.id.permimg);
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),permact.class);
                startActivity(intent);
            }
        });

        TextView t3=findViewById(R.id.permtext);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),permact.class);
                startActivity(intent);
            }
        });

        ImageView i4=findViewById(R.id.usersimg);
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),diskact.class);
                startActivity(intent);
            }
        });

        TextView t4=findViewById(R.id.userstext);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),diskact.class);
                startActivity(intent);
            }
        });
    }
}