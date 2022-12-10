package com.example.linuxforbeginners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class archlinuxinstall extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archlinuxinstall);

        ImageView i1=findViewById(R.id.image1);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),archrequirementact.class);
                startActivity(intent);
            }
        });

        TextView t1=findViewById(R.id.requirementtext);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),archrequirementact.class);
                startActivity(intent);
            }
        });

        ImageView i2=findViewById(R.id.bootimg);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),archbootact.class);
                startActivity(intent);
            }
        });

        TextView t2=findViewById(R.id.boottext);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),archbootact.class);
                startActivity(intent);
            }
        });

        ImageView i3=findViewById(R.id.partimg);
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),partinstall.class);
                startActivity(intent);
            }
        });

        TextView t3=findViewById(R.id.parttext);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),partinstall.class);
                startActivity(intent);
            }
        });

        ImageView i4=findViewById(R.id.installimg);
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),installation.class);
                startActivity(intent);
            }
        });

        TextView t4=findViewById(R.id.installtext);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),installation.class);
                startActivity(intent);
            }
        });

        ImageView i5=findViewById(R.id.pstinstallimg);
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),pstinstallact.class);
                startActivity(intent);
            }
        });


        TextView t5=findViewById(R.id.pstinstalltext);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),pstinstallact.class);
                startActivity(intent);
            }
        });


        ImageView i6=findViewById(R.id.dskenvimg);
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),envdeskact.class);
                startActivity(intent);
            }
        });

        TextView t6=findViewById(R.id.dskenvtext);
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),envdeskact.class);
                startActivity(intent);
            }
        });
    }
}