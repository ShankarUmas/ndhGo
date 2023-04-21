package Demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo3 {

	public static void main(String[] args) {
		List<String> stlist=Arrays.asList("A","B","c","1","2","3");
		Optional<String> resultvalue=stlist.stream().reduce((value,combinedvalue)->{return value+combinedvalue;});
        System.out.println(resultvalue.get());
        //toarray
        Object[] values = stlist.stream().toArray();
        System.out.println(values.length);
        for(Object v:values) {
        	
        	System.out.println(v);
        }
	}

}
