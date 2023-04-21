package flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Student{
	int sid;
	String sname;
	char grade;
	public Student(int sid, String sname, char grade) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.grade = grade;
	}
	
}
public class Demo3 {

	public static void main(String[] args) {
		/*
List<Student> studentlist1=Arrays.asList(
		new Student(101,"David",'A'),
		new Student(102,"Tilak",'B'),
		new Student(103,"kishan",'C'),
		new Student(104,"Surya",'D')
		);
List<Student> studentlist2=Arrays.asList(
		new Student(105,"kohli",'A'),
		new Student(106,"maxwell",'B'),
		new Student(107,"duplesis",'C'),
		new Student(108,"dinesh",'D')
		);*/
		List<Student> studentlist1=new ArrayList<Student> ();
	 studentlist1.add(new Student(101,"David",'A'));
	 studentlist1.add(new Student(102,"Tilak",'B'));
	 studentlist1.add(new Student(103,"kishan",'C'));
	 List<Student> studentlist2=new ArrayList<Student> ();
	 studentlist2.add(new Student(104,"kinaml",'A'));
	 studentlist2.add(new Student(105,"Timdebid",'B'));
	 studentlist2.add(new Student(106,"kurnal",'C'));
List<List<Student>> stulist=Arrays.asList(studentlist1,studentlist2);
//before java8
for(List<Student> s:stulist) {
	for(Student st:s) {
		System.out.println(st.sname+" "+st.sid);
	}
}
//flatmap
List<String>sturesult=stulist.stream().flatMap(s->s.stream()).map(st->st.sname).collect(Collectors.toList());
System.out.println(sturesult);
	}

}
