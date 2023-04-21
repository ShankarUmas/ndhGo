enum Level{
		Low,
		Medium,
		High,rnamg
		}
public class enums {
	public static void main(String[] args) {
	Level mylevel = Level.High;
System.out.println(mylevel);
System.out.println("without loop using");
		for(Level muv:Level.values()) {
			System.out.println(muv);
		}
	}

}
