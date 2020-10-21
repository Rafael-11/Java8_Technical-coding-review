package demos;


@FunctionalInterface
interface Cab1 {
	public void bookCab(String source, String destination);

}

public class Test1 {
	public static void main(String[] args) {

		Cab1 cab = (String source, String destination) -> System.out
				.println("Ola cab is booked from " + source + " To " + destination);
		cab.bookCab("New York", "VA");
	}

}
