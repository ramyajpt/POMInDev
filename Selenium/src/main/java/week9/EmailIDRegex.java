package week9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailIDRegex {

	public static void main(String[] args) {
		String input = "abc67defgh12@gmail.com";
		//String pattern = "\\w{10,}[@][a-zA-Z]+[.][c&&o&&m]";
		String pattern = "\\w{10,}[@][a-zA-Z]+[.][com]{3}";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(input);
		while(m.find())
			System.out.println(m.group());
		System.out.println(m.matches());

	}

}
