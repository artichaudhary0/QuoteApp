package com.example.quoteapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;

public class CustomGridAdapter extends BaseAdapter {
    private final Context context ;
    private final String[] titles ;
    private final int[] images;

    public CustomGridAdapter(Context context, String[] titles, int[] images)
    {
        this.context = context;
        this.titles = titles;
        this.images = images;
    }


    @Override
    public int getCount(){
        return titles.length;
    }

    @Override
    public Object getItem(int position){
        return titles[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position , View convertView , ViewGroup parent){
        if(convertView == null)
        {
            convertView = LayoutInflater.from(context).inflate(R.layout.grid_item,parent,false);
        }


        ImageView imageView = convertView.findViewById(R.id.itemImage);
        TextView textView = convertView.findViewById(R.id.itemText);

        Glide.with(context)
                .load(images[position])
                .override(100, 100) // Resize image to 100x100 pixels
                .into(imageView);
        textView.setText(titles[position]);

        return convertView;
    }

}
