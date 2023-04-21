package Demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo1 {

	public static void main(String[] args) {
		List<Integer> numList=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		long evenprint=numList.stream().filter(n->n%2==0).count();
		System.out.println(evenprint);
		//count
		long evenpr=numList.stream().filter(n->n%2==0).limit(3).count();
System.out.println(evenpr);
//min
      Optional<Integer> min = numList.stream().min((val1,val2)->{
    	   return val1.compareTo(val2);
       });
       System.out.println(min.get());
     Optional<Integer> max= numList.stream().max((val1,val2)->{ return val1.compareTo(val2);});
       System.out.println(max.get());
       }
	}


