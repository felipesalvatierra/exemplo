package com.example.exerciciointentcomextras2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText et_numero2;
    Button bt_ok2;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        et_numero2 = findViewById(R.id.et_numero2);
        bt_ok2 = findViewById(R.id.bt_ok2);
        intent = getIntent();

        bt_ok2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  numero1 = intent.getExtras().getString("numero1");
                String numero2 = et_numero2.getText().toString();
                intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("numero2", numero2);
                intent.putExtra("numero1", numero1);
                startActivity(intent);
            }
        });
    }
}