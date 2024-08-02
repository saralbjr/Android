package com.example.myapplication;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class CustomListExample extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_custom_list_example);
        listView = findViewById(R.id.mylist);

        String[] title = {"Dunkirk", "Batman", "Taxi Driver", "Dark", "Hacksaw Ridge"};
        String[] description = {
                "WWII evacuation of Allied soldiers",
                "Vigilante fights crime in Gotham",
                "Lonely cabbie descends into madness",
                "German town's mysterious time travel secrets",
                "Pacifist medic's heroics in WWII"
        };
        int[] image = {
                R.drawable.firstimg,
                R.drawable.batman,
                R.drawable.firstimg,
                R.drawable.dark,
                R.drawable.breakingbad
        };

        MyListAdapter adapter = new MyListAdapter(this, title, description, image);
        listView.setAdapter(adapter);
    }
}
