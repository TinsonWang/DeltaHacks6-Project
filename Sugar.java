// sugar in condiments sourced from: https://www.insider.com/how-much-sugar-in-ketchup-bbq-sauce-condiments-2018-5 //
// red bull value sourced from: https://www.yahoo.com/lifestyle/what-the-amount-of-sugar-in-a-single-red-bull-125210136716.html //
// honey value sourced from: https://www.reference.com/world-view/many-grams-sugar-teaspoon-honey-fdcfc7f5b69287ed //
// cotton candy: https://www.fatsecret.com/calories-nutrition/nestle/aero-chocolate-bar //
// aero: https://www.fatsecret.com/calories-nutrition/nestle/aero-chocolate-bar //
// french fries: https://nutritiondata.self.com/facts/fast-foods-generic/8054/2 //
// airheads: https://www.sparkpeople.com/calories-in.asp?food=airheads+candy //
// churro: https://www.fatsecret.com/calories-nutrition/generic/churros //
// skittles: https://www.livestrong.com/article/280965-nutrition-facts-on-skittles-candy/ //


import java.util.Random;
import java.util.Scanner;
import  java.lang.Math;
public class Sugar {

	public static void main(String[] args)
	{
		int upperbound=22;
		double calculated=0;
		double[]GramList={11,22,10,33,15,49,0.6,14,17, 4, 1, 2, 8.5, 23, 27, 26, 25, 0.2, 9, 6.55, 42};
		String[]GramName= {"Chips Ahoy Cookie","StarBurst","apple","Mars Bar","brownie","Kit Kat","strawberry","banana",
		"Hershey Bar", "tbsp of Heinz Ketchup", "tbsp of Sriracha", "tbsp of Kikkoman Teriyaki Sauce", "tbsp of Kikkoman Hoisin Sauce",
		"Tootsie Roll", "can of Red Bull", "ounce of cotton candy", "Aero Chocolate Bar", "serving of McDonald's French Fries",
		"Airheads candy", "churro", "pack of Skittles", };
		String[]GramNames= {"Chips Ahoy Cookies","StarBurst","apples","Mars Bar","brownies","Kit Kat","strawberries","bananas",
		"Hershey Bars", "tbsps of Heinz Ketchup", "tbsps of Sriracha", "tbsp of Kikkoman Teriyaki Sauce", "tbsps of Kikkoman Teriyaki Sauce",
		"Tootsie Rolls", "cans of Red Bull", "ounces of cotton candy", "Aero Chocolate Bars", "servings of McDonald's French Fries",
		"Airheads candies", "churros", "packs of Skittles", };



		//CREATING RANDOM OBJECT
		Random rand= new Random();

		//SETTING BOUNDS
		int int_random=rand.nextInt(upperbound);

		//OUTPUT AND READING INPUT
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter in your grams of sugar");
		double val = myObj.nextDouble();

		//MATH AND ROUNDING
		calculated = (val/(GramList[int_random]));
		if (calculated >= 1)
		{
			calculated= 100*(val/(GramList[int_random]));
			calculated=Math.round(calculated);
			//print statement
			System.out.printf("That is equivalent to approximately %f %s\n", calculated/100, GramNames[int_random]);
		}
		else if (calculated < 0)
		{
			calculated=Math.round(calculated);
			//print statement
			System.out.printf("That is equivalent to approximately %.1f %s\n", calculated, GramNames[int_random]);
		}
		else if (calculated == 1)
		{
			System.out.printf("That is equivalent to approximately %f %s\n", calculated, GramName[int_random]);

		}
	}

}
