package com.example.myapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyGridAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] title;
    private final String[] description;
    private final int[] image;

    public MyGridAdapter(Activity context, String[] title, String[] description, int[] image){
        super(context, R.layout.customgrid_items, title);
        this.context = context;
        this.title = title;
        this.description = description;
        this.image = image;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View gridView = inflater.inflate(R.layout.customgrid_items, null, true);

        TextView txtTitle = gridView.findViewById(R.id.title);
        ImageView imageView = gridView.findViewById(R.id.image);
        TextView txtDescription = gridView.findViewById(R.id.description);

        txtTitle.setText(title[position]);
        imageView.setImageResource(image[position]);
        txtDescription.setText(description[position]);

        return gridView;
    }
}
