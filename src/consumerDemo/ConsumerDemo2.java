package consumerDemo;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
	String empName;
	int salary;
	String gender;

	Employee(String empName, int salary, String gender) {

		this.empName = empName;
		this.salary = salary;
		this.gender = gender;
	}

}

public class ConsumerDemo2 {
	public static void main(String[] args) {

		ArrayList<Employee> empLs = new ArrayList<>();
		empLs.add(new Employee("David", 50000, "Male"));
		empLs.add(new Employee("John", 30000, "Male"));
		empLs.add(new Employee("Emily", 20000, "Female"));
		empLs.add(new Employee("Scott", 60000, "Male"));

		// Function for calculating the bonus
		Function<Employee, Integer> fn = emp -> (emp.salary * 10) / 100;
		// Predicate for checking the bonus value greater than 5000 and return boolean
		Predicate<Integer> pr = b -> (b >= 5000);
		// Consumer for consume the data pass as arguments from Employee
		Consumer<Employee> cm = emp -> {
			System.out.println(emp.empName);
			System.out.println(emp.salary);
			System.out.println(emp.gender);
		};

		for (Employee employee : empLs) {
			int bonus = fn.apply(employee);
			if (pr.test(bonus)) {
				cm.accept(employee);
				System.out.println("Employee bonus is "+bonus);
				System.out.println("------------------------------");
			}
		}
	}

}
