import java.util.Scanner;

public class Team {
	
	private String nbaTeam = "";
	private String[] Celtics = new String[5];
	private String[] Lakers = new String[5];
	private String[] Nets = new String[5];
	private String[] Bulls = new String[5];
	private String[] Warriors = new String[5];

	public void Team(String teamInput) {
		
		Scanner in = new Scanner(System.in);
		this.nbaTeam = teamInput;
		
		switch(nbaTeam) {
			case "Boston Celtics": 
				populateTeams();
				printMenu();
				break;
				
			case "Brooklyn Nets":
				populateTeams();
				printMenu();
				break;
				
			case "Chicago Bulls":
				populateTeams();
				printMenu();
				break;
				
			case "Golden State Warriors":
				populateTeams();
				printMenu();
				break;
				
			case "Los Angeles Lakers":
				populateTeams();
				printMenu();
				break;
				
			default: System.out.print("[Error] Please enter the correct team name: ");
				nbaTeam = in.nextLine();
				Team(nbaTeam);
				break;	
		}
	}
	
	//view a team
	public void viewTeam() {
		
		switch(nbaTeam) {
			case "Boston Celtics": 
				for(int i= 0; i<5; i++) 
					System.out.println("\t" + Celtics[i]);
				break;
				
			case "Brooklyn Nets":
				for(int i= 0; i<5; i++) 
					System.out.println("\t" + Nets[i]);
				break;
				
			case "Chicago Bulls":
				for(int i= 0; i<5; i++) 
					System.out.println("\t" + Bulls[i]);
				break;
				
			case "Golden State Warriors":
				for(int i= 0; i<5; i++) 
					System.out.println("\n\t" + Warriors[i]);
				break;
				
			case "Los Angeles Lakers":
				
				System.out.println("\n** The " + nbaTeam + " starting 5 **");
				for(int i= 0; i<5; i++) 
					System.out.println("\t" + Lakers[i]);
				System.out.println("***************************************\n");
				break;
			
			default:
				break;	
		}
	}
	
	//add a player
	
	//release a player
	
	//populate teams
	public void populateTeams() {
		
		Lakers[0] = "Lebron James";		
		Lakers[1] = "Kobe Bryant";		
		Lakers[2] = "Kareem Abdul-Jabbar";		
		Lakers[3] = "Magic Johnson";		
		Lakers[4] = "Shaquille O'Neal";
		
		Warriors[0] = "Stephen Curry";
		Warriors[1] = "Klay Thompson";
		Warriors[2] = "Andre Iguodala";
		Warriors[3] = "Draymond Green";
		Warriors[4] = "Wilt Chamberlain";
		
		//add 4 other teams
		//connect the names here with Person
	}
	
	public void printMenu() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("\nWelcome " + nbaTeam + " Owner!\n");
		
		int i = 1;
		while(i == 1) {
			
			System.out.print("[Please select a team option to perform]\n1. View Team\n2. Sign Player\n3. Release Player\n4. Exit \n>>>");
			int ownerInput = scan.nextInt();
			
			if(ownerInput == 1) {
				viewTeam();
				
			} else if(ownerInput == 2) {
				//call sign player
				
			} else if(ownerInput == 3) {
				//call release player
			
			} else if(ownerInput == 4) {
				
				System.out.println("\nThank you for using the NBA Administration App. The app will now exit.");
				break;
				
			} else {
				System.out.print("Error: Please enter only 1, 2, or 3: ");
				ownerInput = scan.nextInt();
			}
		}
	}

}//ends main team class
