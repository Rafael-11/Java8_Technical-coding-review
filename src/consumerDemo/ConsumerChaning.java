package consumerDemo;

import java.util.function.Consumer;

/*
 * Consumer Chaining
 */
public class ConsumerChaning {
	public static void main(String[] args) {

		Consumer<String> cm1 = str -> System.out.println(str + " is white color");

		Consumer<String> cm2 = str -> System.out.println(str + " is an Animal");
		Consumer<String> cm3 = str -> System.out.println(str + " is eating grass");

		/*
		 * cm1.accept("Horse"); cm2.accept("Horse"); cm3.accept("Horse");
		 */

		// Chaining or
		// cm1.andThen(cm2).andThen(cm3).accept("Horse");

		// Combining all consumer in other way

		Consumer<String> cm4 = cm1.andThen(cm2).andThen(cm3);
		cm4.accept("Horse");
		
		
		

	}
}
