package com.example.parcial3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Procesar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_procesar);


        Bundle parametros = this.getIntent().getExtras();
        
    }
}
