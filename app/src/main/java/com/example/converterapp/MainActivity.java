package com.example.converterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double getAnswer(String before, String after, int num) {
        if (before == after){
            return num / 1;
        }
        else if (before == "mm" && after == "cm"){
            return num / 10;
        }
        else if (before == "cm" && after == "mm"){
            return num * 10;
        }
        else if (before == "mm" && after == "m" || before == "m" && after == "km"){
            return num / 1000;
        }
        else if (before == "m" && after == "mm" || before == "km" && after == "m"){
            return num * 1000;
        }
        else if (before == "mm" && after == "km"){
            return num / 1000000;
        }
        else if (before == "km" && after == "mm"){
            return num * 1000000;
        }
        else if (before == "mm" && after == "inches"){
            return num / 25.4;
        }
        else if (before == "inches" && after == "mm"){
            return num * 25.4;
        }
        else if (before == "mm" && after == "feet"){
            return num / 304.8;
        }
        else if (before == "feet" && after == "mm"){
            return num * 304.8;
        }
        else if (before == "mm" && after == "yard"){
            return num / 914.4;
        }
        else if (before == "yard" && after == "mm"){
            return num * 914.4;
        }
        else if (before == "mm" && after == "miles"){
            return num / 1.609e+6;
        }
        else if (before == "miles" && after == "mm"){
            return num * 1.609e+6;
        }
        else if (before == "cm" && after == "m"){
            return num / 100;
        }
        else if (before == "m" && after == "cm"){
            return num * 100;
        }
        else if (before == "cm" && after == "km"){
            return num / 100000;
        }
        else if (before == "km" && after == "cm"){
            return num * 100000;
        }
        else if (before == "cm" && after == "inches"){
            return num / 2.54;
        }
        else if (before == "inches" && after == "cm"){
            return num * 2.54;
        }
        else if (before == "cm" && after == "feet"){
            return num / 30.48;
        }
        else if (before == "feet" && after == "cm"){
            return num * 30.48;
        }
        else if (before == "cm" && after == "yard"){
            return num / 91.44;
        }
        else if (before == "yard" && after == "cm"){
            return num * 91.44;
        }
        else if (before == "cm" && after == "miles"){
            return num / 160934;
        }
        else if (before == "miles" && after == "centimeters"){
            return num * 160934;
        }
        else if (before == "m" && after == "inches"){
            return num / 0.0254;
        }
        else if (before == "inches" && after == "m"){
            return num * 0.0254;
        }
        else if (before == "m" && after == "feet"){
            return num / 0.3048;
        }
        else if (before == "feet" && after == "m"){
            return num * 0.3048;
        }
        else if (before == "m" && after == "yard"){
            return num / 0.9144;
        }
        else if (before == "yard" && after == "m"){
            return num * 0.9144;
        }
        else if (before == "m" && after == "miles"){
            return num / 1609.34;
        }
        else if (before == "miles" && after == "m"){
            return num * 1609.34;
        }
        else if (before == "km" && after == "inches"){
            return num / 2.54e-5;
        }
        else if (before == "inches" && after == "km"){
            return num * 2.54e-5;
        }
        else if (before == "km" && after == "feet"){
            return num / 0.0003048;
        }
        else if (before == "feet" && after == "km"){
            return num / 0.0003048;
        }
        else if (before == "km" && after == "yard"){
            return num / 0.0009144;
        }
        else if (before == "yard" && after == "km"){
            return num * 0.0009144;
        }
        else if (before == "km" && after == "miles"){
            return num / 1.60934;
        }
        else if (before == "miles" && after == "km"){
            return num * 1.60934;
        }
        else if (before == "inches" && after == "feet"){
            return num / 12;
        }
        else if (before == "feet" && after == "inches"){
            return num * 12;
        }
        else if (before == "inches" && after == "yard"){
            return num / 36;
        }
        else if (before == "yard" && after == "inches"){
            return num * 36;
        }
        else if (before == "inches" && after == "miles"){
            return num / 63360;
        }
        else if (before == "miles" && after == "inches"){
            return num * 63360;
        }
        else if (before == "feet" && after == "yard"){
            return num / 3;
        }
        else if (before == "yard" && after == "feet"){
            return num * 3;
        }
        else if (before == "feet" && after == "miles"){
            return num / 5280;
        }
        else if (before == "miles" && after == "feet"){
            return num * 5280;
        }
        else if (before == "yard" && after == "miles"){
            return num / 1760;
        }
        else if (before == "miles" && after == "yard"){
            return num * 1760;
        }
        return 0;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner leftDropdown = findViewById(R.id.leftSpinner);
        String[] items = new String[]{"mm","cm", "m", "km","inches", "feet","yard","miles"};
        ArrayAdapter<String> leftAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        leftDropdown.setAdapter(leftAdapter);

        Spinner rightDropdown = findViewById(R.id.rightSpinner);
        ArrayAdapter<String> rightAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        rightDropdown.setAdapter(rightAdapter);


        Button convertButton = (Button) findViewById(R.id.convertButton);
        TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String leftChoice = String.valueOf( leftDropdown.getSelectedItem());
                String rightChoice = String.valueOf( rightDropdown.getSelectedItem());

                EditText userNum = (EditText) findViewById(R.id.userInput);
                int num = Integer.valueOf(String.valueOf(userNum.getText().toString()));
                int userInput = Integer.parseInt(String.valueOf(num));
                double result = getAnswer(leftChoice, rightChoice, num);
                resultTextView.setText("The result : " + result + " " + rightChoice);

            }
        });

    }
}