package Practice_Assignment_Phase1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ArraysOfEmailID {

	public static void main(String[] args) {

		
		 try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter vaild email ");  
			 String str= scan.nextLine();   
			 System.out.print(Pattern.matches("[a-z0-9]+@[a-z]+\\.[a-z]{2,3}",str));
		}




	}

}
