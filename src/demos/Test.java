package demos;

@FunctionalInterface
interface Cab {
	public void bookCab();

}


//class Ola implements Cab{
//
////	@Override
////	public void bookCab() {
////		System.out.println("Ola cab is open");
////		
////		
////	}
////	//Lambda Expression
////	
////	() -> System.out.println("Ola cab is open");
//	
//}




public class Test {

	public static void main(String[] args) {
		Cab cab=() ->System.out.println("Ola cab is booked...");;
		cab.bookCab();

	}

}
