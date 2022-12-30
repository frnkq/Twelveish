package com.layoutxml.twelveish.preferences;

import android.content.Context;
import android.content.SharedPreferences;

import com.layoutxml.twelveish.R.string;

public class WatchFacePreferences {
    private final SharedPreferencesWrapper preferences;

    public WatchFacePreferences(Context context, SharedPreferences sharedPreferences) {
        this.preferences = new SharedPreferencesWrapper(context, sharedPreferences);
    }

    public int getCounter() {
        return this.preferences.getIntPreference(string.preference_counter, DefaultPreferences.getCounter());
    }

    public void setCounter(int counter) {
        this.preferences.putIntPreference(string.preference_counter, counter);
    }

    public int getBackgroundColor() {
        return this.preferences.getIntPreference(string.preference_background_color, DefaultPreferences.getBackgroundColor());
    }

    public void setBackgroundColor(int backgroundColor) {
        this.preferences.putIntPreference(string.preference_background_color, backgroundColor);
    }

    public int getMainColor() {
        return this.preferences.getIntPreference(string.preference_main_color, DefaultPreferences.getMainColor());
    }

    public void setMainColor(int mainColor) {
        this.preferences.putIntPreference(string.preference_main_color, mainColor);
    }

    public int getMainColorAmbient() {
        return this.preferences.getIntPreference(string.preference_main_color_ambient, DefaultPreferences.getMainColorAmbient());
    }

    public void setMainColorAmbient(int mainColorAmbient) {
        this.preferences.putIntPreference(string.preference_main_color_ambient, mainColorAmbient);
    }

    public int getSecondaryColor() {
        return this.preferences.getIntPreference(string.preference_secondary_color, DefaultPreferences.getSecondaryColor());
    }

    public void setSecondaryColor(int secondaryColor) {
        this.preferences.putIntPreference(string.preference_secondary_color, secondaryColor);
    }

    public int getSecondaryColorAmbient() {
        return this.preferences.getIntPreference(string.preference_secondary_color_ambient, DefaultPreferences.getSecondaryColorAmbient());
    }

    public void setSecondaryColorAmbient(int secondaryColorAmbient) {
        this.preferences.putIntPreference(string.preference_secondary_color_ambient, secondaryColorAmbient);
    }

    public int getDateOrder() {
        return this.preferences.getIntPreference(string.preference_date_order, DefaultPreferences.getDateOrder());
    }

    public void setDateOrder(int dateOrder) {
        this.preferences.putIntPreference(string.preference_date_order, dateOrder);
    }

    public int getCapitalisation() {
        return this.preferences.getIntPreference(string.preference_capitalisation, DefaultPreferences.getCapitalisation());
    }

    public void setCapitalisation(int capitalisation) {
        this.preferences.putIntPreference(string.preference_capitalisation, capitalisation);
    }

    public int getMainTextOffset() {
        return this.preferences.getIntPreference(string.preference_main_text_offset, DefaultPreferences.getMainTextOffset());
    }

    public void setMainTextOffset(int mainTextOffset) {
        this.preferences.putIntPreference(string.preference_main_text_offset, mainTextOffset);
    }

    public int getSecondaryTextOffset() {
        return this.preferences.getIntPreference(string.preference_secondary_text_offset, DefaultPreferences.getSecondaryTextOffset());
    }

    public void setSecondaryTextOffset(int secondaryTextOffset) {
        this.preferences.putIntPreference(string.preference_secondary_text_offset, secondaryTextOffset);
    }

    public boolean getShowedTutorialAlready() {
        return this.preferences.getBooleanPreference(string.preference_showed_tutorial, DefaultPreferences.getShowedTutorialAlready());
    }

    public void setShowedTutorialAlready(boolean showedTutorialAlready) {
        this.preferences.putBooleanPreference(string.preference_showed_tutorial, showedTutorialAlready);
    }

