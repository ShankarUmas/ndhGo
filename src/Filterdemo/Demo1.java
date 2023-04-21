package Filterdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		List<Integer> numberlist=Arrays.asList(10,20,15,25,30,35,40,45,50,55,60,65);
		
		List<Integer> numberlistvalue=new ArrayList<Integer>();
		/*for(Integer value:numberlist) {
			if(value%2==0) {
				System.out.println(value);
				
			}*/
		//numberlistvalue=	numberlist.stream().filter(n->n%2==0).collect(Collectors.toList());
		//System.out.println(numberlistvalue);
		//numberlist.stream().filter(n->n%2==0).forEach(nu->System.out.println(nu));
		numberlist.stream().filter(n->n%2==0).forEach(System.out::println);
		
		}
	}


