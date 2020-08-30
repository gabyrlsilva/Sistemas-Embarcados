package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.classes.Estacao;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class cadastrar_estacao extends AppCompatActivity {
    private EditText nome, descricao, proprietario, localizacao;
    private Button btncad_estacao;

    DatabaseReference ref_estacao;
    Estacao estacao;

    private FirebaseDatabase database;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_estacao);
        nome = (EditText) findViewById(R.id.nome_estacao);
        descricao = (EditText) findViewById(R.id.descricao_estacao);
        proprietario = (EditText) findViewById(R.id.proprietario_estacao);
        localizacao = (EditText) findViewById(R.id.localizacao_estacao);
        btncad_estacao = (Button) findViewById(R.id.btncad_estacao);

        database  =  FirebaseDatabase.getInstance();
        ref_estacao= database.getReference();

        estacao = new Estacao();

        btncad_estacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomeVal = nome.getText().toString();
                String descricaoVal = descricao.getText().toString();
                String propVal =  proprietario.getText().toString();
                String locVal = localizacao.getText().toString();

                cadastrar_estacao(nomeVal, descricaoVal, propVal, locVal);
            }
        });

    }

    public void cadastrar_estacao(String nome, String descricao, String proprietario, String localizacao){

        String key = ref_estacao.child("estacao").push().getKey();
        estacao.setNome(nome);
        estacao.setDescricao(descricao);
        estacao.setProprietario(proprietario);
        estacao.setLocalizacao(localizacao);

        ref_estacao.child("estacao").child(key).setValue(estacao);
        Toast.makeText(this, "Estação inserida",Toast.LENGTH_SHORT).show();

    }
}