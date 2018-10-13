package week8Assignment;

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string to count the number of vowels:");
		vowelCount(scan.next());
		scan.close();
	}

	public static void vowelCount(String input) {
		int vowelCount = 0;
		for(int i = 0; i < input.length(); i++) {
			
			if((input.charAt(i) == 'a') || (input.charAt(i) == 'e') || (input.charAt(i) == 'i') || (input.charAt(i) == 'o') || (input.charAt(i) == 'u') || 
					(input.charAt(i) == 'A') || (input.charAt(i) == 'E') || (input.charAt(i) == 'I') || (input.charAt(i) == 'O') || (input.charAt(i) == 'U'))
				vowelCount++;
		}
		System.out.println("The number of vowels in the string \"" + input + "\" is : " + vowelCount);
	}
}
