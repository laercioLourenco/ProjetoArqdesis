package br.com.arqdesis.projects.laercio.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalharDisciplina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhar_disciplina);
        TextView nome = (TextView)findViewById(R.id. nome_selecionado );
        Intent intent = getIntent();
        nome.setText(intent.getStringExtra(ListarDisciplina. DISCIPLINAKEY ));
    }
}
