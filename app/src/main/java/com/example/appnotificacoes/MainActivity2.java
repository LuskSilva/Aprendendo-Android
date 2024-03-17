package com.example.appnotificacoes;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Intent intent = getIntent();

        String nome = intent.getStringExtra("nome");
        int idade = intent.getIntExtra("idade", 0);

        exibirTexto(nome, idade);
    }

    private void exibirTexto(String nome, int idade) {
        TextView nomeText = findViewById(R.id.nomeText);
        TextView idadeText = findViewById(R.id.idadeText);

        nomeText.setText(nome);
        idadeText.setText(String.valueOf(idade));
    }
}