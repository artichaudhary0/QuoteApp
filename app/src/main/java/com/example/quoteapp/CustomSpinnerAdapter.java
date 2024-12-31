package com.example.quoteapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class CustomSpinnerAdapter extends BaseAdapter {
    private final Context context;
    private String[] items ;
    private int[] images ;


    public CustomSpinnerAdapter(Context context , String[] items,int[] images)
    {
        this.context = context ;
        this.items = items;
        this.images = images;
    }

    @Override
    public int getCount(){
        return  items.length;
    }

    @Override
    public  Object getItem(int position)
    {
        return  items[position];
    }

    @Override
    public  long getItemId(int position)
    {
        return  position;
    }

    @Override
    public View getView(int position , View contentView , ViewGroup parent){
        if(contentView == null)
        {
            contentView = LayoutInflater.from(context).inflate(R.layout.spinner_item , parent ,false);
        }

        ImageView imageView = contentView.findViewById(R.id.spinnerImage);
        TextView textView = contentView.findViewById(R.id.textSpinner);


        Glide.with(context)
                .load(images[position])
                .override(100, 100) // Resize image to 100x100 pixels
                .into(imageView);
        textView.setText(items[position]);

        return  contentView;
    }


//    @Override
//    public View getDropDownView()
//    {
//
//    }
}
