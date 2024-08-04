package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Option extends AppCompatActivity {

    RadioButton radioOption1, radioOption2;
    CheckBox checkBoxPreference1, checkBoxPreference2;
    Spinner spinnerNumbers;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_option);

        radioOption1 = findViewById(R.id.radio_option1);
        radioOption2 = findViewById(R.id.radio_option2);
        checkBoxPreference1 = findViewById(R.id.checkbox_preference1);
        checkBoxPreference2 = findViewById(R.id.checkbox_preference2);
        spinnerNumbers = findViewById(R.id.spinner_numbers);
        submitButton = findViewById(R.id.submit_button);

        String[] numbers = {"Ten", "Two", "Seven", "Eleven", "Nine"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, numbers);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerNumbers.setAdapter(adapter);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle form submission
                String selectedOption = "";
                if (radioOption1.isChecked()) {
                    selectedOption = "Ronaldo";
                } else if (radioOption2.isChecked()) {
                    selectedOption = "Messi";
                }

                StringBuilder preferences = new StringBuilder();
                if (checkBoxPreference1.isChecked()) {
                    preferences.append("CDM ");
                }
                if (checkBoxPreference2.isChecked()) {
                    preferences.append("RW");
                }

                String selectedNumber = spinnerNumbers.getSelectedItem().toString();

                // Display selected values as a toast message
                Toast.makeText(Option.this, "1: " + selectedOption + "2: " + preferences.toString() + "\n3: " + selectedNumber, Toast.LENGTH_LONG).show();
            }
        });
    }
}
