package com.example.HelloDroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */

    private TextView message;
    private ImageView droid;
    private View.OnClickListener droidTapListener;
    private int counter = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        InitializeApp();
    }


    private void InitializeApp()
    {
        message = (TextView) findViewById(R.id.message);
        droid = (ImageView) findViewById(R.id.imageView);

        // Define and attach listeners
        droidTapListener = new View.OnClickListener()  {
            public void onClick(View v) {
                TapDroid();
            }
        };
        droid.setOnClickListener(droidTapListener);
    }

    private void TapDroid(){
        counter++;
        String temp;
        switch(counter)
        {
            case 1:
                temp = "once";
                break;
            case 2:
                temp = "twice";
                break;
            default:
                temp = String.format("%d times", counter);
        }
        message.setText(String.format("You touched the droid %s", temp));
    }
}
