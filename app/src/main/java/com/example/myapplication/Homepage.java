package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Homepage extends AppCompatActivity {

    private static final String TAG = "Homepage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_homepage);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Setup button to navigate to InputText activity
        Button inputTextButton = findViewById(R.id.Inputext);
        inputTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Input Text button clicked");
                Intent intent = new Intent(Homepage.this, InputText.class);
                startActivity(intent);
            }
        });

        // Setup button to navigate to MainActivity
        Button linearlayoutButton = findViewById(R.id.Linearlayout);
        linearlayoutButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d(TAG, "Linear Layout button clicked");
                Intent intent = new Intent(Homepage.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Setup button to navigate to ThirdTableActivity
        Button tablelayoutButton = findViewById(R.id.Tablelayout);
        tablelayoutButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d(TAG, "TAble layout button clicked");
                Intent intent = new Intent (Homepage.this, ThirdTableActivity.class);
                startActivity(intent);
            }
        });
        // Setup button to navigate to ConstraintLayout
        Button constraintlayoutButton = findViewById(R.id.Constraintlayout);
        constraintlayoutButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d(TAG, "Constraint button clicked");
                Intent intent = new Intent (Homepage.this, ConstraintLayout.class);
                startActivity(intent);
            }
        });
        // Setup button to navigate to RelativeLayout
        Button relativelayoutButton = findViewById(R.id.RelativeLayout);
        relativelayoutButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d(TAG, "Relative button clicked");
                Intent intent = new Intent(Homepage.this, RelativeLayout.class);
                startActivity(intent);
            }
        });
        // Setup button to navigate to AbsoluteLayout
        Button absolutelayoutButton = findViewById(R.id.Absolutelayout);
        absolutelayoutButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d(TAG, "Absolute button clicked");
                Intent intent = new Intent(Homepage.this, SecondActivity.class);
                startActivity(intent);
            }
        });
        //Setup button to navigate to ListView
        Button listviewButton = findViewById(R.id.Listviewgrid);
        listviewButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d(TAG, "Listview button clicked");
                Intent intent = new Intent(Homepage.this, ListViewExample.class);
                startActivity(intent);
            }
        });
        // Setup button to navigate to CustomListView
        Button customlistviewButton = findViewById(R.id.Customlistview);
        customlistviewButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d(TAG, "Customlistview button clicked");
                Intent intent = new Intent(Homepage.this, CustomListExample.class);
                startActivity(intent);
            }
        });
        // Setup button to navigate to GridView
        Button gridviewButton = findViewById(R.id.Gridview);
        gridviewButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d(TAG, "Gridview button clicked");
                Intent intent = new Intent(Homepage.this, GridViewExample.class);
                startActivity(intent);
            }
        });
        // Setup button to navigate to CustomGridView
        Button customgridviewButton = findViewById(R.id.Customgridview);
        customgridviewButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d(TAG, "Customgridview button clicked");
                Intent intent = new Intent(Homepage.this, CustomGridExample.class);
                startActivity(intent);
            }
        });
        // 1setup button to navigate to Option
        Button optionButton = findViewById(R.id.option);
        optionButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d(TAG, "option button clicked");
                Intent intent = new Intent(Homepage.this, Option.class);
                startActivity(intent);
            }
        });
        // 1setup button to navigate to FormData
        Button formdataButton = findViewById(R.id.formdata);
        formdataButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d(TAG, "option button clicked");
                Intent intent = new Intent(Homepage.this, FormData.class);
                startActivity(intent);
            }
        });
        //setup button to navigate to calculator page
        Button calculatorButton = findViewById(R.id.calculator);
        calculatorButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent (Homepage.this, Calculator.class);
                startActivity(intent);
            }
        });
    }
}
