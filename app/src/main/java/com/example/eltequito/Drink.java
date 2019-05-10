package com.example.eltequito;

public class Drink extends Article {

    public Drink(String articleName, double articlePrice) {
        super(articleName, articlePrice);
        setImage(R.drawable.drink_general_icon);
    }

    public Drink(String articleName, double articlePrice, int imageResourceId) {
        super(articleName, articlePrice, imageResourceId);
    }
}