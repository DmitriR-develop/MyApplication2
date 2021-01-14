package com.dmitri.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView numberField;
    private EditText editText1;
    private EditText editArithmetic;
    private EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        numberField = findViewById(R.id.numberField);
        editText1 = findViewById(R.id.editText1);
        editArithmetic = findViewById(R.id.editArithmetic);
        editText2 = findViewById(R.id.editText2);

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
        Button buttonPercent = findViewById(R.id.buttonPercent);
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

    private void setTextNumberField(int number) {
        numberField.setText(String.format("%d", number));
    }

    private void delTextNumberField() {
        numberField.setText("");
        editText1.setText("");
        editArithmetic.setText("");
        editText2.setText("");
    }

    private void setEditText1(int number) {
        editText1.setText(String.format("%d", number));
    }

    private void setEditText2(int number) {
        editText2.setText(String.format("%d", number));
    }

    private void setEditArithmetic(String arithmetic) {
        editArithmetic.setText(String.format("%s", arithmetic));
    }

    @Override
    public void onClick(View v) {
        if (editText1.length() == 0) {
            switch (v.getId()) {
                case R.id.button1:
                    setEditText1(1);
                    break;
                case R.id.button2:
                    setEditText1(2);
                    break;
                case R.id.button3:
                    setEditText1(3);
                    break;
                case R.id.button4:
                    setEditText1(4);
                    break;
                case R.id.button5:
                    setEditText1(5);
                    break;
                case R.id.button6:
                    setEditText1(6);
                    break;
                case R.id.button7:
                    setEditText1(7);
                    break;
                case R.id.button8:
                    setEditText1(8);
                    break;
                case R.id.button9:
                    setEditText1(9);
                    break;
                case R.id.button0:
                    setEditText1(0);
                    break;
                case R.id.buttonDel:
                    delTextNumberField();
            }
        } else if (editArithmetic.length() == 0) {
            switch (v.getId()) {
                case R.id.buttonPlus:
                    setEditArithmetic("+");
                    break;
                case R.id.buttonMinus:
                    setEditArithmetic("-");
                    break;
                case R.id.buttonDivide:
                    setEditArithmetic("/");
                    break;
                case R.id.buttonMultiply:
                    setEditArithmetic("*");
                    break;
                case R.id.buttonDel:
                    delTextNumberField();
            }
        } else if (editText2.length() == 0) {
            switch (v.getId()) {
                case R.id.button1:
                    setEditText2(1);
                    break;
                case R.id.button2:
                    setEditText2(2);
                    break;
                case R.id.button3:
                    setEditText2(3);
                    break;
                case R.id.button4:
                    setEditText2(4);
                    break;
                case R.id.button5:
                    setEditText2(5);
                    break;
                case R.id.button6:
                    setEditText2(6);
                    break;
                case R.id.button7:
                    setEditText2(7);
                    break;
                case R.id.button8:
                    setEditText2(8);
                    break;
                case R.id.button9:
                    setEditText2(9);
                    break;
                case R.id.button0:
                    setEditText2(0);
                    break;
                case R.id.buttonDel:
                    delTextNumberField();
            }
        } else
            switch (v.getId()) {
                case R.id.buttonDel:
                    delTextNumberField();
            }
    }
}