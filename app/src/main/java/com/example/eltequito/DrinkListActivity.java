package com.example.eltequito;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class DrinkListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_list);

        // Adding articles //

        ArrayList<Article> drinks = new ArrayList<>();

        // APERITIFS category
        drinks.add(new Drink("COCKTAIL DES MONATS", 6.5));
        drinks.add(new Drink("HUGO", 7.5, R.drawable.drink_hugo));
        drinks.add(new Drink("APEROL SPRITZ", 7.5, R.drawable.drink_aperol_spritz));

        // MARGARITAS category
        drinks.add(new Drink("CLASSIC MARGARITA", 8));
        drinks.add(new Drink("CADILLAC MARGARITA", 8));
        drinks.add(new Drink("MELON MARGARITA", 8));

        // FROZENMARGARITAS category
        drinks.add(new Drink("STRAWBERRY MARGARITA", 8.5));
        drinks.add(new Drink("FROZEN MARGARITA", 8.5));
        drinks.add(new Drink("RASPBERRY MARGARITA", 8.5));
        drinks.add(new Drink("MANGO MARGARITA", 8.5));

        // COCKTAILESPECIALES category
        drinks.add(new Drink("MAI TAI", 8.5));
        drinks.add(new Drink("RIO GRANDE", 8));
        drinks.add(new Drink("SIERRA MADRE", 9));
        drinks.add(new Drink("PINA COLADA", 8));
        drinks.add(new Drink("SALSA", 8.5));
        drinks.add(new Drink("CAIPIRINHA", 7.5, R.drawable.drink_caipirinha));
        drinks.add(new Drink("CAIPIRINHA JUMBO", 9.5));
        drinks.add(new Drink("RHABBI RHINA DER ANDERE CAIPI", 8));
        drinks.add(new Drink("MOJITO", 8));
        drinks.add(new Drink("EL MATADOR", 9));
        drinks.add(new Drink("LONG ISLAND ICE TEA", 9));
        drinks.add(new Drink("PRINCE", 8.5));
        drinks.add(new Drink("CUBA LIBRE", 8));
        drinks.add(new Drink("SEX ON THE BEACH", 8));
        drinks.add(new Drink("TEQUILA SUNRISE", 8));

        ArticleAdapter articleAdapter = new ArticleAdapter(this, drinks);
        ListView listView = (ListView) findViewById(R.id.articleList);
        listView.setAdapter(articleAdapter);
    }
}
