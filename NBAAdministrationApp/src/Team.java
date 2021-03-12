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
	
	protected String[][] LEAGUE = new String[][] {Bulls, Celtics, Lakers, Nets, Warriors, FreeAgents};
	
	//these are the full professional team names
	public String celticsT= "Boston Celtics";
	public String netsT = "Brooklyn Nets";
	public String bullsT = "Chicago Bulls";
	public String warriorsT = "Golden State Warriors";
	public String lakersT = "Los Angeles Lakers";
	public String freeAgentsT = "Free Agents";
	private static String nbaTeam;
	//indicates that the particular member belongs to a type itself, rather than to an instance of that type.
	//(only one instance of that static member is created which is shared across all instances of the class)
	
	//objects
	public Person person;
	//private League teamLeague;
	public League2 team;
	
	//String constructor
	public Team(String teamInput) {
		nbaTeam = teamInput;
	}
	
	//boolean constructor
	public Team(boolean found) throws FileNotFoundException {
		
		boolean foundd = found;
		Scanner in = new Scanner(System.in);

		while(foundd == true) 	//note to self, when comparing boolean use 2 "=="
			printMenu();
		
	}
	
	//view a team
	public void viewTeam() {
		
		Scanner scann = new Scanner(System.in);
		
		switch(nbaTeam) {
			case "Boston Celtics": 
				System.out.println("\n** The " + nbaTeam + " starting 5 **");
				for(int i= 0; i<Celtics.length; i++) 
					System.out.println("\t" + Celtics[i]);
				System.out.println("***************************************\n");
				
				//print entire league
				//call view player
				break;
				
			case "Brooklyn Nets":
				System.out.println("\n** The " + nbaTeam + " starting 5 **");
				for(int i= 0; i<Nets.length; i++) 
					System.out.println("\t" + Nets[i]);
				System.out.println("***************************************\n");
				
				//print entire league
				//call view player
				break;
				
			case "Chicago Bulls":
				System.out.println("\n** The " + nbaTeam + " starting 5 **");
				for(int i= 0; i<Bulls.length; i++) 
					System.out.println("\t" + Bulls[i]);
				System.out.println("***************************************\n");
				
				//print entire league
				//call view player
				break;
				
			case "Golden State Warriors":
				System.out.println("\n** The " + nbaTeam + " starting 5 **");
				for(int i= 0; i<Warriors.length; i++) 
					System.out.println("\n\t" + Warriors[i]);
				System.out.println("***************************************\n");
				
				//print entire league
				//call view player
				break;
				
			case "Los Angeles Lakers":
				System.out.println("\n** The " + nbaTeam + " starting 5 **");
				for(int i= 0; i<Lakers.length; i++) 
					System.out.println("\t" + Lakers[i]);
				System.out.println("***************************************\n");
				
				//print entire league
				//call view player
				
				System.out.println("A Player to view.....");
				//Player LJ = new Player ("Lebron", "James");
				break;
			
			default:
				break;	
		}
	}
	
	
	//view a player

	
	//add a player
	public void signPlayer() throws FileNotFoundException {
		
		System.out.println("\n*** No code yet***");

	}
	
	//release a player
	public void releasePlayer() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\nPlease enter the player you want released: ");
		String releasedPlayer = scan.nextLine();
		
		List<String> list;
		
		switch(nbaTeam) {
		 
			case "Boston Celtics": 
				list = Arrays.asList(Celtics);
				String[] tempCeltics = new String[5];
				
				if(list.contains(releasedPlayer))
					System.out.println("We in here C");
				
				//checks if player exists in team, then removes
				for(int i=0; i<Celtics.length; i++) {
					if(Celtics[i].contentEquals(releasedPlayer)){
						System.out.println("We in remove player");
						Celtics = removeTheElement(Celtics, releasedPlayer);
						
					}
					else {
						System.out.println("No player match");
					}
				}
					
				System.out.println(Arrays.toString(Celtics) + " INSIDE RELEASE: CELTICS GAINED TEMPT");
				
				//remove player from list
				//add to FA list, make FA list bigger to hold more players
				break;
				
			case "Brooklyn Nets":
				list = Arrays.asList(Nets);
				if(list.contains(releasedPlayer))
					System.out.println("We in here N");
				break;
				
			case "Chicago Bulls":
				list = Arrays.asList(Bulls);
				if(list.contains(releasedPlayer))
					System.out.println("We in here B");
				break;
				
			case "Los Angeles Lakers":
				list = Arrays.asList(Lakers);
				if(list.contains(releasedPlayer))
					System.out.println("We in here L");
				break;
				
			case "Golden State Warriors":
				list = Arrays.asList(Warriors);
				if(list.contains(releasedPlayer))
					System.out.println("We in here W");
				break;
				
			case "Free Agents":
				list = Arrays.asList(FreeAgents);
				if(list.contains(releasedPlayer))
					System.out.println("We in here FA");
				break;
				
			default:
				System.out.println("[Error] Please enter a correct name.");
				releasePlayer();
				break;
			
			//case //
		}
		
	}
	
	
	//this code so far works with an int index,
	// it needs to be a String that gets passed into the method
	public String[] removeTheElement(String[] arr, String name) {
		
		System.out.println("REMOVE currently only works for Celtics, double check\n");
		
		//copy code
		if(arr == null) {
			return arr;
		}
		
		String[] tempArray = new String[arr.length-1];
		
		for(int i=0, k=0; i < arr.length; i++) {
			
			if(arr[i].contains(name))
				continue;	//statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
			
			tempArray[k++] = arr[i];
		}

		Celtics = tempArray;
		for(int j=0;j<Celtics.length;j++) 
			System.out.println(Celtics[j] + " TEST --------->");
		System.out.println(Celtics);
		return tempArray;
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
	
	public void printMenu() throws FileNotFoundException {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("\nWelcome " + nbaTeam + " Owner!\n");
		
		int i = 1;
		while(i == 1) {
			
			System.out.print("[Please select a team option to perform]\n1. View Team\n2. View League\n3. Sign Player\n4. Release Player\n5. Exit \n>>>");
			int ownerInput = scan.nextInt();
			
			if(ownerInput == 1) {	//1. View Team
				viewTeam();
				
			} else if(ownerInput == 2) {	//2. View League
				//resets the league rosters
				
				League2 tm2 = new League2();
				tm2.print();
				
			} else if(ownerInput == 3) {	//3. Sign Player
				//need a method to reset the playerlist/teams after a player has been added and removed
				signPlayer();
				
			} else if(ownerInput == 4) {	//4. Release Player
				//need a method to reset the playerlist/teams after a player has been added and removed
				releasePlayer();
			
			} else if(ownerInput == 5) {	//5. Exit 
				
				System.out.println("\nThank you for using the NBA Administration App. The app will now exit.");
				i++;
				
			} else {
				System.out.print("Error: Please enter only 1, 2, or 3: ");
				ownerInput = scan.nextInt();
			}
		}//ends while
	}

}//ends main team class
