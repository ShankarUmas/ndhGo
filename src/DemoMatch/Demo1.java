package DemoMatch;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
		Set<String> stlist=new HashSet<String>();
		stlist.add("one apple");
		stlist.add("one mango");
		stlist.add("two apple");
		stlist.add("more apple");
		stlist.add("two mango");
		//anymatch
		boolean amymatch = stlist.stream().anyMatch(p->{
			return p.startsWith("one");
		});
		System.out.println(amymatch);
		//allmatch
		boolean allmatch = stlist.stream().allMatch(p->{
			return p.startsWith("one");
		});
		System.out.println(allmatch);
		//non match
		boolean amyrmatch = stlist.stream().noneMatch(p->{
			return p.startsWith("three");
		});
		System.out.println(amyrmatch);
//find first
		Optional<String> firstmatch = stlist.stream().findFirst();
		System.out.println(firstmatch.get());
	}

}
