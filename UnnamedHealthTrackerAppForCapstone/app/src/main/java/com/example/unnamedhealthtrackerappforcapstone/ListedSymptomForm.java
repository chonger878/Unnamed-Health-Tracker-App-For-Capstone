package com.example.unnamedhealthtrackerappforcapstone;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class ListedSymptomForm extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listed_symptom);

        Spinner listedSpinner = findViewById(R.id.sympSpinner);
        ArrayAdapter<CharSequence> listAdapter = ArrayAdapter.createFromResource(this,
                R.array.current_symptoms_list, android.R.layout.simple_spinner_item);
        listAdapter.setDropDownViewResource((android.R.layout.simple_spinner_dropdown_item));
        listedSpinner.setAdapter(listAdapter);
    }
}
