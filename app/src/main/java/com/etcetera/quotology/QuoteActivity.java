package com.etcetera.quotology;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuoteActivity extends AppCompatActivity {
    TextView Autor, Quote;
    String Autor_str, Quote_str;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //Crear el xml de quote activity
        setContentView(R.layout.quote_activity);

        Autor = findViewById(R.id.autor_text);
        Quote = findViewById(R.id.quote_text);

        Intent get_quote = this.getIntent();
        if (get_quote != null){
            Autor_str = get_quote.getStringExtra("quote_author");
            Quote_str = get_quote.getStringExtra("quote");

            Autor.setText(Autor_str);
            Quote.setText(Quote_str);
        }
    }
}
