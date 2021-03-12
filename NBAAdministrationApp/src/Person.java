
public class Person {
	
	//these were static before
	public static String fullNameP;
	public static String teamName;
	//private String lastNamee;
	//public Player player;

	public Person(String fullName, String team) {
		fullNameP = fullName;
		teamName = team;
		
	}
	
	public void print() {
		System.out.print(fullNameP + " " + teamName + "\n");
	}
}
