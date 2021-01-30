
public class Player extends Person {
	
	private int jerseyNum;
	private String position;
	private String team;	//team or FA
	
	//private String team;
	
	public Player(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	public void print() {
		System.out.println("Player details: ");
		super.print();
	}

}
