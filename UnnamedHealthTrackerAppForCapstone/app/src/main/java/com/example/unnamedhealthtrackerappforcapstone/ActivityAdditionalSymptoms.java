package com.example.unnamedhealthtrackerappforcapstone;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityAdditionalSymptoms extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additional_symptom);

        Spinner addtSpinner = findViewById(R.id.addtSymptom_spinner);
        ArrayAdapter<CharSequence> addtAdapter = ArrayAdapter.createFromResource(this,
                R.array.addt_symptoms_list, android.R.layout.simple_spinner_item);
        addtAdapter.setDropDownViewResource((android.R.layout.simple_spinner_dropdown_item));
        addtSpinner.setAdapter(addtAdapter);
    }
}
