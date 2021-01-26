package com.example.myfirstapp;

import android.graphics.Color;
import android.widget.Button;

public class TrafficLight {

    public String Btext;

    public String getBText(Button bton) {
        return (String) bton.getText();
    }

    public void buttonLight (Button b) {
        Btext = getBText(b);
        if(Btext.equals("STOP")) {
            b.setText("GO");
            b.setBackgroundColor(Color.GREEN);
        }
        else if(Btext.equals("GO")){
            b.setText("WAIT");
            b.setBackgroundColor(Color.YELLOW);
        }
        else {
            b.setText("STOP");
            b.setBackgroundColor(Color.RED);
        }
    }
}
