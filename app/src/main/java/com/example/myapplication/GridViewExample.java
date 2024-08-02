package com.example.myapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GridViewExample extends AppCompatActivity {
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_grid_view_example);
        gridView = findViewById(R.id.mygrid);
        String  [] names= {"Gon","Killua","Morty","Rick","Chris","Asmir"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, R.layout.gridview_items,R.id.text,names);
        gridView.setAdapter(adapter);
    }
}