package com.dmitri.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

class Calculator implements Parcelable {
    private double result;
    private double firstNumber;
    private char sign;
    private boolean comaAdded;
    private boolean equalPress;
    private int afterDot;
    private final char EMPTY_CHAR = Character.MIN_VALUE;
    private final char PLUS = '+';
    private final char MINUS = '-';
    private final char MULTIPLY = '*';
    private final char DIVIDE = '/';

    public Calculator() {
        this.result = 0.0;
        this.firstNumber = 0.0;
        this.comaAdded = false;
        this.afterDot = 0;
        setEqualPress(false);
        clearSing();
    }


    protected Calculator(Parcel in) {
        result = in.readDouble();
        firstNumber = in.readDouble();
        sign = (char) in.readInt();
        comaAdded = in.readByte() != 0;
        equalPress = in.readByte() != 0;
        afterDot = in.readInt();
    }

    public static final Creator<Calculator> CREATOR = new Creator<Calculator>() {
        @Override
        public Calculator createFromParcel(Parcel in) {
            return new Calculator(in);
        }

        @Override
        public Calculator[] newArray(int size) {
            return new Calculator[size];
        }
    };

    private void setEqualPress(boolean equalPress) {
        this.equalPress = equalPress;
    }

    void setEqual() {
        if (sign == EMPTY_CHAR) {
            return;
        }
        if (firstNumber == 0.0) {
            makeCalculating(result, result);
        } else {
            makeCalculating(result, firstNumber);
        }
        resetNumbers();
        clearSing();
        setEqualPress(true);
    }

    protected void clearSing() {
        this.sign = EMPTY_CHAR;
    }

    private void resetNumbers() {
        result = firstNumber;
        firstNumber = 0.0;
        afterDot = 0;
        setComma(false);
    }

    private void makeCalculating(double fNumber, double sNumber) {
        switch (sign) {
            case PLUS:
                firstNumber = fNumber + sNumber;
                break;
            case MINUS:
                firstNumber = fNumber - sNumber;
                break;
            case MULTIPLY:
                firstNumber = fNumber * sNumber;
                break;
            case DIVIDE:
                firstNumber = fNumber / sNumber;
        }
    }

    protected void setChangeSing() {
        firstNumber = firstNumber * -1.0;
    }

    private void setComma(boolean commaAdded) {
        this.comaAdded = commaAdded;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }

    protected void clear() {
        result = firstNumber;
        firstNumber = 0.0;
    }

    protected String setNumber(String button) {
        return button;
    }
}
