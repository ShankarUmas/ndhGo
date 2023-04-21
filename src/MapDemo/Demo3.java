package MapDemo;

import java.util.Arrays;
import java.util.List;

class Employee{
	int empid;
	String empname;
	int salary;
	 Employee(int empid, String empname, int salary) {

		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}
	
}
public class Demo3 {

	public static void main(String[] args) {
		List<Employee> emplist=Arrays.asList(
				new Employee(1,"rkn",45000),
				new Employee(2,"kumar",34000),
				new Employee(4,"rknraj",41000),
				new Employee(5,"kingrkn",25000)
				);
		emplist.stream().map(sal->sal.salary>25000).forEach(e->System.out.println(e));
	}

}
