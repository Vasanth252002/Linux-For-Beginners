package com.example.linuxforbeginners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Installlinux extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_installlinux);


        ImageView i1=findViewById(R.id.archimg);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),archlinuxinstall.class);
                startActivity(intent);
            }
        });

        TextView t1=findViewById(R.id.archtext);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),archlinuxinstall.class);
                startActivity(intent);
            }
        });

        ImageView i2=findViewById(R.id.distrosimg);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),otherins.class);
                startActivity(intent);
            }
        });

        TextView t2=findViewById(R.id.distrostext);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),otherins.class);
                startActivity(intent);
            }
        });
    }
}