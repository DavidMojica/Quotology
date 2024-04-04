package com.etcetera.quotology;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter {
    Context Contexto;
    String[] Nombres, Horas, Descripciones;
    Boolean[] Reenviado;
    boolean[] Leido;
    int[] imageID;
    LayoutInflater inflater;

    public ListAdapter(Context contexto, String[] nombres, String[] horas, int[] imageID, String[] descripciones, Boolean[] reenviado, boolean[] leido){
        this.Contexto = contexto;
        this.Nombres = nombres;
        this.Descripciones = descripciones;
        inflater = LayoutInflater.from(contexto);
    }

    @Override
    public int getCount(){
        return Nombres.length;
    }

    @Override
    public Object getItem(int i){
        return null;
    }

    @Override
    public long getItemId(int i){
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup){

        TextView nombreEmisor = view.findViewById(R.id.nombre);
        TextView quote = view.findViewById(R.id.quote);

        

        return view;
    }

}