    public boolean getShowedDonateAlready() {
        return this.preferences.getBooleanPreference(string.preference_showed_donate, DefaultPreferences.getShowedDonateAlready());
    }

    public void setShowedDonateAlready(boolean showedDonateAlready) {
        this.preferences.putBooleanPreference(string.preference_showed_donate, showedDonateAlready);
    }

    public boolean getShowedRateAlready() {
        return this.preferences.getBooleanPreference(string.preference_showed_rate_already, DefaultPreferences.getShowedRateAlready());
    }

    public void setShowedRateAlready(boolean showedRateAlready) {
        this.preferences.putBooleanPreference(string.preference_showed_rate_already, showedRateAlready);
    }

    public boolean getMilitaryTime() {
        return this.preferences.getBooleanPreference(string.preference_military_time, DefaultPreferences.getMilitaryTime());
    }

    public void setMilitaryTime(boolean militaryTime) {
        this.preferences.putBooleanPreference(string.preference_military_time, militaryTime);
    }

    public boolean getMilitaryTextTime() {
        return this.preferences.getBooleanPreference(string.preference_militarytext_time, DefaultPreferences.getMilitaryTextTime());
    }

    public void setMilitaryTextTime(boolean militaryTextTime) {
        this.preferences.putBooleanPreference(string.preference_militarytext_time, militaryTextTime);
    }

    public boolean getShowSecondary() {
        return this.preferences.getBooleanPreference(string.preference_show_secondary, DefaultPreferences.getShowSecondary());
    }

    public void setShowSecondary(boolean showSecondary) {
        this.preferences.putBooleanPreference(string.preference_show_secondary, showSecondary);
    }

    public boolean getShowSecondaryActive() {
        return this.preferences.getBooleanPreference(string.preference_show_secondary_active, DefaultPreferences.getShowSecondaryActive());
    }

    public void setShowSecondaryActive(boolean showSecondaryActive) {
        this.preferences.putBooleanPreference(string.preference_show_secondary_active, showSecondaryActive);
    }

    public boolean getShowSecondaryCalendar() {
        return this.preferences.getBooleanPreference(string.preference_show_secondary_calendar, DefaultPreferences.getShowSecondaryCalendar());
    }

    public void setShowSecondaryCalendar(boolean showSecondaryCalendar) {
        this.preferences.putBooleanPreference(string.preference_show_secondary_calendar, showSecondaryCalendar);
    }

    public boolean getShowSecondaryCalendarActive() {
        return this.preferences.getBooleanPreference(string.preference_show_secondary_calendar_active, DefaultPreferences.getShowSecondaryCalendarActive());
    }

    public void setShowSecondaryCalendarActive(boolean showSecondaryCalendarActive) {
        this.preferences.putBooleanPreference(string.preference_show_secondary_calendar_active, showSecondaryCalendarActive);
    }

    public boolean getShowBattery() {
        return this.preferences.getBooleanPreference(string.preference_show_battery, DefaultPreferences.getShowBattery());
    }

    public void setShowBattery(boolean showBattery) {
        this.preferences.putBooleanPreference(string.preference_show_battery, showBattery);
    }

    public boolean getShowBatteryAmbient() {
        return this.preferences.getBooleanPreference(string.preference_show_battery_ambient, DefaultPreferences.getShowBatteryAmbient());
    }

    public void setShowBatteryAmbient(boolean showBatteryAmbient) {
        this.preferences.putBooleanPreference(string.preference_show_battery_ambient, showBatteryAmbient);
    }

    public boolean getShowDay() {
        return this.preferences.getBooleanPreference(string.preference_show_day, DefaultPreferences.getShowDay());
    }

    public void setShowDay(boolean showDay) {
        this.preferences.putBooleanPreference(string.preference_show_day, showDay);
    }

    public boolean getShowDayAmbient() {
        return this.preferences.getBooleanPreference(string.preference_show_day_ambient, DefaultPreferences.getShowDayAmbient());
    }

