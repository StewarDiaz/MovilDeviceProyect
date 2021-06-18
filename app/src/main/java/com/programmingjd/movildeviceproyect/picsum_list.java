package com.programmingjd.movildeviceproyect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.mbms.StreamingServiceInfo;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.programmingjd.movildeviceproyect.adapters.picsumAdapter;
import com.programmingjd.movildeviceproyect.apiManager.RetrofitClient;
import com.programmingjd.movildeviceproyect.models.picsum_info;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class picsum_list extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listImages;
    List<picsum_info> picList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picsum_list);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        listImages = findViewById(R.id.lvPicsumList);
        getFromPicsumList();
        listImages.setOnItemClickListener(this);
    }

    private void getFromPicsumList(){
        Call<List<picsum_info>> callingPicsum = RetrofitClient.getInstance().getMyApy().getPicsum_info_list();
        callingPicsum.enqueue(new Callback<List<picsum_info>>() {
            @Override
            public void onResponse(Call<List<picsum_info>> call, Response<List<picsum_info>> response) {
                if (response.isSuccessful()) {
                    picList = response.body();
                    picsumAdapter adapter = new picsumAdapter(picsum_list.this, picList);
                    listImages.setAdapter(adapter);
                }
            }
            @Override
            public void onFailure(Call<List<picsum_info>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "sin red", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent i = new Intent(this, DetailsPicsumList.class);
        i.putExtra("ObjectPicsumList", picList.get(position));
        startActivity(i);
    }
}