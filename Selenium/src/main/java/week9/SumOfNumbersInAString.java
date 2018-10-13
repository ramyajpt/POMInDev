package week9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfNumbersInAString {

	public static void main(String[] args) {
		String input = "No of employees in Infosys India is 124857 and no of employees in North America is 47269.";
		String pattern = "[\\d]+";
		
		int sum = 0;
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(input);
		while(m.find())
			sum =sum + Integer.parseInt(m.group());
		System.out.println("The total no of employees in Infosys is : " + sum);

	}

}
