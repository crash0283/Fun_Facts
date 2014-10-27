package com.example.flipflopstudios.funfacts;

import java.util.Random;

/**
 * Created by chrisrasch on 10/16/14.
 */
public class FactBook {


    //Member variables (properties about the object)
     public String[] mFacts;

    //Method (things the object can do)
    public String getFacts() {


        //The button was clicked so update the fact label with new fact
        String fact = "";


        //Randomly select a fact
        Random randomGenerator = new Random(); //Construct a new random number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];

        return fact;




    }



}
