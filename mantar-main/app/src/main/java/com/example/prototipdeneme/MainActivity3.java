package com.example.prototipdeneme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {


    public void camsayfa(View view){

        //foto seç sayfası
        Intent intent =new Intent(MainActivity3.this,MainActivity4.class);
        startActivity(intent);

    }

    public void camsayfa2(View view){

        //foto yükle sayfası
        Intent intent =new Intent(MainActivity3.this,MainActivity2.class);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
}