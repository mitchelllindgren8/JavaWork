
public class Person {
	
	private String firstNamee;
	private String lastNamee;
	//public Player player;

	public Person(String firstName, String lastName) {
		this.firstNamee = firstName;
		this.lastNamee = lastName;
		
		//player = new Player(firstName, firstName);
		
		//print();
		
		
	}
	
	public void print() {
		System.out.println("\t" + firstNamee + " " + lastNamee);
	}
}
