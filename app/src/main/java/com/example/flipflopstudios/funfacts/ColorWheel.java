package com.example.flipflopstudios.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by chrisrasch on 10/16/14.
 */
public class ColorWheel {

    //Member variables (properties about the object)
    public String mColors[];

    //Method (things the object can do)
    public int getColors() {


        //The button was clicked so update the fact label with new fact
        String color = "";

        //Randomly select a fact
        Random randomGenerator = new Random(); //Construct a new random number generator
        int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;


    }

}
