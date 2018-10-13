package week9;

public class LowercaseToUppercase {

	public static void main(String[] args) {
		String input = "taanvikaa";
		String output = "";
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			
			output = output + (char)(ch-32);
		}
		System.out.println(output);
	}
}

