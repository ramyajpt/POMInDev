package week8;

public class NoOfOccurenceOfE {

	public static void main(String[] args) {
		String txt = "success";
		int count = 0;
		for(int i =0; i < txt.length(); i++)
		{
			if(txt.charAt(i) == 'e')
				count++;
		}
		System.out.println("The no of occurences of the char 'e' is : " + count);
	}

}
