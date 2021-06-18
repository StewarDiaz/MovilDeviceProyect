package com.programmingjd.movildeviceproyect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.programmingjd.movildeviceproyect.apiManager.Api;
import com.squareup.picasso.Picasso;

public class RandomBlurred extends AppCompatActivity {

    Api api;
    ImageView imRandomBlurredImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_blurred);

        imRandomBlurredImage = findViewById(R.id.ivRandomGrayImage);
    }

    public void searchRandomBlurred(View v) {
        String getEndpoint = api.BASE_URL + api.randomBlur;
        Picasso.get().load(getEndpoint).into(imRandomBlurredImage);
    }

    public void startHome4(View v) {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}