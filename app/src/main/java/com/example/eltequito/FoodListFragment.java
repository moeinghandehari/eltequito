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
public class FoodListFragment extends Fragment {


    public FoodListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.activity_article_list,container,false);


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

        ArticleAdapter articleAdapter = new ArticleAdapter(getActivity(), foodList);
        ListView listView = (ListView) rootView.findViewById(R.id.articleList);
        listView.setAdapter(articleAdapter);


        return rootView;
    }
}