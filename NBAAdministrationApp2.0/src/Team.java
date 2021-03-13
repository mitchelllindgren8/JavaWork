import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;


public class Team {
	
	protected ArrayList<Object> leagueList;
	protected String[] Celtics = new String[5];
	protected String[] Lakers = new String[5];
	protected String[] Nets = new String[5];
	protected String[] Bulls = new String[5];
	protected String[] Warriors = new String[5];
	protected String[] FreeAgents = new String[6];
	
	/*
	public Player[] PLAYERS = new Player[31];	//currently there are 31 players on the file, find a way to not HARDCODE
	private Player[] Celtics = new Player[5];
	private Player[] Lakers = new Player[5];
	private Player[] Nets = new Player[5];
	private Player[] Bulls = new Player[5];
	private Player[] Warriors = new Player[5];
	private Player[] FreeAgents = new Player[6];
	*/
	
	protected String[][] LEAGUE = new String[][] {Bulls, Celtics, Lakers, Nets, Warriors, FreeAgents};
	
	//these are the full professional team names
	public String celticsT= "Boston Celtics";
	public String netsT = "Brooklyn Nets";
	public String bullsT = "Chicago Bulls";
	public String warriorsT = "Golden State Warriors";
	public String lakersT = "Los Angeles Lakers";
	public String freeAgentsT = "Free Agents";
	private static String nbaTeam;
	private int iterator = 0;
	//indicates that the particular member belongs to a type itself, rather than to an instance of that type.
	//(only one instance of that static member is created which is shared across all instances of the class)
	
	//objects
	public Person person;
	public League2 league = new League2();
	
	public Team(String teamm) throws FileNotFoundException {
		
		boolean found = league.checkLeague(teamm);
		nbaTeam = teamm;	//this acts as a setTeam() method

		while(found == true || iterator == 1) 	//note to self, when comparing boolean use 2 "=="
			printMenu();
		
	}
	
	public void printMenu() throws FileNotFoundException {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("\nWelcome " + nbaTeam + " Owner!\n");
		
		while(iterator == 0) {
			
			System.out.print("[Please select a team option to perform]\n1. View Team\n2. View League\n3. Sign Player\n4. Release Player\n5. Exit \n>>>");
			int ownerInput = scan.nextInt();
			
			if(ownerInput == 1) {	//1. View Team
				league.viewTeam();
				
			} else if(ownerInput == 2) {	//2. View League
				//resets the league rosters
				//League2 tm2 = new League2();   **Delete**
				league.print();
				
			} else if(ownerInput == 3) {	//3. Sign Player
				//need a method to reset the playerlist/teams after a player has been added and removed
				league.signPlayer();
				
			} else if(ownerInput == 4) {	//4. Release Player
				//need a method to reset the playerlist/teams after a player has been added and removed
				league.releasePlayer();
			
			} else if(ownerInput == 5) {	//5. Exit 
				
				System.out.println("\nThank you for using the NBA Administration App. The app will now exit.");
				iterator++;	//this needed to be shared with the while loop and original while on line 51*
				
			} else {
				System.out.print("Error: Please enter only 1, 2, or 3: ");
				ownerInput = scan.nextInt();
			}
		}//ends while
	}
	
	
	
	
	
	
	
	//populate teams
	public void populateTeams() {
		
		//creates a List of the 6 teams 
		leagueList = new ArrayList<>();	
		leagueList.add(bullsT);
		leagueList.add(celticsT);
		leagueList.add(lakersT);
		leagueList.add(netsT);
		leagueList.add(warriorsT);
		leagueList.add(freeAgentsT);	
	}
	

}//ends main team class
