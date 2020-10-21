package functionDemo;

import java.util.function.Function;

/**
 * 
 * Function chaining andThen() compose()
 *
 */

public class FunctionChaining {
	public static void main(String[] args) {

		Function<Integer, Integer> fn1 = n -> (n * 2);

		Function<Integer, Integer> fn2 = n -> (n * n * n);

		System.out.println(fn1.andThen(fn2).apply(2)); // andThen()

		System.out.println(fn1.compose(fn2).apply(2)); // compose() It is reversed order of andThen()

	}

}
