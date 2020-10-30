package supplierDemo;

import java.sql.Date;
import java.util.function.Supplier;

public class SuppierDemo1 {
	public static void main(String[] args) {

		// It will supply something and it will return the value, It will not take
		// anything from us
		Supplier<Date> s = () -> new Date(0);
		System.out.println(s.get());

//		int[][] arr = { { 1, 2 }, { 3, 4 } };
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//
//				System.out.print(arr[i][j] + " ");
//
//			}
//			System.out.println();
//
//		  
//		  
//		}
		
		
		

	}

}
