import java.util.Random;
import java.util.Scanner;
import  java.lang.Math;
public class Protein {

	public static void main(String[] args)
	{
		int upperbound = 41;
		double calculated = 0;
		double[]GramList = {6, 2.875, 28, 8, 8, 24, 24, 8.33, 7.667, 8.33, 7.667, 7, 8, 7.33, 7, 7.667, 6, 8.667, 8, 8, 8, 7, 6, 5, 7, 6, 6, 13, 20, 52, 4, 3, 4, 4, 16, 7, 6, 4, 8};
        String[]GramName = {"large egg", "ounce of yogurt", "cup of cottage cheese", "ounce of swiss cheese", "cup of 2% milk"
        , "scoop of whey protein", "scoop of casein protein", "ounce of yellowfin tuna", "ounce of halibut", "ounce of octopus",
        "ounce of sockeye salmon", "ounce of tilapia", "ounce of anchovies", "ounce of tuna", "ounce of sardines",
        "ounce of round steak", "ounce of 90% lean ground beef", "ounce of boneless pork chops",
        "ounces of boneless skinless chicken breast", "ounce of turkey breast", "ounce of corned beef",
        "ounce of canned chicken", "ounce of roast beef", "ounce of canadian bacon", "ounce of chorizo",
        "ounce of pepperoni", "ounce of roasted turkey breast", "ounce of beef jerky", "cup of navy beans",
        "cup of dried lentils", "tbsp of peanut butter", "ounce of mixed nuts", "ounce of bean chips", "ounce of tofu",
        "cup of edamame", "cup of green peas", "ounce of wheat germ", "ounce of soba noodles", "cup of quinoa"};
        String[]GramNames = {"large eggs", "ounces of yogurt", "cups of cottage cheese", "ounces of swiss cheese",
        "cups of 2% milk", "scoops of whey protein", "scoops of casein protein", "ounces of yellowfin tuna",
        "ounces of halibut", "ounces of octopus", "ounces of sockeye salmon", "ounces of tilapia", "ounce of anchovies",
        "ounces of tuna", "ounces of sardines", "ounces of round steak", "ounces of 90% lean ground beef",
        "ounces of boneless pork chops", "ounces of boneless skinless chicken breast", "ounces of turkey breast",
        "ounces of corned beef", "ounces of canned chicken", "ounces of roast beef", "ounces of canadian bacon",
        "ounces of chorizo", "ounces of pepperoni", "ounces of roasted turkey breast", "ounces of beef jerky",
        "cups of navy beans", "cups of dried lentils", "tbsps of peanut butter", "ounces of mixed nuts",
        "ounces of bean chips", "ounces of tofu", "cups of edamame", "cups of green peas", "ounces of wheat germ",
        "ounces of soba noodles", "cups of quinoa"};




		//CREATING RANDOM OBJECT
		Random rand= new Random();

		//SETTING BOUNDS
		int int_random=rand.nextInt(upperbound);

		//OUTPUT AND READING INPUT
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter in your grams of protein");
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
