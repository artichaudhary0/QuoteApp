package com.example.quoteapp;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        String[] titles = {"Item 1","Item 2","Item 3","Item 4","Item 5","Item 6","Item 1","Item 2","Item 3","Item 4","Item 5","Item 6"};
//        int[] images = {R.drawable.bg1,R.drawable.background,R.drawable.bg1,R.drawable.background,R.drawable.bg1,R.drawable.bg1,R.drawable.background,R.drawable.bg1,R.drawable.bg1,R.drawable.bg1,R.drawable.bg1,R.drawable.bg1};
//
//
//        GridView gridView = findViewById(R.id.customGridView);
//
//        CustomAdapter adapter = new CustomAdapter(this , titles , images);
//        gridView.setAdapter(adapter);

        String[] items = {"Item 1","Item 2","Item 3","Item 4","Item 5","Item 6","Item 1","Item 2","Item 3","Item 4","Item 5","Item 6"};
        int[] images = {R.drawable.bg1,R.drawable.background,R.drawable.bg1,R.drawable.background,R.drawable.bg1,R.drawable.bg1,R.drawable.background,R.drawable.bg1,R.drawable.bg1,R.drawable.bg1,R.drawable.bg1,R.drawable.bg1};
        Spinner spinner = findViewById(R.id.customSpinner);

        CustomSpinnerAdapter adapter1 = new CustomSpinnerAdapter(this, items , images);
        spinner.setAdapter(adapter1);
    }
}