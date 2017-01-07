package com.jamil.favoritecolor.model;

import android.graphics.Color;

public class ColorParser {

    public static int getColorNumFromString(String name)
    {
        try {
            return Color.parseColor(name.toUpperCase());
        } catch (IllegalArgumentException e) {
            return Color.parseColor("white"); // Default
        }
    }
}
