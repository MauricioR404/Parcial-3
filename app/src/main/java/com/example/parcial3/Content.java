package com.example.parcial3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Content extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        Button editProcesar = (Button) findViewById(R.id.tvOperacion);

        editProcesar.setOnClickListener(new View.OnClickListener() {
            EditText edit1 = (EditText) findViewById(R.id.num1);
            EditText edit2 = (EditText) findViewById(R.id.num2);

            @Override
            public void onClick(View v) {
                int num1 = Integer.valueOf(edit1.getText().toString());
                int num2 = Integer.valueOf(edit2.getText().toString());

                Bundle informacion = new Bundle();
                informacion.putInt("num1", num1);
                informacion.putInt("num2", num2);
                Intent i = new Intent(Content.this, Procesar.class);
                i.putExtras(informacion);
                startActivity(i);
                /*
                int resultado = num1 + num2;


                */
            }
        });
    }
}
