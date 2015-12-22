package io.github.ruben1.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Home on 17/12/15.
 */
public class ColorWheel {
    // member variables(properties)
    private String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    // methods
    public int getColor() {
        // get random number
        Random randomGenerator = new Random(); //Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(mColors.length);

        // given the random number, return a fact
        return Color.parseColor(mColors[randomNumber]);
    }
}
