package week2Assignment;

import java.util.HashSet;

public class StringSplitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str = "SampleCompanyName (10480)";
		String split[] = str.split("\\(");
		for(String s : split)
		{
			System.out.println(s);
			//if (s.equals("SampleCompanyName"))
				System.out.println(s.trim().equals("SampleCompanyName"));
		}*/
		
		//Test String funcationality
		String s1 = "abc";
		//String s2 = "abc";
		String s2 = s1;
		System.out.println(s1.equals(s2));
		System.out.println(s1== s2);
		
		//Pr2:
		String s3 = "JournalDev";
		int start = 1;
		char end = 5;
		System.out.println(start + end);
		System.out.println(s3.substring(start, end));
		
		//P3:

HashSet shortSet = new HashSet();
for (short i = 0; i < 100; i++) {
	shortSet.add(i);
	shortSet.remove((short)(i-1));
}
System.out.println(shortSet.size());

	}

}
