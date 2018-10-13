package week8Assignment;

import java.util.Arrays;

public class RearrangeDigitsInANumberInAsc {

	public static void main(String[] args) {
		int number = 19673;
		
		String strNumber = number+"";
		int[] numberArray = new int[strNumber.length()];
		for(int i = 0; i < strNumber.length(); i++) {
			int remainder = number % 10;
			int quotient = number / 10;
			number = quotient;
			numberArray[i] = remainder;		
		}
		//Sort the array
		Arrays.sort(numberArray);
		for(int i : numberArray) 
			System.out.print(i);
		

	}

}
