package com.programmingjd.movildeviceproyect;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.programmingjd.movildeviceproyect.apiManager.Api;
import com.programmingjd.movildeviceproyect.models.Random;
import com.programmingjd.movildeviceproyect.models.picsum_info;
import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Call;

public class RandomImagen extends AppCompatActivity {

    ImageView imRandomImage;
    Api api;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_imagen);

        imRandomImage = findViewById(R.id.ivRandomGrayImage);
    }

    public void searchRandom(View v) {
        String getEndpoint = api.BASE_URL + api.random;
        Picasso.get().load(getEndpoint).into(imRandomImage);
    }

    public void startHometwo(View v) {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}