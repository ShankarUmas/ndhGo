package dateDemo;
// enum Level{
//Low,
//Medium,
//High,
//rnamg
//}
public class Demo {
	enum Level{
		Low,
		Medium,
		High,rnamg
		}

	public static void main(String[] args) {
//		Level mylevel = Level.High;
//System.out.println(mylevel);
		for(Level muv:Level.values()) {
			System.out.println(muv);
		}
	}

}
