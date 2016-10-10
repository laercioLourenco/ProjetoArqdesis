package br.com.arqdesis.projects.laercio.myapplication;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Laercio on 09/10/2016.
 */

public class AdapterCustom extends BaseAdapter {
    private final List<Disciplinas> disciplinas;
    private final Activity act;
    public AdapterCustom(List<Disciplinas> cursos, Activity act) {
        this.disciplinas = cursos;
        this.act = act;
    }

    @Override
    public int getCount() {
        return disciplinas.size();
    }

    @Override
    public Object getItem(int position) {
        return disciplinas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = act.getLayoutInflater()
                .inflate(R.layout.my_list_custom, parent, false);
        Disciplinas disciplina = disciplinas.get(position);
        TextView nome = (TextView)
                view.findViewById(R.id.nomeDisciplina);
        TextView descricao = (TextView)
                view.findViewById(R.id.nomeDescricao);
        ImageView imagem = (ImageView)
                view.findViewById(R.id.imageView);

        nome.setText(disciplina.getNome());
        descricao.setText(disciplina.getDescricao());
        imagem.setImageResource(R.drawable.icon_default);
        return view;
    }
}

