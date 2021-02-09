import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;


public class Team {
	
	protected ArrayList<Object> leagueList;
	protected String[] Celtics = new String[5];
	protected String[] Lakers = new String[5];
	protected String[] Nets = new String[5];
	protected String[] Bulls = new String[5];
	protected String[] Warriors = new String[5];
	protected String[] FreeAgents = new String[5];
	
	//these are the full professional team names
	public String celticsT= "Boston Celtics";
	public String netsT = "Brooklyn Nets";
	public String bullsT = "Chicago Bulls";
	public String warriorsT = "Golden State Warriors";
	public String lakersT = "Los Angeles Lakers";
	public String freeAgentsT = "Free Agents";
	public String nbaTeam = "team";
	
	//objects
	public Person person;
	private League teamLeague;
	
	public void Team(String teamInput) {
		
		boolean foundd = false;
		Scanner in = new Scanner(System.in);
		this.nbaTeam = teamInput;
		
		teamLeague = new League(nbaTeam);
		populateTeams();
		foundd = teamLeague.checkLeague();
		
		if(foundd == true) {	//note to self, when comparing boolean use 2 "=="
			printMenu();
		}
		else {
			System.out.print("[Error] Please enter the correct team name: ");
			nbaTeam = in.nextLine();
			Team(nbaTeam);
		}
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
				Player LJ = new Player ("Lebron", "James");
				
				
				/*
				System.out.println("Enter player firstname?");
				String playerFirst = scann.nextLine();
				
				System.out.println("Enter player lastname?");
				String playerLast = scann.nextLine();
				person = new Person(playerFirst, playerLast);
				
				*/
				break;
			
			default:
				break;	
		}
	}
	
	
	//view a player

	
	//add a player
	
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
				
				
				for(int i=0; i<Celtics.length; i++) {
					if(Celtics[i].contentEquals(releasedPlayer)){
						System.out.println("We in remove player");
						Celtics = removeTheElement(Celtics, releasedPlayer);
						
					}
					else {
						System.out.println("No player match");
					}
				}
					
				System.out.println(Arrays.toString(Celtics));
				
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

		return tempArray;
	}
	
	//populate teams
	public void populateTeams() {
		
		leagueList = new ArrayList<>();	
		
		Bulls[0] = "Michael Jordan";
		Bulls[1] = "Scottie Pippen";
		Bulls[2] = "Dennis Rodman";
		Bulls[3] = "Steve Kerr";
		Bulls[4] = "Derrick Rose";
		
		Celtics[0] = "Larry Bird";
		Celtics[1] = "Bill Russell";
		Celtics[2] = "Paul Pierce";
		Celtics[3] = "Kevin Garnett";
		Celtics[4] = "Rajon Rondo";

		FreeAgents[0] = "Mitchell Lindgren";
		FreeAgents[1] = "General Patton";
		FreeAgents[2] = "Stone-Cold-Steve Austin";
		FreeAgents[3] = "Rickyyy Robby";
		FreeAgents[4] = "The Truth";

		Lakers[0] = "Lebron James";		
		Lakers[1] = "Kobe Bryant";		
		Lakers[2] = "Kareem Abdul-Jabbar";		
		Lakers[3] = "Magic Johnson";		
		Lakers[4] = "Shaquille O'Neal";

		Nets[0] = "Kevin Durant";
		Nets[1] = "James Harden";
		Nets[2] = "Kyrie Irving";
		Nets[3] = "Julius Erving";
		Nets[4] = "Jason Kidd";

		Warriors[0] = "Stephen Curry";
		Warriors[1] = "Klay Thompson";
		Warriors[2] = "Andre Iguodala";
		Warriors[3] = "Draymond Green";
		Warriors[4] = "Wilt Chamberlain";
		
		leagueList.add(bullsT);
		leagueList.add(celticsT);
		leagueList.add(lakersT);
		leagueList.add(netsT);
		leagueList.add(warriorsT);
		leagueList.add(freeAgentsT);
		
		teamLeague.populateLeague();		
		
		populateLeague();	//locally
		
		//connect the names here with Person
	}
	
	public void populateLeague() {
		
		teamLeague.populatePlayerList(Bulls);
		teamLeague.populatePlayerList(Celtics);
		teamLeague.populatePlayerList(Lakers);
		teamLeague.populatePlayerList(Nets);
		teamLeague.populatePlayerList(Warriors);
		teamLeague.populatePlayerList(FreeAgents);
	}
	
	
	public void printMenu() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("\nWelcome " + nbaTeam + " Owner!\n");
		
		int i = 1;
		while(i == 1) {
			
			System.out.print("[Please select a team option to perform]\n1. View Team\n2. View League\n3. Sign Player\n4. Release Player\n5. Exit \n>>>");
			int ownerInput = scan.nextInt();
			
			if(ownerInput == 1) {
				populateLeague();
				viewTeam();
				
			} else if(ownerInput == 2) {
				populateLeague();	//resets the league rosters
				teamLeague.printLeague();
				
			} else if(ownerInput == 3) {
				//call sign player
				
			} else if(ownerInput == 4) {
				//call release player
				populateLeague();
				releasePlayer();
			
			} else if(ownerInput == 5) {
				
				System.out.println("\nThank you for using the NBA Administration App. The app will now exit.");
				break;
				
			} else {
				System.out.print("Error: Please enter only 1, 2, or 3: ");
				ownerInput = scan.nextInt();
			}
		}//ends while
	}

}//ends main team class
