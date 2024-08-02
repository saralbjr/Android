package com.example.myapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] title;
    private final String[] description;
    private final int[] image;

    public MyListAdapter(Activity context, String[] title, String[] description, int[] image){
        super(context, R.layout.customlist_items, title);
        this.context = context;
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.customlist_items, null, true);

        TextView txtTitle = rowView.findViewById(R.id.title);
        ImageView imageView = rowView.findViewById(R.id.image);
        TextView txtDescription = rowView.findViewById(R.id.description);

        txtTitle.setText(title[position]);
        imageView.setImageResource(image[position]);
        txtDescription.setText(description[position]);

        return rowView;
    }
}
