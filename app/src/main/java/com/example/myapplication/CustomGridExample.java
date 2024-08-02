package com.example.myapplication;

import android.os.Bundle;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class CustomGridExample extends AppCompatActivity {
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_custom_grid_example);
        gridView = findViewById(R.id.mygrid);

        String[] title = {"Dunkirk", "Dark", "Breaking Bad", "Spartacus"};
        String[] description = {
                "Dunkirk here",
                "Dark is very much dark",
                "Let's cook now",
                "Rome history"
        };
        int[] image = {
                R.drawable.firstimg,
                R.drawable.batman,
                R.drawable.dark,
                R.drawable.breakingbad
        };

        MyGridAdapter adapter = new MyGridAdapter(this, title, description, image);
        gridView.setAdapter(adapter);
    }
}
