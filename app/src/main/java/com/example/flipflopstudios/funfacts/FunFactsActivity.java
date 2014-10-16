package com.example.flipflopstudios.funfacts;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class FunFactsActivity extends Activity {

    public static final String TAG = FunFactsActivity.class.getSimpleName();

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        //Declare our view variables and assign them views from layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fact = mFactBook.getFacts();
                int color = mColorWheel.getColors();

                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);


                //Update label with dynamic fact

                factLabel.setText(fact);


            }
        };


        showFactButton.setOnClickListener(listener);

        //Toast.makeText(this,"Our activity was created!",Toast.LENGTH_LONG).show();
        Log.d(TAG,"We're logging from the onCreate method");

    }

}
