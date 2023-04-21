package DemoMatch;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
List<Integer> listint=Arrays.asList(2,1,6,3,5,8,7,9,4);
List<Integer>orderlist=listint.stream().sorted().collect(Collectors.toList());
System.out.println(orderlist);
listint.stream().sorted(Comparator.reverseOrder()).forEach(n->System.out.println(n));
	}

}
