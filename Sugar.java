import java.util.Random;
import java.util.Scanner;
import  java.lang.Math;
public class Sugar extends SugarGrams {
	
	public static void main(String[] args)
	{
		int upperbound=9;
		double calculated=0;
		double[]GramList={11,22,10,33,15,49,0.6,14,17};
		String[]GramName= {"Chips Ahoy Cookies","StarBurst","Apple","Mars Bar","Brownies","Kit Kat","Strawberries","Bananas","Hershey Bars"};
		
		//CREATING RANDOM OBJECT
		Random rand= new Random();
		
		//SETTING BOUNDS
		int int_random=rand.nextInt(upperbound);
		
		//OUTPUT AND READING INPUT
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter in your grams of sugar");
		double val = myObj.nextDouble(); 
		
		//MATH AND ROUNDING
		calculated= 100*(val/(GramList[int_random]));
		calculated=Math.round(calculated);
		
		//print statement
		System.out.println("That is equivalent to approximately "+calculated/100+" "+GramName[int_random]);
	
		
		
		
		
	}

}
