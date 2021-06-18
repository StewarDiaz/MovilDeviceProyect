package com.programmingjd.movildeviceproyect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.programmingjd.movildeviceproyect.models.picsum_info;
import com.squareup.picasso.Picasso;

import java.net.URI;

public class DetailsPicsumList extends AppCompatActivity {

    ImageView imageDowload;
    TextView textDescription;
    String URLIr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        picsum_info PicInfo = (picsum_info) getIntent().getSerializableExtra("ObjectPicsumList");
        setContentView(R.layout.activity_details_picsum_list);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        imageDowload = findViewById(R.id.ivImagenPrincipalPic);
        textDescription = findViewById(R.id.tvDescriptionPic);

        URLIr = PicInfo.getUrl();

        String msj = "El autor de esta imagen es " + PicInfo.getAuthor() + ".   Sus dimensiones son: " + PicInfo.getWidth() + "px de ancho por "+ PicInfo.getHeight() + "px de alto. Para mas información oprima la descrpcion.";

        Picasso.get()
                .load(PicInfo.getDownload_url())
                .into(imageDowload);
        textDescription.setText(msj);
    }

    public void startHome(View v){
        Intent i = new Intent(getBaseContext(), MainActivity.class);
        startActivity(i);
    }

    public void startList(View v){
        Intent i = new Intent(getBaseContext(), picsum_list.class);
        startActivity(i);
    }

    public void startPage(View v){
        Uri link = Uri.parse(URLIr);
        Intent i = new Intent(Intent.ACTION_VIEW, link);
        startActivity(i);
    }
}