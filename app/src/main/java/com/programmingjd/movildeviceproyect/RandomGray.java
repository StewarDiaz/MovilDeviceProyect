package com.programmingjd.movildeviceproyect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.programmingjd.movildeviceproyect.apiManager.Api;
import com.squareup.picasso.Picasso;

public class RandomGray extends AppCompatActivity {

    Api api;
    ImageView imRandomGrayImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_gray);

        imRandomGrayImage = findViewById(R.id.ivRandomGrayImage);
    }

    public void searchRandomGray(View v) {
        String getEndpoint = api.BASE_URL + api.randomGray;
        Picasso.get().load(getEndpoint).into(imRandomGrayImage);
    }

    public void startHome3(View v) {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}