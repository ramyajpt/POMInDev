package week9;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortHashMap {

	public static void main(String[] args) {
		/*int input1 = 21;
		int input2 = 31;
		int input3 = 41;*/
		
		Map<Integer, String> data = new HashMap<Integer, String>();
		
		data.put(21, "Twenty One");
		data.put(41, "Forty One");
		data.put(31, "Thirty One");
		System.out.println("Before sorting...");
		//System.out.println(data);
		for(Entry<Integer, String> each : data.entrySet()) {
			System.out.println(each.getKey() + ", " + each.getValue());
		}
		TreeMap<Integer, String> sortedMap = new TreeMap<>(data);
		System.out.println("\rAfter sorting...");
		for(Entry<Integer, String> each : sortedMap.entrySet()) {
			System.out.println(each.getKey() + ", " + each.getValue());
		}
		//Logic2: Create a tree map and put all the entries in the hash map into the tree map object
		//Logic3: Create an array list object and use collections.sort(arrayListObject)
	}
}