package functionDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
	String empName;
	int salary;

	Employee(String empName, int salary) {
		this.empName = empName;
		this.salary = salary;
	}

}

public class FunctionDemo2 {
	public static void main(String[] args) {

		// Create multiple employees object
		List<Employee> empLs = new ArrayList<>();
		empLs.add(new Employee("David", 50000));
		empLs.add(new Employee("Allen", 30000));
		empLs.add(new Employee("Fred", 20000));

		Function<Employee, Integer> fn = e -> {
			int sal = e.salary;
			if (sal >= 10000 && sal <= 20000)
				return sal * 10 / 100;
			else if (sal > 20000 && sal <= 30000)
				return (sal * 30 / 100);
			else
				return (sal * 40 / 100);

		};
		Predicate<Integer> p=b->(b>5000);

		for (Employee employee : empLs) {
			int bonus = fn.apply(employee);  //Function
			//Predicate
			if(p.test(bonus)) { 
			System.out.println(employee.empName + " " + employee.salary);
			System.out.println("Bonus is: " + bonus);
		} 
		}	

	}
}
