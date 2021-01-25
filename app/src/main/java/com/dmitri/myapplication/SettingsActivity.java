package com.dmitri.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Button buttonReturn = findViewById(R.id.buttonReturn);
        buttonReturn.setOnClickListener(v -> {
            finish();
        });
    }

    public void choiceTheme() {
        RadioButton radioButtonLight = findViewById(R.id.buttonLightTheme);
        radioButtonLight.setOnClickListener(v -> {
            setTheme(0);
        });
        RadioButton radioButtonDark = findViewById(R.id.buttonDarkTheme);
        radioButtonDark.setOnClickListener(v -> {
            setTheme(1);
        });
    }
}