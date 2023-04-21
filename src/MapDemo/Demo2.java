package MapDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		List<Integer> vehicles=Arrays.asList(2,3,4,5);
		List<Integer> vehicleslist=new ArrayList<Integer>();
		vehicles.stream().map(v->v*3).forEach(val->System.out.println(val));

	}

}
