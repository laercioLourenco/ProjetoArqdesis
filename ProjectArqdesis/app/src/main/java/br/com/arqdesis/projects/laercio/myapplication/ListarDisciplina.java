package br.com.arqdesis.projects.laercio.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListarDisciplina extends AppCompatActivity {
    Activity atividade;
    public static final String DISCIPLINAKEY = "br.com.arqdesis.ListDis.nome";
    List<Disciplinas> listDisciplinas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_disciplina);
        atividade = this;
        Intent intent = getIntent();
        String chave = intent.getStringExtra(MainActivity.CHAVE);
        TextView ra = (TextView)findViewById(R.id.txtRaListDis );
        ra.setText("RA:"+chave);
        listDisciplinas = (List) createListDisciplinas();
        ListView listaDisciplinas = (ListView) findViewById(R.id.listDis);

        AdapterCustom adapter = new AdapterCustom(listDisciplinas, this);
        listaDisciplinas.setAdapter(adapter);
        listaDisciplinas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // manda para a tela de detalhe
                Intent intent = new Intent(atividade, DetalharDisciplina.class);
                intent.putExtra(DISCIPLINAKEY,listDisciplinas.get(position).getNome());
                startActivity(intent);
            }
        });

    }

    public ArrayList<Disciplinas> createListDisciplinas(){
        ArrayList<Disciplinas> lista = new ArrayList<>();
        lista.add(new Disciplinas("TESTE 1","DESCRICAO 1"));
        lista.add(new Disciplinas("TESTE 2","DESCRICAO 3"));
        lista.add(new Disciplinas("TESTE 3","DESCRICAO 3"));
        lista.add(new Disciplinas("TESTE 4","DESCRICAO 4"));


        return lista;
    }
}
