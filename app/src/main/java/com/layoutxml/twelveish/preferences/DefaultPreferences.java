package com.layoutxml.twelveish.preferences;

import android.graphics.Color;

public class DefaultPreferences {
    private static final String BLACK  = "#000000";
    private static final String WHITE  = "#FFFFFF";
    private static final String DATE_SEPARATOR = "/";
    private static final int TEXT_OFFSET = 0;

    public static boolean getShowedRateAlready() {
        return false;
    }
    public static int getCounter() {
       return 0;
    }
    public static boolean getShowedTutorialAlready() {
        return false;
    }
    public static boolean getShowedDonateAlready(){
        return false;
    }

    public static int getBackgroundColor(){
        return Color.parseColor(WHITE);
    }

    public static int getMainColor(){
        return Color.parseColor(BLACK);
    }

    public static int getMainColorAmbient() {
        return Color.parseColor(WHITE);
    }

    public static int getSecondaryColor() {
        return Color.parseColor(WHITE) ;
    }

    public static int getSecondaryColorAmbient() {
        return Color.parseColor(WHITE);
    }

    public static boolean getMilitaryTime() {
        return false;
    }
    public static boolean getMilitaryTextTime() {
        return false;
    }
    public static int getDateOrder() {
        return 0;
    }

    public static String getDateSeparator() {
        return DATE_SEPARATOR;
    }

    public static int getCapitalisation() {
        return 0;
    }
    public static boolean getShowSecondary() {
        return true;
    }

    public static boolean getShowSecondaryActive() {
        return true;
    }

    public static boolean getShowSecondaryCalendar() {
        return true;
    }

    public static boolean getShowSecondaryCalendarActive() {
        return true;
    }

    public static boolean getShowBattery() {
        return true;
    }

    public static boolean getShowBatteryAmbient() {
        return true;
    }

    public static boolean getShowDay() {
        return true;
    }

    public static boolean getShowDayAmbient() {
        return true;
    }

    public static boolean getShowSeconds() {
        return true;
    }

    public static boolean getShowComplication() {
        return true;
    }

    public static boolean getShowComplicationAmbient() {
        return true;
    }

    public static String getLanguage() {
        return "en";
    }

    public static String getFont() {
        return "robotolight";
    }

    public static boolean getDisableComplicationTap() {
        return false;
    }

    public static boolean getComplicationLeftSet() {
        return false;
    }

    public static boolean getComplicationRightSet() {
        return false;
    }

    public static int getMainTextOffset() {
        return TEXT_OFFSET;
    }

    public static int getSecondaryTextOffset() {
        return TEXT_OFFSET;
    }
}
