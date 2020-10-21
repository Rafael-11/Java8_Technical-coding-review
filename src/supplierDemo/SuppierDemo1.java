package supplierDemo;

import java.sql.Date;
import java.util.function.Supplier;

public class SuppierDemo1 {
	public static void main(String[] args) {
		
		
		//It will supply something and it will return the value, It will not take anything from us 
		Supplier<Date> s=()-> new Date(0); 
		System.out.println(s.get());
	}

}
