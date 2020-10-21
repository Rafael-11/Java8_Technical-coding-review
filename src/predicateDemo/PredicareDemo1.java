package predicateDemo;

import java.util.function.Predicate;

public class PredicareDemo1 {
	public static void main(String[] args) {
        //Example  1
		Predicate<Integer> p= i->(i>10);
		System.out.println(p.test(20));
		//Example 2 check the length of String is greater than 4
		
		Predicate<String> pr=s ->(s.length() >4);
		System.out.println(pr.test("Str"));
		
		//Example 3 print array elements which size is > 4 from array
		String[] names= {"Johnn","Bob","lily","Mary","Smith"};
		
		for(String name: names) {
			if(pr.test(name)) {
				System.out.println(name);
			}
			
			
		}
	      
	}
}
