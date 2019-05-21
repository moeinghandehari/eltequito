package com.example.eltequito;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class DrinkListFragment extends Fragment {


    public DrinkListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_article_list, container, false);

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

        ArticleAdapter articleAdapter = new ArticleAdapter(getActivity(), drinks);
        ListView listView = (ListView) rootView.findViewById(R.id.articleList);
        listView.setAdapter(articleAdapter);

        return rootView;
    }

}