package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cadastrar_usuario = findViewById(R.id.cadastrar_usuario);
        Button cadastrar_sensor = findViewById(R.id.cadastrar_sensor);
        Button cadastrar_estacao = findViewById(R.id.cadastrar_estacao);

        cadastrar_usuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this,  cadastrar_usuario.class);
                startActivity(it);
            }
        });

        cadastrar_sensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, cadastrar_sensor.class);
                startActivity(it);
            }
        });

        cadastrar_estacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, cadastrar_estacao.class);
                startActivity(it);
            }
        });

    }
}