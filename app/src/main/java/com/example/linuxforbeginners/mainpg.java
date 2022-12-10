package com.example.linuxforbeginners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class mainpg extends AppCompatActivity {
    ImageView i1,i2,i3,i4;
    TextView t1,t2,t3,t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpg);

        i1=findViewById(R.id.installimg);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Installlinux.class);
                startActivity(intent);
            }
        });

        t1=findViewById(R.id.installtext);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Installlinux.class);
                startActivity(intent);
            }
        });

        i2=findViewById(R.id.toolsimg);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),commandsact.class);
                startActivity(intent);
            }
        });

        t2=findViewById(R.id.toolstext);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),commandsact.class);
                startActivity(intent);
            }
        });


        i3=findViewById(R.id.whyimg);
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),whylinux.class);
                startActivity(intent);
            }
        });

        t3=findViewById(R.id.whytext);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),whylinux.class);
                startActivity(intent);
            }
        });

        i4=findViewById(R.id.vimimg);
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),vimed.class);
                startActivity(intent);
            }
        });

        t4=findViewById(R.id.vimtext);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),vimed.class);
                startActivity(intent);
            }
        });

    }

}