package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

//How to store user defined class object in the Array list class???
public class ArrayListConcept {   // array list concept is for Student

	String name;
	int age;
	String colg_name;
	
	public ArrayListConcept(String name, int age, String colg_name) {
		this.name = name;
		this.age = age;
		this.colg_name = colg_name;
	}
	public static void main(String[] args) {
		ArrayListConcept a1 = new ArrayListConcept("Ram",20, "SDPT");
		ArrayListConcept a2 = new ArrayListConcept("Sham",18, "SJPT");
		ArrayListConcept a3 = new ArrayListConcept("Gopal",17, "KPT");
		
		ArrayList <ArrayListConcept> arr = new ArrayList <ArrayListConcept>(); //generic type of arraylist
		arr.add(a1);
		arr.add(a2);
		arr.add(a3);
		
		Iterator <ArrayListConcept> it = arr.iterator(); //here iterator also need to make of type like arrayList
		
		while(it.hasNext()) {
			ArrayListConcept arc	 = it.next(); //If we have not specified the generic type for iterator we are asked to do cast for this method.
			System.out.println(arc.name);
			System.out.println(arc.age);

			System.out.println(arc.colg_name);
	
		}	

	}

}
