package DemoMatch;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	String name;
	int score;
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return this.name;
	}
	
	public int getScore() {
		return this.score;
	}
	
	
}
public class Demo4 {

	public static void main(String[] args) {
		List<Student> studentlist=Arrays.asList(
			new Student("david",82),
			new Student("kohli",88),
			new Student("maxi",52),
			new Student("ruhi",62),
			new Student("duibvta",92)
				
				);
		 studentlist.stream().filter(n->n.getScore()>=80).limit(2).forEach(stu->System.out.println(stu.getName()+" "+stu.getScore()));
		//usinng parallel
		 studentlist.parallelStream().filter(st->st.getScore()>=60).forEach(std->System.out.println(std.getName()+" "+std.getScore()));
	}

}
