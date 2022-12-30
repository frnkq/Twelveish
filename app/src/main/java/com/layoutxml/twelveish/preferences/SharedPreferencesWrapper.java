package com.layoutxml.twelveish.preferences;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesWrapper {
    private final Context context;
    private final SharedPreferences sharedPreferences;

    public SharedPreferencesWrapper(Context context, SharedPreferences sharedPreferences){
        this.context = context;
        this.sharedPreferences = sharedPreferences;
    }
    public void putIntPreference(int key, int value){
        this.sharedPreferences.edit().putInt(this.getStringFromContext(key), value).apply();
    }

    public int getIntPreference(int key, int defaultValue) {
        return this.sharedPreferences.getInt(this.getStringFromContext(key), defaultValue);
    }

    public void putBooleanPreference(int key, boolean value){
        this.sharedPreferences.edit().putBoolean(this.getStringFromContext(key), value).apply();
    }

    public boolean getBooleanPreference(int key, boolean defaultValue){
        return this.sharedPreferences.getBoolean(this.getStringFromContext(key), defaultValue);
    }

    public void putStringPreference(int key, String value){
        this.sharedPreferences.edit().putString(this.getStringFromContext(key), value).apply();
    }

    public String getStringPreference(int key, String defaultValue){
        return this.sharedPreferences.getString(this.getStringFromContext(key), defaultValue);
    }

    private String getStringFromContext(int key) {
        return this.context.getString(key);
    }
}
