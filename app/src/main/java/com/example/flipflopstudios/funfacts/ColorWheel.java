package com.example.flipflopstudios.funfacts;

import java.util.Random;

/**
 * Created by chrisrasch on 10/16/14.
 */
public class ColorWheel {

    //Member variables (properties about the object)
    public String mColors[] = {
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

    //Method (things the object can do)
    public String getFacts() {


        //The button was clicked so update the fact label with new fact
        String fact = "";

        //Randomly select a fact
        Random randomGenerator = new Random(); //Construct a new random number generator
        int randomNumber = randomGenerator.nextInt(mColors.length);

        fact = mColors[randomNumber];

        return fact;


    }

}
