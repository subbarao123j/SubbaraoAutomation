package class10;

import java.util.HashMap;

public class MapDemo2 {

	public static void main(String[] args) {

		
		//HashSet, LinkedHashSet, TreeSet
		//HashMap, LinkedHashMap, TreeMap
		
		HashMap<String, String> mapDemo = new HashMap<String, String>();
		
		mapDemo.put("Mukesh", "55245522");
		mapDemo.put("adf", "55245522");
		
		mapDemo.put("fdfdd", "55245522");
		
		mapDemo.put("Mukddesh", "55245522");
		
		System.out.println(mapDemo.get("Mukesh"));
		
		System.out.println(mapDemo.keySet()); 
		mapDemo.entrySet();
		
		mapDemo.remove("adf");
		
		System.out.println(mapDemo);
		
	}

}
