package DemoMatch;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo3 {

	public static void main(String[] args) {
		List<String> animal=Arrays.asList("camel","cow","cat","tiger");
		List<String> bird=Arrays.asList("parrot","peacock","crow","gits");
		Stream<String> st1 = animal.stream();
		Stream<String> st2 = bird.stream();
		List<String> finals = Stream.concat(st1, st2).collect(Collectors.toList());
		System.out.println(finals);
	}

}
