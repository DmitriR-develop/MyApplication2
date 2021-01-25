package com.dmitri.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends ThemeActivity implements View.OnClickListener {
    private Calculator calculator = new Calculator();
    private TextView numberField;
    private TextView numberFieldResult;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;
    private Button buttonDelete;
    private Button buttonBrackets;
    private Button buttonPercent;
    private Button buttonDivide;
    private Button buttonMultiply;
    private Button buttonMinus;
    private Button buttonPlus;
    private Button buttonPlMi;
    private Button buttonDot;
    private Button buttonEqually;
    private Button buttonSettings;
    private final String KEY_CALCULATOR = "Calculator";
    private final static int REQUEST_CODE = 99;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(getTheme(getThemeChoice()));
        setContentView(R.layout.activity_main);
        calculator = new Calculator();
        initView();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable(KEY_CALCULATOR, calculator);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        calculator = savedInstanceState.getParcelable(KEY_CALCULATOR);
//        setShowResult();
    }

    private void initView() {
        findViews();
        initButtons();
    }

    private void findViews() {
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonDelete = findViewById(R.id.buttonDel);
        buttonBrackets = findViewById(R.id.buttonBrackets);
        buttonPercent = findViewById(R.id.buttonPercent);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonPlMi = findViewById(R.id.buttonPlMi);
        buttonDot = findViewById(R.id.buttonDot);
        buttonEqually = findViewById(R.id.buttonEqually);
        numberField = findViewById(R.id.numberField);
        numberFieldResult = findViewById(R.id.numberFieldResult);
        buttonSettings = findViewById(R.id.buttonSettings);
    }

    private void initButtons() {
        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonDelete.setOnClickListener(this);
        buttonBrackets.setOnClickListener(this);
        buttonPercent.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonPlMi.setOnClickListener(this);
        buttonDot.setOnClickListener(this);
        buttonEqually.setOnClickListener(this);
        buttonSettings.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case (R.id.button0):
                setNumber(R.id.button0);
                break;
            case (R.id.button1):
                setNumber(R.id.button1);
                break;
            case (R.id.button2):
                setNumber(R.id.button2);
                break;
            case (R.id.button3):
                setNumber(R.id.button3);
                break;
            case (R.id.button4):
                setNumber(R.id.button4);
                break;
            case (R.id.button5):
                setNumber(R.id.button5);
                break;
            case (R.id.button6):
                setNumber(R.id.button6);
                break;
            case (R.id.button7):
                setNumber(R.id.button7);
                break;
            case (R.id.button8):
                setNumber(R.id.button8);
                break;
            case (R.id.button9):
                setNumber(R.id.button9);
                break;
            case (R.id.buttonDel):
                calculator.clear();
                break;
            case (R.id.buttonEqually):
                calculator.setEqual();
                break;
            case (R.id.buttonPlus):
                calculator.setChangeSing();
                break;
            case (R.id.buttonSettings):
                settingsClick();
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != REQUEST_CODE) {
            super.onActivityResult(requestCode, resultCode, data);
        }
        if (resultCode == RESULT_OK) {
            recreate();
        }
    }

//    private void setShowResult() {
//        numberFieldResult.setText(calculator.getStringResult());
//        numberField.setText(calculator.getStringFirstNumber());
//    }

    private void settingsClick() {
        Intent runSettings = new Intent(MainActivity.this, SettingsActivity.class);
        startActivity(runSettings);
    }

    private String getViewText(int id) {
        if (id == R.id.button0) {
            return (String) button0.getText();
        } else if (id == R.id.button1) {
            return (String) button1.getText();
        } else if (id == R.id.button2) {
            return (String) button2.getText();
        } else if (id == R.id.button3) {
            return (String) button3.getText();
        } else if (id == R.id.button4) {
            return (String) button4.getText();
        } else if (id == R.id.button5) {
            return (String) button5.getText();
        } else if (id == R.id.button6) {
            return (String) button6.getText();
        } else if (id == R.id.button7) {
            return (String) button7.getText();
        } else if (id == R.id.button8) {
            return (String) button8.getText();
        } else if (id == R.id.button9) {
            return (String) button9.getText();
        } else if (id == R.id.buttonMultiply) {
            return (String) buttonMultiply.getText();
        } else if (id == R.id.buttonDivide) {
            return (String) buttonDivide.getText();
        } else if (id == R.id.buttonMinus) {
            return (String) buttonMinus.getText();
        } else if (id == R.id.buttonPlus) {
            return (String) buttonPlus.getText();
        } else {
            return "";
        }
    }

    private void setNumber(int buttonId) {
        calculator.setNumber(getViewText(buttonId));
//        setShowResult();
    }
}