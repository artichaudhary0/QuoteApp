package com.example.quoteapp;

import android.os.Bundle;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] titles = {"Item 1","Item 2","Item 3","Item 4","Item 5","Item 6","Item 1","Item 2","Item 3","Item 4","Item 5","Item 6"};
        int[] images = {R.drawable.bg1,R.drawable.bg1,R.drawable.bg1,R.drawable.bg1,R.drawable.bg1,R.drawable.bg1,R.drawable.bg1,R.drawable.bg1,R.drawable.bg1,R.drawable.bg1,R.drawable.bg1,R.drawable.bg1};

        GridView gridView = findViewById(R.id.customGridView);

        CustomGridAdapter adapter = new CustomGridAdapter(this , titles ,images);
//
        gridView.setAdapter(adapter);

    }
}