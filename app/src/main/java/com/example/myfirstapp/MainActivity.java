package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.widget.EditText;
import android.widget.TextView;
import android.text.TextWatcher;

import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {

    private EditText Red_input;
    private EditText Green_input;
    private EditText Blue_input;
    private TextView label;
    int red;
    int green;
    int blue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Declare variables and objects */
        Red_input = (EditText) findViewById(R.id.red_input);
        Green_input = (EditText) findViewById(R.id.green_input);
        Blue_input = (EditText) findViewById(R.id.blue_input);
        label = (TextView) findViewById(R.id.Coldisplay);

        Red_input.addTextChangedListener(redtch);
        Green_input.addTextChangedListener(redtch);
        Blue_input.addTextChangedListener(redtch);
    }


    TextWatcher redtch = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            try {
                red = Integer.parseInt(Red_input.getText().toString());
                green = Integer.parseInt(Green_input.getText().toString());
                blue = Integer.parseInt(Blue_input.getText().toString());
            }
            catch (NumberFormatException e) {
                //No number
            }
            colorchange();
        }
    };

    public void colorchange() {

        if(red < 0)
            red = 0;
        else if (red > 255) red = 255;

        if(green < 0)
            green = 0;
        else if (green > 255) green = 255;

        if(blue < 0)
            blue = 0;
        else if (blue > 255) blue = 255;

        String Col = "#" + red + green + blue;
        label.setBackgroundColor(Color.rgb(red,green,blue));
    }

}
