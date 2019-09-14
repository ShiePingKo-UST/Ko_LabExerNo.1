package com.ko.ko_labexerno1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayPlaces (View v){
        Intent i = new Intent(this, PlacesPage.class);
        startActivity(i);
    }

    public void ViewCatalog (View v){
        super.onResume();
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }
}
