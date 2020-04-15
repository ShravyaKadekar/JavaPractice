package LinkedlistConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedStudentPrac  {

	public static void main(String[] args) {		
		//Create 3 student class object
		
		Student st1 = new Student("Ram" , 15, "STPT");
		Student st2 = new Student("sham" , 16, "KPT");
		Student st3 = new Student("SriRam" , 17, "SPT");
		
		//Create Linkedlist:
		
		LinkedList<Student> ll1 = new LinkedList <Student>();
		
		ll1.add(st1);
		ll1.add(st2);
		ll1.add(st3);
		
		//To print all the elements
		
		Iterator <Student> it = ll1.iterator();
		
		while(it.hasNext()) {
			Student st = it.next();
			System.out.println("Printing all student data :");
			System.out.println("Printing all student data :"+st.name +" "+st.age +" "+st.colg_name);
			
		}
		

	}

}
