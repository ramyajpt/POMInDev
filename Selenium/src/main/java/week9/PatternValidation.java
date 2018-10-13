package week9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternValidation {

	public static void main(String[] args) {
		// input = xaxXbxcx
		//output = aXbcxxxx
		String input = "xaxXbxcx";
		String pattern = "[^x]";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(input);
		while(m.find())
		System.out.print(m.group());
		pattern = "[x]";
		p = Pattern.compile(pattern);
		m = p.matcher(input);
		while(m.find())
		System.out.print(m.group());
	}

}
