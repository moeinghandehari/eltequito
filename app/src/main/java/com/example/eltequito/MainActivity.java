package com.example.eltequito;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textView);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bestellFunction(v);
            }
        });

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_karte:
                                Toast.makeText(MainActivity.this, R.string.bottom_menu_food, Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.action_BestellList:
                                Toast.makeText(MainActivity.this, R.string.bottom_menu_drink, Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.einstellungen:
                                Toast.makeText(MainActivity.this, R.string.bottom_menu_order_list, Toast.LENGTH_SHORT).show();
                                break;
                        }
                        return true;
                    }
                });
    }

    public void bestellFunction(View v) {
        Toast toast = Toast.makeText(getApplication().getBaseContext(), "Wird Bestellt :)", Toast.LENGTH_LONG);
        toast.show();
    }
}