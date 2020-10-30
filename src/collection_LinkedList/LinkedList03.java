package collection_LinkedList;

import java.util.LinkedList;

public class LinkedList03 {
	public static void main(String[] args) {

		//spacila methods in linked list
		
		LinkedList ls=new LinkedList();
		
		ls.add("dog");
		ls.add("cat");
		ls.add("horse");
		ls.add("dog");
		
		System.out.println(ls);
		
		//add first node
		ls.addFirst("tiger");
        //add last node
		ls.addLast("Rabbit");
		System.out.println(ls);
		
		////get the first data 
		System.out.println(ls.getFirst());
		
		//get the last date
		System.out.println(ls.getLast());
		
		//remove the first data
		ls.removeFirst();
		System.out.println(ls);
		//remove the last data
		ls.removeLast();
		System.out.println(ls);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
