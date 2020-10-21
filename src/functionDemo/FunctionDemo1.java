package functionDemo;

import java.util.function.Function;

public class FunctionDemo1 {
	public static void main(String[] args) {
		
		Function<Integer, Integer> f=n -> (n*n);
		System.out.println(f.apply(2));
		System.out.println(f.apply(4));
		System.out.println(f.apply(7));
		
		
		System.out.println("***********************************");
		Function<String, Integer> str= sLength->sLength.length();
		System.out.println(str.apply("Hello"));
		
		
		
		
	}

}
