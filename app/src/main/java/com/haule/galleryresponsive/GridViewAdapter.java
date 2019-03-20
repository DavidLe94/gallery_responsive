package com.haule.galleryresponsive;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by haulc3 on 19,March,2019
 */
public class GridViewAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<String> list;

    public GridViewAdapter(Context context, ArrayList<String> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item, parent, false);

            ImageView imageView = convertView.findViewById(R.id.image_view);

            Glide.with(context).load(list.get(position)).into(imageView);
        }
        return convertView;
    }
}
