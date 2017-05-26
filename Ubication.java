package com.example.monitor.dsmeteo1;

import android.content.Intent;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import static com.example.monitor.dsmeteo1.R.layout.activity_ubication;

public class Ubication extends AppCompatActivity {
    private static final String TAG = "Ubication";
    //private SectionsPageAdapter mSectionsPageAdapter;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubication);

//menu
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.NavBot);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.favoritosid:
                        Intent intent = new Intent(Ubication.this, favorites.class);
                        startActivity(intent);
                        break;
                    case R.id.ubicacionid:
                        Intent intent2 = new Intent(Ubication.this, Ubication.class);
                        startActivity(intent2);
                        break;
                    case R.id.buscarid:
                        Intent intent3 = new Intent(Ubication.this, Select.class);
                        startActivity(intent3);
                        break;
                    case R.id.powerid:
                        Intent intent4 = new Intent(Ubication.this, LoginActivity.class);
                        startActivity(intent4);
                        break;
                }

                return false;
            }
        });


    }
}
