package Filterdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
public static void main(String[] args) {
	List<String> Stringvalue=Arrays.asList("jskdjkf","kingsdon",null,"shdhjds","sjdehkaf",null);
	List<String> lengthofString=new ArrayList<String>();
//	lengthofString=Stringvalue.stream().filter(val->val.length()>4&& val.length()<8).collect(Collectors.toList());
//	System.out.println(lengthofString);
	//Stringvalue.stream().filter(n->n!=null).forEach(nul->System.out.println(nul));
	Stringvalue.stream().filter(n->n!=null).forEach(System.out::println);
}
}
