package br.com.arqdesis.projects.laercio.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText ra;
    public static final String CHAVE = "br.com.arqdesis.ListDis.chave";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ra = (EditText)findViewById(R.id.txtRa );

    }
    public void loaDListDisci(View view){
        Intent intent = new Intent(this, ListarDisciplina.class);
        String chave = ra.getText().toString();
        intent.putExtra( CHAVE , chave);
        startActivity(intent);
    }
}