    public void setShowDayAmbient(boolean showDayAmbient) {
        this.preferences.putBooleanPreference(string.preference_show_day_ambient, showDayAmbient);
    }

    public boolean getShowSeconds() {
        return this.preferences.getBooleanPreference(string.preference_show_seconds, DefaultPreferences.getShowSeconds());
    }

    public void setShowSeconds(boolean showSeconds) {
        this.preferences.putBooleanPreference(string.preference_show_seconds, showSeconds);
    }

    public boolean getShowComplications() {
        return this.preferences.getBooleanPreference(string.preference_show_complications, DefaultPreferences.getShowComplication());
    }

    public void setShowComplications(boolean showComplications) {
        this.preferences.putBooleanPreference(string.preference_show_complications, showComplications);
    }

    public boolean getShowComplicationAmbient() {
        return this.preferences.getBooleanPreference(string.preference_show_complications_ambient, DefaultPreferences.getShowComplicationAmbient());
    }

    public void setShowComplicationAmbient(boolean showComplicationAmbient) {
        this.preferences.putBooleanPreference(string.preference_show_complications_ambient, showComplicationAmbient);
    }

    public boolean getDisableComplicationTap() {
        return this.preferences.getBooleanPreference(string.preference_disable_complication_tap, DefaultPreferences.getDisableComplicationTap());
    }

    public void setDisableComplicationTap(boolean disableComplicationTap) {
        this.preferences.putBooleanPreference(string.preference_disable_complication_tap, disableComplicationTap);
    }

    public boolean getComplicationLeftSet() {
        return this.preferences.getBooleanPreference(string.preference_complication_left_set, DefaultPreferences.getComplicationLeftSet());
    }

    public void setComplicationLeftSet(boolean complicationLeftSet) {
        this.preferences.putBooleanPreference(string.preference_complication_left_set, complicationLeftSet);
    }

    public boolean getComplicationRightSet() {
        return this.preferences.getBooleanPreference(string.preference_complication_right_set, DefaultPreferences.getComplicationRightSet());
    }

    public void setComplicationRightSet(boolean complicationRightSet) {
        this.preferences.putBooleanPreference(string.preference_complication_right_set, complicationRightSet);
    }

    public String getDateSeparator() {
        return this.preferences.getStringPreference(string.preference_date_separator, DefaultPreferences.getDateSeparator());
    }

    public void setDateSeparator(String dateSeparator) {
        this.preferences.putStringPreference(string.preference_date_separator, dateSeparator);
    }

    public String getLanguage() {
        return this.preferences.getStringPreference(string.preference_language, DefaultPreferences.getLanguage());
    }

    public void setLanguage(String language) {
        this.preferences.putStringPreference(string.preference_language, language);
    }

    public String getFont() {
        return this.preferences.getStringPreference(string.preference_font, DefaultPreferences.getFont());
    }

    public void setFont(String font) {
        this.preferences.putStringPreference(string.preference_font, font);
    }

    /*
    private void putIntPreference(int key, int value){
        this.sharedPreferences.edit().putInt(this.preferences.getStringFromContext(key), value).apply();
    }

    private int getIntPreference(int key, int defaultValue) {
        return this.sharedPreferences.getInt(this.preferences.getStringFromContext(key), defaultValue);
    }

    private void putBooleanPreference(int key, boolean value){
        this.sharedPreferences.edit().putBoolean(this.preferences.getStringFromContext(key), value).apply();
    }

    private boolean getBooleanPreference(int key, boolean defaultValue){
        return this.sharedPreferences.getBoolean(this.preferences.getStringFromContext(key), defaultValue);
    }

    private void putStringPreference(int key, String value){
        this.sharedPreferences.edit().putString(this.preferences.getStringFromContext(key), value).apply();
    }

    private String getStringPreference(int key, String defaultValue){
        return this.sharedPreferences.getString(this.preferences.getStringFromContext(key), defaultValue);
    }

    private String getStringFromContext(int key) {
        return context.getString(key);
    }
     */
}
