package week8Assignment;

import java.util.Scanner;

public class NumberOfDaysInAMonthWithYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of the month :");
		int monthNumber = scan.nextInt();

		System.out.println("Enter the year :");
		int year = scan.nextInt();
		String month = "";
		int numberOfDays = 0;
		switch(monthNumber) 
		{
		case 1: month = "January"; 
		numberOfDays = 31;
		break;
		case 2: month = "February"; if(checkLeapYear(year))
		{
			numberOfDays = 29;
		}
		else
		{
			numberOfDays = 28; 
		}break;
		case 3: month = "March"; numberOfDays = 31;break;
		case 4: month = "April";numberOfDays = 30; break;
		case 5: month = "May"; numberOfDays = 31;break;
		case 6: month = "June";numberOfDays = 30; break;
		case 7: month = "July"; numberOfDays = 31;break;
		case 8: month = "August";numberOfDays = 31; break;
		case 9: month = "September";numberOfDays = 30; break;
		case 10: month = "October"; numberOfDays = 31;break;
		case 11: month = "November"; numberOfDays = 30;break;
		case 12: month = "December"; numberOfDays = 31;
		}
		scan.close();
		System.out.println(month + " " + year + " has " + numberOfDays + " days.");
	}
	public static boolean checkLeapYear(int year) {
		boolean isLeapYear = false;
		if (((year%4 == 0) && (year%100 != 0)) || (year%400 == 0))
			isLeapYear = true;
		return isLeapYear;
	}


}
