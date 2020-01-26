package com.example.zoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //grabbing the button component based on the 'id' given in the xml file and putting it into a variable
        final Button button_calorie = findViewById(R.id.calorie);
        //basically checks to see if the button is clicked or not
        button_calorie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //grab the edit text component based on the 'id' given in the xml file.
                EditText text_calorie = findViewById(R.id.value);
                //set the text of the button to the text inside the edit text component
                button_calorie.setText(text_calorie.getText().toString());
            }
        });

        final Button button_sugar = findViewById(R.id.sugar);
        button_sugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText text_sugar = findViewById(R.id.value);
                button_sugar.setText(text_sugar.getText().toString());
            }
        });

        final Button button_fat = findViewById(R.id.fat);
        button_fat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText text_fat = findViewById(R.id.value);
                button_fat.setText(text_fat.getText().toString());
            }
        });

        final Button button_sodium = findViewById(R.id.sodium);
        button_sodium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText text_sodium = findViewById(R.id.value);
                button_sodium.setText(text_sodium.getText().toString());
            }
        });


    }
}
