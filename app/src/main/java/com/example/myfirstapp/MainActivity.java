package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Declare variables and objects */

        final Button button1 = (Button) findViewById(R.id.button);
        final TrafficLight BLight = new TrafficLight();
        button1.setText("STOP");
        button1.setBackgroundColor(Color.RED);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BLight.buttonLight(button1);
            }
        });
    }
}
