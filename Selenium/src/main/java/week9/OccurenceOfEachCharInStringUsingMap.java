package week9;

//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
//import java.util.TreeMap;

public class OccurenceOfEachCharInStringUsingMap {

	public static void main(String[] args) {
		String name = "PRABHAVATHI";

		Map<Character, Integer> data = new LinkedHashMap<Character, Integer>();

		//convert string to char array
		char[] charArray = name.toCharArray();
		int maxCount = 0;
		char charThatOccursMaxTimes='0';
		for (char ch : charArray) {
			if(data.containsKey(ch)) {				
				data.put(ch, data.get(ch)+1);
			}
			else
				data.put(ch, 1);				
		}
		//Print the character and count
		for (Entry<Character, Integer> each : data.entrySet()) {
			//Calculate the character that occurs max no of times
			if(each.getValue() >= maxCount) {
				maxCount = each.getValue();
				charThatOccursMaxTimes = each.getKey();				
			}
			System.out.println(each.getKey()+" = "+ each.getValue());
		}
		System.out.println("The character '"+ charThatOccursMaxTimes +"' occurs "+ maxCount+" no of times");
	}

}
