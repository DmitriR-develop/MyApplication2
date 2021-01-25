package com.dmitri.myapplication;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

abstract class ThemeActivity extends AppCompatActivity {
    protected final static int LIGHT_THEME = 0;
    protected final static int DARK_THEME = 1;
    private final static String THEME_CHOICE = "THEME_CHOICE";
    private final static String THEME_SAVED = "THEME_SAVED";
    private final static String NAME = "CALCULATOR";
    protected int themeChoice;
    protected int themeSaved;

    protected int getThemeChoice() {
        return themeChoice;
    }

    protected void setThemChoice(int themeChoice) {
        this.themeChoice = themeChoice;
    }

    protected int getThemeSaved() {
        return themeSaved;
    }

    protected void setThemeSaved(int themeSaved) {
        this.themeSaved = themeSaved;
    }

    protected int getTheme(int themeId) {
        switch (themeId) {
            case DARK_THEME:
                return R.style.DarkTheme;
            default:
                return R.style.MyStyleTheme;
        }
    }

    protected int getAppThemeChoice(int themeDefault) {
        SharedPreferences sharedPreferences = getSharedPreferences(NAME, MODE_PRIVATE);
        return sharedPreferences.getInt(THEME_CHOICE, themeDefault);
    }

    protected int getAppThemeSaved(int themeDefault) {
        SharedPreferences sharedPreferences = getSharedPreferences(NAME, MODE_PRIVATE);
        return sharedPreferences.getInt(THEME_SAVED, themeDefault);
    }

    public void setTheme() {
        SharedPreferences sharedPreferences = getSharedPreferences(NAME, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(THEME_CHOICE, getThemeChoice());
        editor.putInt(THEME_SAVED, getThemeSaved());
        editor.apply();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setThemeSaved(LIGHT_THEME);
        setThemChoice(LIGHT_THEME);
    }
}
