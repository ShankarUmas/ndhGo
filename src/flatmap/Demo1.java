package flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		//map
		List<Integer> listmaps=Arrays.asList(1,2,3,4,5,6);
		listmaps.stream().map(n->n+10).forEach(p->System.out.println(p));
		//flatmap
		List<Integer> list1=Arrays.asList(1,2);
		List<Integer> list2=Arrays.asList(3,4);
		List<Integer> list3=Arrays.asList(5,6);
		
		List<List<Integer>> totallist=Arrays.asList(list1,list2,list3);
		List<Integer> resultlist = totallist.stream().flatMap(n->n.stream()).map(a->a+10).collect(Collectors.toList());
		System.out.println(resultlist);

	}

}
