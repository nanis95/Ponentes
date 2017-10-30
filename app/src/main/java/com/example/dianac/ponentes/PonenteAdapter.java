package com.example.dianac.ponentes;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dianac.ponentes.models.Ponentes;

import java.util.List;

/**
 * Created by Diana C on 26/10/2017.
 */

public class PonenteAdapter extends RecyclerView.Adapter <PonenteAdapter.AdapterViewHolder> {
    private List<Ponentes> items;

    public static class AdapterViewHolder extends RecyclerView.ViewHolder{
        public TextView titulo;
        public View v;
        public Context c;

        public AdapterViewHolder(View v){
            super(v);
            c = v.getContext();
            titulo = (TextView) v.findViewById(R.id.titulo);
            this.v = v;
        }
    }

    public PonenteAdapter(List<Ponentes> items){
        this.items = items;
    }

    public int getItemCount(){
        return items.size();
    }

    public AdapterViewHolder onCreateViewHolder(ViewGroup vg, int i){
        View v = LayoutInflater.from(vg.getContext()).inflate(R.layout.cardview,vg,false);
        return new AdapterViewHolder(v);
    }

    public void onBindViewHolder(final AdapterViewHolder vh, final int i){
        vh.titulo.setText(items.get(i).getTitulo());

        vh.v.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent in = new Intent(vh.c, Info.class);
                in.putExtra("titulo",items.get(i).getTitulo());
                in.putExtra("grupo",items.get(i).getGrupo());
                in.putExtra("lugar",items.get(i).getLugar());
                in.putExtra("fecha",items.get(i).getFecha());
                vh.c.startActivity(in);
            }
        });
    }
}
