package week8;

public class StringReverse {

	public static void main(String[] args) {
		String txt = "success";
		//Logic1:
		char[] charArray = txt.toCharArray();
		int len = txt.length();
		for(int i = 0; i < len/2; i++) {
			char temp = charArray[len-i-1];
			charArray[len-i-1] = charArray[i];
			charArray[i] = temp;
		}
		System.out.println("Logic1 Using toCharArray():");
		for(char ch : charArray)
			System.out.print(ch);
		System.out.println("\rLogic2 Using split() & concatenate():");
		//Logic2:
		String[] splitStrings = txt.split("");
		for(int i = 0; i < len/2; i++) {
			String temp = splitStrings[len-i-1];
			splitStrings[len-i-1] = splitStrings[i];
			splitStrings[i] = temp;
		}
		String reversedString = "";
		for (String string : splitStrings) {
			reversedString = reversedString.concat(string);
		}
		System.out.println("The reversed string is: " + reversedString);
		
		//Logic3:
		System.out.println("Logic3 reading the characters from the last index and printing:");
		for(int i = len-1; i >= 0; i--)
			System.out.print(txt.charAt(i));
			
			
		
	}

}
