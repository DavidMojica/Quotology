package com.etcetera.quotology;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class ListAdapter extends ArrayAdapter<Quote> {
    Context Contexto;
    private List<Quote> quoteList;
    LayoutInflater inflater;

    public ListAdapter(Context contexto, List<Quote> quoteList){
        super(contexto, R.layout.quote_item, quoteList);
        this.Contexto = contexto;
        this.quoteList = quoteList;
        inflater = LayoutInflater.from(contexto);
    }

    @Override
    public long getItemId(int i){
        return 0;
    }

    public View getView(int i, View convertView, ViewGroup parent){
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(Contexto).inflate(R.layout.quote_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.authorTextView = convertView.findViewById(R.id.autor);
            viewHolder.quoteTextView = convertView.findViewById(R.id.quote);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Quote quote = quoteList.get(i);
        viewHolder.authorTextView.setText(quote.getAuthor());
        viewHolder.quoteTextView.setText(quote.getQuote());

        return convertView;
    }

    static class ViewHolder{
        TextView authorTextView;
        TextView quoteTextView;
    }

}
