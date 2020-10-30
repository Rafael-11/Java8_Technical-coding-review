package collection_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList01 {
	public static void main(String[] args) {
          //Declare linked list
		 LinkedList li=new LinkedList();
		
		 li.add(100);
		 li.add("Welcome");
		 li.add(15.5);
		 li.add('A');
		 li.add(true);
		 li.add(null);
		 
		 System.out.println(li);
		 System.out.println(li.size());
		 li.remove(3);
		 System.out.println(li);
		 
		//insert adding the element in the middle of the list
		 li.add(3,"Java");
		 System.out.println(li);
		 //retrieving data
		 System.out.println(li.get(4));
		 //change a value in the list by index
		 li.set(5, "X");
		 System.out.println(li);
		 //contains()
		 System.out.println(li.contains("Java")); // true
		 System.out.println(li.contains("Selenium"));// false
		 
		 //isEmpty();
		 System.out.println(li.isEmpty());// false 
		 
		 //read the data 
		 //for loop
		/* for(int i=0;i<li.size();i++) {
			 System.out.print(li.get(i)+" ");
		 }
		 */
		 
		 //for each loop
		/* for(Object e: li) {
			 System.out.println(e);
		 }
		 */
		 
		 //Iterator
		 Iterator it=li.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 
		 
		 
		 
		 
		 
	}
}
