package week8Assignment;

import java.util.Scanner;

public class FactorsOfANumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number = scan.nextInt();
		scan.close();
		primeFactors(number);
		
		FactorsOfANumber nonStaticFactors = new FactorsOfANumber();
		nonStaticFactors.factors(number);
		
	}
	public void factors(int num) {
		System.out.println("The factors of the number " + num +" are : ");
		for(int i = 2; i < num; i++) 
		{
			if(num%i == 0)  
			{
				System.out.println(i);
			}
		}
	}
	public static void primeFactors(int num) {
		System.out.println("The prime factors of the number " + num + " are : ");
		for(int i = 2; i < num; i++) 
		{
			if((num%i == 0) && isPrimeNumber(i)) 
			{
				System.out.println(i);
			}
		}
	}
	
	public static boolean isPrimeNumber(int number) {
		for(int i = 2; i < number; i++) {
			if(number%i == 0)
				return false;
		}
		return true;
	}

}
