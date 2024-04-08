package com.etcetera.quotology;
public class Quote {
    private String key;
    private String author;
    private String quote;

    public Quote() {
        // Constructor vacío requerido por Firebase
    }

    public Quote(String key, String author, String quote) {
        this.key = key;
        this.author = author;
        this.quote = quote;
    }

    public String getKey() {
        return key;
    }

    public String getAuthor() {
        return author;
    }

    public String getQuote() {
        return quote;
    }
}
