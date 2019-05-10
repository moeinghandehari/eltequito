package com.example.eltequito;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_foods:
                                Toast.makeText(MainActivity.this, R.string.bottom_menu_food, Toast.LENGTH_SHORT).show();
                                Intent foodListIntent = new Intent(MainActivity.this, FoodListActivity.class);
                                startActivity(foodListIntent);
                                break;
                            case R.id.action_drinks:
                                Toast.makeText(MainActivity.this, R.string.bottom_menu_drink, Toast.LENGTH_SHORT).show();
                                Intent drinkListIntent = new Intent(MainActivity.this,DrinkListActivity.class);
                                startActivity(drinkListIntent);
                                break;
                            case R.id.order_list:
                                Toast.makeText(MainActivity.this, R.string.bottom_menu_order_list, Toast.LENGTH_SHORT).show();
                                break;
                        }
                        return true;
                    }
                });

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:53.5458437, 9.9539255"));
                if (intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
            }
        });

    }
}