package com.ko.ko_labexerno1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class PlacesPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_page);
    }
    public void CarPark (View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://foursquare.com/v/ust-carpark/50137b67e4b08516d1f18b22"));
        startActivity(i);
    }
    public void MainBuilding (View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://en.wikipedia.org/wiki/University_of_Santo_Tomas_Main_Building"));
        startActivity(i);
    }
    public void USTMusem (View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://explora.ph/attraction/28/ust-museum"));
        startActivity(i);
    }
    public void USTStadium (View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://en.wikipedia.org/wiki/Quadricentennial_Pavilion"));
        startActivity(i);
    }
}
