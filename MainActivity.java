package com.example.deltahacks;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected  void onCreate(Bundle savedInstanceState) {
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
               // button_calorie.setText(text_calorie.getText().toString());
            }
        });

        final Button button_sugar = findViewById(R.id.sugar);
        button_sugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText text_sugar = findViewById(R.id.value);
                TextView display_sugar = findViewById(R.id.result);

                String sugarVal = text_sugar.getText().toString();
                int sugar_val= Integer.parseInt(sugarVal);
                int upperbound=22;
                double calculated=0;
                double[]GramList={11,22,10,33,15,49,0.6,14,17, 4, 1, 2, 8.5, 23, 27, 26, 25, 0.2, 9, 6.55, 42};
                String[]GramNames= {"Chips Ahoy Cookies","StarBurst","apples","Mars Bar","brownies","Kit Kat","strawberries","bananas",
                        "Hershey Bars", "tbsps of Heinz Ketchup", "tbsps of Sriracha", "tbsp of Kikkoman Teriyaki Sauce", "tbsps of Kikkoman Teriyaki Sauce",
                        "Tootsie Rolls", "cans of Red Bull", "ounces of cotton candy", "Aero Chocolate Bars", "servings of McDonald's French Fries",
                        "Airheads candies", "churros", "packs of Skittles" };
                String[]GramName= {"Chips Ahoy Cookie","StarBurst","apple","Mars Bar","brownie","Kit Kat","strawberry","banana",
                        "Hershey Bar", "tbsp of Heinz Ketchup", "tbsp of Sriracha", "tbsp of Kikkoman Teriyaki Sauce", "tbsp of Kikkoman Hoisin Sauce",
                        "Tootsie Roll", "can of Red Bull", "ounce of cotton candy", "Aero Chocolate Bar", "serving of McDonald's French Fries",
                        "Airheads candy", "churro", "pack of Skittles", };
                //MATH AND ROUNDING
                int val = Integer.parseInt(text_sugar.getText().toString());

                //CREATING RANDOM OBJECT
                Random rand= new Random();

                //SETTING BOUNDS
                int int_random=rand.nextInt(upperbound);


                //MATH AND ROUNDING
                calculated = (val/(GramList[int_random]));
                if (calculated >= 1)
                {
                    calculated= 100*(val/(GramList[int_random]));
                    calculated=Math.round(calculated);
                    //print statement
                    display_sugar.setText("That is equivalent to approximately "+ calculated/100+" "+ GramNames[int_random]);
                }
                else if ( (calculated <1) && (calculated>0) )
                {
                    calculated=Math.round(calculated);
                    //print statement
                    display_sugar.setText("That is equivalent to approximately "+ calculated+" "+ GramNames[int_random]);
                }
                else if (calculated == 1)
                {
                    String proteinFood=GramNames[int_random];
                    display_sugar.setText("That is equivalent to approximately "+ calculated+" "+GramName[int_random]);

                }

            }
        });


        final Button button_fat = findViewById(R.id.fat);
        button_fat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText text_fat = findViewById(R.id.value);
                //button_fat.setText(text_fat.getText().toString());
            }
        });

        final Button button_protein = findViewById(R.id.protein);
        button_protein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText text_protein = findViewById(R.id.value);
                TextView display_protein= findViewById(R.id.result);
                int upperbound = 41;
                double calculated = 0;
                double[]GramList_pro = {6, 2.875, 28, 8, 8, 24, 24, 8.33, 7.667, 8.33, 7.667, 7, 8, 7.33, 7, 7.667, 6, 8.667, 8, 8, 8, 7, 6, 5, 7, 6, 6, 13, 20, 52, 4, 3, 4, 4, 16, 7, 6, 4, 8};
                String[]GramName_pro = {"large egg", "ounce of yogurt", "cup of cottage cheese", "ounce of swiss cheese", "cup of 2% milk"
                        , "scoop of whey protein", "scoop of casein protein", "ounce of yellowfin tuna", "ounce of halibut", "ounce of octopus",
                        "ounce of sockeye salmon", "ounce of tilapia", "ounce of anchovies", "ounce of tuna", "ounce of sardines",
                        "ounce of round steak", "ounce of 90% lean ground beef", "ounce of boneless pork chops",
                        "ounces of boneless skinless chicken breast", "ounce of turkey breast", "ounce of corned beef",
                        "ounce of canned chicken", "ounce of roast beef", "ounce of canadian bacon", "ounce of chorizo",
                        "ounce of pepperoni", "ounce of roasted turkey breast", "ounce of beef jerky", "cup of navy beans",
                        "cup of dried lentils", "tbsp of peanut butter", "ounce of mixed nuts", "ounce of bean chips", "ounce of tofu",
                        "cup of edamame", "cup of green peas", "ounce of wheat germ", "ounce of soba noodles", "cup of quinoa"};
                String[]GramNames_pro = {"large eggs", "ounces of yogurt", "cups of cottage cheese", "ounces of swiss cheese",
                        "cups of 2% milk", "scoops of whey protein", "scoops of casein protein", "ounces of yellowfin tuna",
                        "ounces of halibut", "ounces of octopus", "ounces of sockeye salmon", "ounces of tilapia", "ounce of anchovies",
                        "ounces of tuna", "ounces of sardines", "ounces of round steak", "ounces of 90% lean ground beef",
                        "ounces of boneless pork chops", "ounces of boneless skinless chicken breast", "ounces of turkey breast",
                        "ounces of corned beef", "ounces of canned chicken", "ounces of roast beef", "ounces of canadian bacon",
                        "ounces of chorizo", "ounces of pepperoni", "ounces of roasted turkey breast", "ounces of beef jerky",
                        "cups of navy beans", "cups of dried lentils", "tbsps of peanut butter", "ounces of mixed nuts",
                        "ounces of bean chips", "ounces of tofu", "cups of edamame", "cups of green peas", "ounces of wheat germ",
                        "ounces of soba noodles", "cups of quinoa"};



                int val = Integer.parseInt(text_protein.getText().toString());

                //CREATING RANDOM OBJECT
                Random rand= new Random();

                //SETTING BOUNDS
                int int_random=rand.nextInt(upperbound);


                //MATH AND ROUNDING
                calculated = (val/(GramList_pro[int_random]));
                if (calculated >= 1)
                {
                    calculated= 100*(val/(GramList_pro[int_random]));
                    calculated=Math.round(calculated);
                    //print statement
                    display_protein.setText("That is equivalent to approximately "+ calculated/100+" "+ GramNames_pro[int_random]);
                }
                else if ( (calculated <1) && (calculated>0) )
                {
                    calculated=Math.round(calculated);
                    //print statement
                    display_protein.setText("That is equivalent to approximately "+ calculated+" "+ GramNames_pro[int_random]);
                }
                else if (calculated == 1)
                {
                    String proteinFood=GramNames_pro[int_random];
                    display_protein.setText("That is equivalent to approximately "+ calculated+" "+GramName_pro[int_random]);

                }





              //  button_sodium.setText(text_sodium.getText().toString());
            }
        });


    }
}

