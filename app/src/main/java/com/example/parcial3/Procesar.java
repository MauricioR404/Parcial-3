package com.example.parcial3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;



public class Procesar extends AppCompatActivity {
    public int resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_procesar);

        TextView edit1 = (TextView) findViewById(R.id.numero1);
        TextView edit2 = (TextView) findViewById(R.id.numero2);
        Button tvProcesar = (Button) findViewById(R.id.tvProcesar);
        RadioButton radioSumar = (RadioButton) findViewById(R.id.sumar);
        RadioButton radioRestar = (RadioButton) findViewById(R.id.restar);
        RadioButton radioDivir = (RadioButton) findViewById(R.id.dividir);
        RadioButton radioMultiplicar = (RadioButton) findViewById(R.id.multiplicar);


        Bundle parametros = this.getIntent().getExtras();

        if(parametros !=null){
            int numero1 = getIntent().getExtras().getInt("numero1");
            int numero2 = getIntent().getExtras().getInt("numero2");

            edit1.setText("Numero 1: " + numero1);
            edit2.setText("Numero 2: " + numero2);


            if (radioSumar.isChecked()) {
                int resultado = numero1 + numero2;
            }

            if (radioRestar.isChecked()) {
                int resultado = numero1 - numero2;
            }

            if (radioDivir.isChecked()) {
                int resultado = numero1 / numero2;
            }

            if (radioMultiplicar.isChecked()) {
                int resultado = numero1 * numero2;
            }

            tvProcesar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                Bundle informacions = new Bundle();
                Intent i = new Intent(Procesar.this, Content.class);
                i.putExtra("resultado", resultado);

                startActivity(i);
                }
            });
        }




    }
}
