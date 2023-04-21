package flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
		 List<String> team1=Arrays.asList("david","tilak","kishan");
		 List<String> team2=Arrays.asList("green","archar","piyush");
		 List<String> team3=Arrays.asList("warner","mawell","faf");
     List< List<String>> stlist1=new ArrayList<List<String>>();
      stlist1.add(team1);
      stlist1.add(team2);
      stlist1.add(team3);
      //before java 8
      for(List<String> s:stlist1) {
    	  for(String name:s) {
    		  System.out.println(name);
    	  }
      }
     List<String> result = stlist1.stream().flatMap(t->t.stream()).collect(Collectors.toList());
      System.out.println(result);
	}

}
