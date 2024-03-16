package com.example.midtermsharondsouza;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.midtermsharondsouza.databinding.ActivityMainBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    EditText editTextLiters;
    Button buttonConvert;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextLiters = findViewById(R.id.editTextLiters);
        buttonConvert = findViewById(R.id.buttonConvert);
        textViewResult = findViewById(R.id.textViewResult);

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String litersStr = editTextLiters.getText().toString().trim();
                if (!litersStr.isEmpty()) {
                    double liters = Double.parseDouble(litersStr);
                    double cups = convertLitersToCups(liters);
                    textViewResult.setText(String.format(getString(R.string.string_output), liters, cups));
                } else {
                    textViewResult.setText(R.string.empty_input_error);
                }
            }
        });

//        FLOATING BUTTON ACTION TO DISPLAY DEVELOPER INFO
        FloatingActionButton fabDeveloper = findViewById(R.id.fabDeveloper);
        fabDeveloper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.show_developer_info, Toast.LENGTH_SHORT).show();
            }
        });

    }

    private double convertLitersToCups(double liters) {
        return liters * 4.22;
    }
}