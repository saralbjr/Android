package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FormData extends AppCompatActivity {

    EditText edtName;
    RadioButton radMale, radFemale;
    Spinner spProgram;
    Button btnSubmit;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_form_data);

        edtName = findViewById(R.id.editName);
        radMale = findViewById(R.id.radioMale);
        radFemale = findViewById(R.id.radioFemale);
        spProgram = findViewById(R.id.spinnerProgram);
        btnSubmit = findViewById(R.id.btnSubmit);
        txtResult = findViewById(R.id.txtResult);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.program_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spProgram.setAdapter(adapter);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edtName.getText().toString();

                String gender = "";
                if (radMale.isChecked()) {
                    gender = "Male";
                } else if (radFemale.isChecked()) {
                    gender = "Female";
                }

                String program = spProgram.getSelectedItem().toString();

                String result = "Name: " + name + "\nGender: " + gender + "\nProgram: " + program;
                txtResult.setText(result);
            }
        });
    }
}
