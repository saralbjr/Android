package com.example.myapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ListViewExample extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_view_example);
        listView = findViewById(R.id.mylist);
        String[] names= {"Christopher Nolan","Tyler Durden","Walter White","Johnny Depp","Patrick Bateman","Jessie Pinkman"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,R.layout.listview_items,R.id.text,names);
        listView.setAdapter(adapter);
    }
}