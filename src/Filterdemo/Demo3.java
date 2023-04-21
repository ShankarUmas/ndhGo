package Filterdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	int id;
	String name;
	double price;
	 Student(int id, String name, double price) {
		
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}
public class Demo3 {
public static void main(String[] args) {
	/*List<Student> studetails=Arrays.asList(
			new Student(1,"styuhh",677878),
			new Student(1,"styuhh",4367),
		    new Student(1,"styuhh",23000),
		    new Student(1,"styuhh",50000));*/
	List<Student> studetails=new ArrayList<Student>();
	studetails.add(new Student(1,"rkn",23000));
	studetails.add(new Student(2,"king",67000));
	studetails.add(new Student(3,"shjdd",23000));
	studetails.add(new Student(4,"wdhfjhf",26000));
	studetails.add(new Student(5,"qdncdd",45000));
		  studetails.stream().filter(p->p.price>24000).forEach(s->System.out.println(s.price));
	//System.out.println(hdflkfkl);
}
}
