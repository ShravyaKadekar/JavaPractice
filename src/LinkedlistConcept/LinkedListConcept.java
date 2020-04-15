package LinkedlistConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList <String> ll = new LinkedList <String>(); //generic type of linked list
		LinkedList <String> ll2 = new LinkedList <String>(); 
		LinkedList <Integer> ll1 = new LinkedList <Integer> ();
		
		ll.add("Ram");
		ll.add("Sham");
		ll.add("12234");
		
		ll1.add(10);
		ll1.add(20);
		ll1.add(330);
		
		ll2.add("Sita");
		ll2.add("Radha");
		
		//To PRINT
	System.out.println("The linked list elements are: " +ll);
	
	//To add element to first index
	ll.addFirst("Selenium");
	//To add element to last index
	ll.addLast("Java");
	
	System.out.println("The linked list elements are: " +ll);
	
	//TO get element index wise
	System.out.println("The linked list 0th index elements are: " +ll.get(0));

	//To set element
	ll.set(4, "Python");
	System.out.println("The updated linked list elements are: " +ll);
	
	//To remove element
	ll.remove(); //Since no index is specified it removes the first index element
	System.out.println("The linked list elements are: " +ll);

	//To remove last element
	ll.removeFirst(); // it removes the first index element
	System.out.println("The linked list elements are: " +ll);
	
	//To remove last element
		ll.removeLast();
		System.out.println("The linked list elements are: " +ll);
		
	//To   print all element using for loop
		System.out.println("-------------------------------------");
		for (int i = 0; i<ll.size();i++) {
			System.out.println("The element are: "+ ll.get(i));
		}
		System.out.println("-------------------------------------");
	//Using advanced for loop
		System.out.println("The linked list elements are printing using aadv. for loop: " +ll);
		for(String str: ll) {
			System.out.println("The linked list elements are: " +str);
			
		}
	//using Iterator
		System.out.println("-------------------------------------");
		Iterator <String> it = ll.iterator();
		while(it.hasNext()) {
			it.next();
			System.out.println("The elemnet are: " +ll);
		}
		
		//using while loop
		System.out.println("-------------------------------------");
		int num = 0;
		while(ll.size() > num) {
			System.out.println("The elemnet are: " +ll.get(num));
			num++;
		}
		
//		using advanced for loop for linked list 2
		System.out.println("-------------------------------------");

		for(Integer i: ll1) {
			System.out.println("The linked list elements are: " +ll1);
			
		}
		//Add the entire collection of same generic to the end of the other collection
		System.out.println("-------------------------------------");
		ll.addAll(ll2); 
		System.out.println("The linked list elements are: " +ll);
	}
	
	

}
