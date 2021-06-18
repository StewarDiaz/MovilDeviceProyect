package com.programmingjd.movildeviceproyect.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.programmingjd.movildeviceproyect.R;
import com.programmingjd.movildeviceproyect.models.picsum_info;
import com.squareup.picasso.Picasso;

import java.util.List;

public class picsumAdapter extends BaseAdapter {

    protected Activity activity;
    protected List<picsum_info> myPicsum;

    public picsumAdapter(Activity activity, List<picsum_info> picsumList){
        this.activity = activity;
        this.myPicsum = picsumList;
    }

    @Override
    public int getCount() {
        return myPicsum.size();
    }

    @Override
    public Object getItem(int position) {
        return myPicsum.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if(convertView == null){
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.picsum_item, null);
        }

        picsum_info pic_info = myPicsum.get(position);

        TextView authorPicsum = v.findViewById(R.id.tvAuthorPicsumList);
        TextView widthPicsum = v.findViewById(R.id.tvWidthPicsumList);
        TextView heightPicsum = v.findViewById(R.id.tvHeightPicsumList);
        ImageView imagePicsum = v.findViewById(R.id.ivDownloadUrl);

        authorPicsum.setText(pic_info.getAuthor());
        widthPicsum.setText(pic_info.getWidth());
        heightPicsum.setText(pic_info.getHeight());
        Picasso.get().load(pic_info.getDownload_url()).into(imagePicsum);

        return v;
    }
}
