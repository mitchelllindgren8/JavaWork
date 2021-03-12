
public class Player extends Person {
	
	private String jerseyNum;
	private String height;
	private String weight;
	private String position;
	
	//private String team;
	
	public Player(String fullName, String team, String number) {
		
		//the super calls the parent class's methods/constructors and then sets the variables to global variables in Person.
		super(fullName, team);
		this.jerseyNum = number;
		

		
		//print();
	}
	
	
	//set players pos
	//set players height
	//set players weight
	
	
	public void print() {
		
		System.out.print("Player details: \n\t"+" #" +jerseyNum + " ");
		super.print();	//calls parent class print
	}

}
