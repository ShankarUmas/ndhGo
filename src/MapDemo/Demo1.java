package MapDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		List<String> vehicles=Arrays.asList("bus","truck","jeep","marithi","thar");
		List<String> vehicleslist=new ArrayList<String>();
		//vehicles.stream().map(name->name.toUpperCase()).forEach(System.out::println);
		vehicles.stream().map(name->name.length()).forEach(System.out::println);
	}

}
