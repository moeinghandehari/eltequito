package com.example.eltequito;

public class Food extends Article {

    public Food(String articleName, double articlePrice) {
        super(articleName, articlePrice);
    }

    public Food(String articleName, double articlePrice, int imageResourceId) {
        super(articleName, articlePrice, imageResourceId);
    }
}