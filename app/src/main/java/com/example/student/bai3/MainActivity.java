package com.example.student.bai3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextYear;
    TextView textViewResult;
    Button buttonConvert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }
    private void addEvents() {
        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int year;
                try {
                    year = Integer.parseInt(editTextYear.getText().toString());
                } catch (Exception ex) {
                    year = 0;
                }
                textViewResult.setText(Calculator.getLunarYear(year));
            }
        });
    }

    private void addControls() {
        editTextYear = findViewById(R.id.editTextYear);
        textViewResult = findViewById(R.id.textViewResult);
        buttonConvert = findViewById(R.id.button);
    }
}
