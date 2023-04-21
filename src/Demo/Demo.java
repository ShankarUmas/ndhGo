package Demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
    List<String>vehivlelist=Arrays.asList("Bus","truck","jeep","thar","honda");
    List<String> vcount=vehivlelist.stream().distinct().collect(Collectors.toList());
    System.out.println(vcount);
    vehivlelist.stream().distinct().forEach(System.out::println);
    //using count
    long vcounting=vehivlelist.stream().distinct().count();
    System.out.println(vcounting);
    //limit
    List<String> vcountlimit=vehivlelist.stream().distinct().limit(3).collect(Collectors.toList());
    System.out.println(vcountlimit);
	}

}
