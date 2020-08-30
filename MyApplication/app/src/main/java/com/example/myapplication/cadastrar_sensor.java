package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.classes.Sensor;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class cadastrar_sensor extends AppCompatActivity {
    private EditText nome, saida, alcance, velocidade, unidade, localizacao, status;
    private Button btn_sensor;

    DatabaseReference ref_sensor;
    Sensor sensor;

    private FirebaseDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_sensor);
        nome = (EditText) findViewById(R.id.nome_sensor);
        saida = (EditText) findViewById(R.id.saida_sensor);
        alcance = (EditText) findViewById(R.id.alcance_sensor);
        velocidade = (EditText) findViewById(R.id.velocidade_sensor);
        unidade = (EditText) findViewById(R.id.unidade_sensor);
        localizacao = (EditText) findViewById(R.id.localizacao_sensor);
        status = (EditText) findViewById(R.id.status_sensor);
        btn_sensor = (Button) findViewById(R.id.btn_sensor);


        database  =  FirebaseDatabase.getInstance();
        ref_sensor= database.getReference();

        sensor = new Sensor();

        btn_sensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomeVal = nome.getText().toString();
                String tipo_saidaVal = saida.getText().toString();
                String rangeVal =  alcance.getText().toString();
                String VelocidadeVal = velocidade.getText().toString();
                String uniMedVal = unidade.getText().toString();
                String locVal = localizacao.getText().toString();
                String statusval = status.getText().toString();

                cad_sensor(nomeVal, tipo_saidaVal, rangeVal, VelocidadeVal, uniMedVal, locVal, statusval);
            }
        });

    }

    public void cad_sensor(String nome, String tipo_saida, String alcance, String Velocidade, String unidade_medida, String local, String status){

        String key = ref_sensor.child("sensor").push().getKey();
        sensor.setNome(nome);
        sensor.setSaida(tipo_saida);
        sensor.setAlcance(alcance);
        sensor.setVelocidade(Velocidade);
        sensor.setUnidade(unidade_medida);
        sensor.setLocalizacao(local);
        sensor.setStatus(status);


        ref_sensor.child("sensor").child(key).setValue(sensor);
        Toast.makeText(this, "Sensor inserido",Toast.LENGTH_SHORT).show();

    }
}