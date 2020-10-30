package collection_LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList02 {
	public static void main(String[] args) {

		LinkedList ls = new LinkedList();
		ls.add("X");
		ls.add("Y");
		ls.add("F");
		ls.add("R");
		ls.add("U");
		ls.add("E");
		ls.add("I");

		// add above date to the new linked list as below
		LinkedList new_List = new LinkedList();
		new_List.addAll(ls);
		System.out.println(new_List);
		// removin all date by using removeAll()
		new_List.removeAll(ls);
		System.out.println(new_List);

		// Sort() --> Collections.sort(collection)
		System.out.println("Before sorting: " + ls);

		Collections.sort(ls);// sort the alphabitic order
		System.out.println("After sorting: " + ls);

		// reverse order

		Collections.sort(ls, Collections.reverseOrder());
		System.out.println("Reverse oder: " + ls);
		
		//shuffling
		Collections.shuffle(ls);
		System.out.println("After shuffling: "+ls);
		
		
		

	}
}
