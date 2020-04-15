package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList a1 = new ArrayList();
		
		a1.add("Java");
		a1.add(123);
		a1.add('C');
		
		ArrayList a2 = new ArrayList();
		a2.add("Java");
		a2.add(4569);
		a2.add('q');
		
		
		
		a1.addAll(a2); //This method is used to add the entire array list to other array list
		
		a1.removeAll(a2); //This method is used to remove the entire array list from other array list
		
//		a1.retainAll(a2); //This method is used to retain the common in the list and remaining elemnet 
		System.out.println(a2);
		System.out.println("---------------------------");
		for(int i = 0; i<a1.size();i++) {
			System.out.println(a2.get(i));
		}
		
//		Iterator it = a1.iterator();
//		
//		while(it.hasNext()) {
//			it.next();
//			System.out.println(a1);
//			System.out.println("---------------------------");
//			System.out.println(a2);
//		}
		

	}

}
