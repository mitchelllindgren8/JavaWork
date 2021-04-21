package NBAapp;

public class Player extends Person {
	
	private String name;
	private String jerseyNum;
	private String height;
	private String weight;
	private String position;
	
	//private String team;
	
	
	public Player(String fullNamee, String teamm, String jerNo) {
		
		//the super calls the parent class's methods/constructors and then sets the variables to global variables in Person.
		super(fullNamee, teamm);
		this.jerseyNum = jerNo;
		
		
		//print();
	}
	
	
/*
	public void setPlayer(String fullName, String team, String number) {

		Player(fullName, team);
		System.out.println("SetPlayer: " + fullName);
		this.jerseyNum = number;
	}
	*/
	
	
	//set players pos
	//set players height
	//set players weight
	
	//When was this added???? 
	private void Player(String fullName, String team) {
		// TODO Auto-generated method stub
		
	}
	
	public void print() {
		
		System.out.print("Player details: \n\t"+" #" +jerseyNum + " ");
		super.print();	//calls parent class print
	}

}
