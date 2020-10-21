package consumerDemo;

import java.util.function.Consumer;

public class ConsumerDemo1 {
   public static void main(String[] args) {
	/*
	 * consumer--> accept()
	 */
	   
	 Consumer<String> con=c->System.out.println(c);
	 con.accept("Hello World");
	 
}
}
