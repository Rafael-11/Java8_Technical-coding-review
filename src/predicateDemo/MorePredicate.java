package predicateDemo;

import java.util.function.Predicate;

//Joining multiple Predicate - and ,or,negate

// p1 -- check number is even
// p2 --- check the number greater than 50 or not

public class MorePredicate {
	public static void main(String[] args) {

		int[] num = { 93, 67, 5, 7, 8, 4, 66, 86, 22, 44, 63, 89 };
		// check number is even or not

		Predicate<Integer> p1 = n -> (n % 2 == 0);
		Predicate<Integer> p2 = n -> (n > 50);

		// and
		System.out.println("Following are numbers EVEN && and Greater than 50");
		for (int j : num) {
			// if(p1.test(j) && p2.test(j)) {
			if (p1.and(p2).test(j)) { // joining of predicate
				System.out.println(j);
			}
		}
		//

		System.out.println("Following are numbers EVEN or || Greater than 50");
		for (int j : num) {

			if (p1.or(p2).test(j)) { // joining of predicate
				System.out.println(j);
			}
		}
		// negate (opposite) 
		System.out.println("Following are negate numbers");
		for (int j : num) {

			if (p1.negate().test(j)) { // joining of predicate
				System.out.println(j);
			}
		}

	}
}
