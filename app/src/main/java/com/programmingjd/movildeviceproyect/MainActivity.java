package com.programmingjd.movildeviceproyect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void stratListImage(View v){
        Intent i = new Intent(this, picsum_list.class);
        startActivity(i);
    }

    public void stratRandomImage(View v){
        Intent i = new Intent(this, RandomImagen.class);
        startActivity(i);
    }

    public void stratRandomGrayImage(View v){
        Intent i = new Intent(this, RandomGray.class);
        startActivity(i);
    }

    public void stratRandomBlurredImage(View v){
        Intent i = new Intent(this, RandomBlurred.class);
        startActivity(i);
    }
}