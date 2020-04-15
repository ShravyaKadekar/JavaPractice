package HashMapCocept;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <String,String> hm = new HashMap <String,String> ();
		
		//To store any values
		hm.put("name", "Ram");
		hm.put("age", "25");
		hm.put("place", "Mangalore");
		System.out.println("The hash masp values are: "+hm);
		System.out.println("-----------------------------");
		//To get the values
		String name = hm.get("name");
		System.out.println("The hash masp value with key is: "+name);
		System.out.println("-----------------------------");

		//To check whether value with given is present or not
		if(hm.containsKey("age")) {
			System.out.println("The hash masp value is present");
		}
		//To remove a value using a key 
		System.out.println("-----------------------------");

		hm.remove("place");
		System.out.println("After the removal: "+hm);

		System.out.println("If extra key is given then null is printed: "+hm.get("Gender"));

		//To print all the values using for loop
		System.out.println("-----------------------------");
		for(Entry<String, String> m : hm.entrySet()) {
			
			System.out.println("The values are: "+m.getKey() + " "+m.getValue());

		}
		
		

	}

}
