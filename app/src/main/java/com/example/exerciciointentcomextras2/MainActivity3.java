package com.example.exerciciointentcomextras2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView tv_resultado;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tv_resultado = findViewById(R.id.tv_resultado);
        intent = getIntent();

        int numero1 = Integer.parseInt(intent.getExtras().getString("numero1"));
        int numero2 = Integer.parseInt(intent.getExtras().getString("numero2"));

        tv_resultado.setText(
                numero1 + " + " + numero2 + " = " + (numero1 + numero2) + "\n" +
                        numero1 + " - " + numero2 + " = " + (numero1 - numero2) + "\n" +
                        numero1 + " * " + numero2 + " = " + (numero1 * numero2) + "\n" +
                        numero1 + " / " + numero2 + " = " + (numero1 / numero2)
        );

    }
}