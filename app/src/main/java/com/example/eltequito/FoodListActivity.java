package com.example.eltequito;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_list);


        ////// Defining and adding the foods in an ArrayList using Food class //////

        ArrayList<Article> foodList = new ArrayList<>();

        // Nachos category //
        foodList.add(new Food("Salsa Flight", 7));
        foodList.add(new Food("El Chapo", 8));
        foodList.add(new Food("Con Carne", 9));
        foodList.add(new Food("TRADICIONAL (Guacamole)", 6.5));

        // ENSALADAS category //
        foodList.add(new Food("EL TEQUITO CAESAR SALAD", 12.5));
        foodList.add(new Food("ENSALADA DEL MES", 9.5));

        // ENTRADAS category //
        foodList.add(new Food("BLACK BEAN CHILI CON CARNE", 6.5));
        foodList.add(new Food("SEA FOOD GUMBO", 9.5));
        foodList.add(new Food("AGUACHILE - CEVICHE AUF MEXIKANISCH", 12.5));
        foodList.add(new Food("PAPAS DULCES", 5));


        ////// Defining and adding the foods in an ArrayList using Food class //////

        ArticleAdapter articleAdapter = new ArticleAdapter(this, foodList);
        ListView listView = (ListView) findViewById(R.id.articleList);
        listView.setAdapter(articleAdapter);
    }
}