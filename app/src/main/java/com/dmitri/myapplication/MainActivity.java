package com.dmitri.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView numberField;
    private Double result = null;
    private String number;
    private boolean isClean = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        numberField = findViewById(R.id.numberField);

        initButton1CL();
        initButton2CL();
        initButton3CL();
        initButton4CL();
        initButton5CL();
        initButton6CL();
        initButton6CL();
        initButton7CL();
        initButton8CL();
        initButton9CL();
        initButton0CL();
        initButtonDelete();
        initButtonPlus();
        initButtonMinus();
        initButtonDivide();
        initButtonMultiply();
        initButtonEqually();
        initButtonDot();
        initButtonPlMi();
    }

    private void initButton1CL() {
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this);

    }

    private void initButton2CL() {
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);

    }

    private void initButton3CL() {
        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(this);

    }

    private void initButton4CL() {
        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(this);

    }

    private void initButton5CL() {
        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(this);

    }

    private void initButton6CL() {
        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(this);

    }

    private void initButton7CL() {
        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(this);

    }

    private void initButton8CL() {
        Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(this);

    }

    private void initButton9CL() {
        Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(this);

    }

    private void initButton0CL() {
        Button button0 = findViewById(R.id.button0);
        button0.setOnClickListener(this);

    }

    private void initButtonDelete() {
        Button buttonDel = findViewById(R.id.buttonDel);
        buttonDel.setOnClickListener(this);
    }

    private void initButtonPlus() {
        Button buttonPlus = findViewById(R.id.buttonPlus);
        buttonPlus.setOnClickListener(this);
    }

    private void initButtonMinus() {
        Button buttonMinus = findViewById(R.id.buttonMinus);
        buttonMinus.setOnClickListener(this);
    }

    private void initButtonDivide() {
        Button buttonPercent = findViewById(R.id.buttonDivide);
        buttonPercent.setOnClickListener(this);
    }

    private void initButtonMultiply() {
        Button buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonMultiply.setOnClickListener(this);
    }

    private void initButtonEqually() {
        Button buttonEqually = findViewById(R.id.buttonEqually);
        buttonEqually.setOnClickListener(this);
    }

    private void initButtonDot() {
        Button buttonDot = findViewById(R.id.buttonDot);
        buttonDot.setOnClickListener(this);
    }

    private void initButtonPlMi() {
        Button buttonPlMi = findViewById(R.id.buttonPlMi);
        buttonPlMi.setOnClickListener(this);
    }

    private void setTextNumberField() {
        number = numberField.getText().toString();
    }

    private void delTextNumberField() {
        numberField.setText("");
    }

    @Override
    public void onClick(View v) {
        if (isClean) {
            numberField.setText("");
        }
        isClean = false;
        setTextNumberField();
        switch (v.getId()) {
            case R.id.button1:
                number += "1";
                break;
            case R.id.button2:
                number += "2";
                break;
            case R.id.button3:
                number += "3";
                break;
            case R.id.button4:
                number += "4";
                break;
            case R.id.button5:
                number += "5";
                break;
            case R.id.button6:
                number += "6";
                break;
            case R.id.button7:
                number += "7";
                break;
            case R.id.button8:
                number += "8";
                break;
            case R.id.button9:
                number += "9";
                break;
            case R.id.button0:
                number += "0";
                break;
//            case R.id.buttonDel:
//                delTextNumberField();
//                break;
//            case R.id.buttonPlus:
//                number += "+";
//                break;
//            case R.id.buttonMinus:
//                number += "-";
//                break;
//            case R.id.buttonDivide:
//                number += "/";
//                break;
//            case R.id.buttonMultiply:
//                number += "*";
//                break;
            case R.id.buttonDot:
                number += ".";
                break;
            case R.id.buttonPlMi:
                number += "-" + number;
        }
        numberField.setText(number);
    }


}