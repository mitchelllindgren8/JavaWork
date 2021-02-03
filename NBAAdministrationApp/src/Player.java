
public class Player extends Person {
	
	private int jerseyNum;
	private String position;
	private String team;	//team or FA
	
	//private String team;
	
	public Player(String firstName, String lastName) {
		
		//the super calls the parent class's methods/constructors and then sets the variables to global variables in Person.
		super(firstName, lastName);
		
		System.out.println("WE MADE IT INTO PLAYER-constructor");
		print();
		
		//super(firstName, lastName);
	}
	
	//set players number
	
	//set players pos
	
	//set players jerseyNum
	
	//set players team
	
	public void print() {
		System.out.println("WE MADE IT INTO PLAYER-print");
		System.out.println("Player details: ");
		super.print();
	}

}
