package StringTest;

import java.util.Random;
import java.util.Scanner;

public class LoopsDoLoop {

	public static void main(String[] args) {
		// declaring the variable abc
		int abc;
		// creating Scanner object by writing the below line
		Scanner sc = new Scanner(System.in);
		System.out.println("Please tell/enter how many lines eclips will create in console.");
        // Retrieving one data from the console and storing in a single/scholar  variable.	
		abc= sc.nextInt();
		// releasing the memory
		sc.close();
		//checking if the data has been stored in "abc" variable
		System.out.println(abc);
		
		
		//creating random object by writing below line.	
		Random rm = new Random();
		// declaring array variable with maximum element defined.
		int [] array = new int [abc];
		// going through for loops to generate random data, store in the array and display in the console
		for(int l=0; l<array.length; l++){
		   array[l] = rm.nextInt(10000);
		   System.out.println(l+" no Random number is "+array[l]);
		}
	
		
		
		
	}

}
