package week8;

public class StringRepeat {

	public static void main(String[] args) {
		String txt1 = "Successb";
		String txt2 = "failurec";
		StringBuffer buffer = new StringBuffer(txt1); 
		
		for(int i =0; i<buffer.length();i++) {
			boolean isPresent = false;
			char ch = buffer.charAt(i);
			for(int j =0; j<txt2.length();j++)
			{
				if(ch == txt2.charAt(j))
				{
					isPresent = true;
					break;
				}			
			}
			if(isPresent) {
				buffer.deleteCharAt(i);
				i--;
			}
		}
		System.out.println(buffer);
	}

}
