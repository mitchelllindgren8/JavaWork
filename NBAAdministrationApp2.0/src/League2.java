import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.text.SimpleDateFormat;
import java.util.Date;

public class League2 {
	
	public List<String> playerList2 = new ArrayList();	//list of list of player
	
	//public static List<Player> BullsList = new ArrayList<Player>();
	
	public Player[] PLAYERS = new Player[31];	//currently there are 31 players on the file, find a way to not HARDCODE
	protected Player[] Celtics = new Player[5];
	protected Player[] Lakers = new Player[5];
	protected Player[] Nets = new Player[5];
	protected Player[] Bulls = new Player[5];
	protected Player[] Warriors = new Player[5];
	protected Player[] FreeAgents = new Player[5];
	
	public String[] proteamNames = new String[6];
	//these are the full professional team names
	private String celticsT= "Boston Celtics";
	private String netsT = "Brooklyn Nets";
	private String bullsT = "Chicago Bulls";
	private String warriorsT = "Golden State Warriors";
	private String lakersT = "Los Angeles Lakers";
	private String freeAgentsT = "Free Agents";
	public String nbaTeam = "";

	private String errorMessageRel = "[Error] The player entered does not belong to your team.\nPlease enter a player to release that belongs to your team.\n";
	private String errorMessageSign = "[Error] The player entered belongs to another team.\nPlease enter a player to sign that is a Free Agent.\n";
	
	public League2() throws FileNotFoundException {
			
		createLeague();
	}
	
	
	//reads DB file of players and sets their attributes
	private void createLeague() throws FileNotFoundException {
		
		//int iterators for team arrays [size]
		int i = 0, itrB=0, itrC=0, itrFA=0, itrL=0, itrN=0, itrW=0;
		File f = new File("players.txt");
		Scanner scanF = new Scanner(f);
		
		
		while(scanF.hasNext()) {
			String temp = scanF.nextLine();
			Scanner scanR = new Scanner(temp);
			scanR.useDelimiter("#");
			
			String playerName, jerNo, team;
			playerName = scanR.next();
			jerNo = scanR.next();
			team = scanR.next();
			
			//add players to team arrays accordingly  
			if(team.contains("Bulls")){
				Bulls[itrB] = new Player(playerName, team, jerNo);
				itrB++;
				
			} else if(team.contains("Celtics")) {
				Celtics[itrC] = new Player(playerName, team, jerNo);
				itrC++;
				
			} else if(team.contains("FreeAgents")) {
				FreeAgents[itrFA] = new Player(playerName, team, jerNo);
				itrFA++;
				
			} else if(team.contains("Lakers")) {
				Lakers[itrL] = new Player(playerName, team, jerNo);
				itrL++;
				
			} else if(team.contains("Nets")) {
				Nets[itrN] = new Player(playerName, team, jerNo);
				itrN++;
				
			} else {	//"Warriors"
				Warriors[itrW] = new Player(playerName, team, jerNo);
				itrW++;
			}
			
			i++;	//this incremented the player list
			playerList2.add(playerName);
		}//ends the while loop 
	}
	
	//checks if userteam input is a real team our NBA league
	public boolean checkLeague(String teamName) throws FileNotFoundException {
		
		boolean found = false;
		
		Scanner in = new Scanner(System.in);
		populateLeague(); 

		//Once the while loop ends, found must be true, add an IF statement if wanted
		while(!Arrays.asList(proteamNames).contains(teamName)) {
			System.out.print("[Error] Please enter the correct team name: ");
			teamName = in.nextLine();
		}
		
		nbaTeam = teamName;	//this acts as a "setTeam()"
		found = true;
		
		return found;
	}
	
	
	public String getTeam() {
		return nbaTeam;
	}

	
	//adds the professional team names to the League List, "Los Angelos Lakers, etc"
	// ***** find a way to reset the list that way all the teams arent continuously added to list
	public void populateLeague() {
		
		proteamNames[0] = celticsT;
		proteamNames[1] = netsT;
		proteamNames[2] = bullsT;
		proteamNames[3] = warriorsT;
		proteamNames[4] = lakersT;
		proteamNames[5] = freeAgentsT;
	}
	
	//view a team
		public void viewTeam() {
			
			//Delete later??
			Scanner scann = new Scanner(System.in);
			
			switch(nbaTeam) {
				case "Boston Celtics": 
					System.out.println("\n** The " + nbaTeam + " starting " + Celtics.length +  "**");
					for(int i= 0; i<Celtics.length; i++) 
						System.out.println("\t" + Celtics[i].getPlayer());
					System.out.println("***************************************\n");
					break;
					
				case "Brooklyn Nets":
					System.out.println("\n** The " + nbaTeam + " starting " + Nets.length +  "**");
					for(int i= 0; i<Nets.length; i++) 
						System.out.println("\t" + Nets[i].getPlayer());
					System.out.println("***************************************\n");
					break;
					
				case "Chicago Bulls":
					System.out.println("\n** The " + nbaTeam + " starting " + Bulls.length +  "**");
					for(int i= 0; i<Bulls.length; i++) 
						System.out.println("\t" + Bulls[i].getPlayer());
					System.out.println("***************************************\n");
					break;
					
				case "Golden State Warriors":
					System.out.println("\n** The " + nbaTeam + " starting " + Warriors.length +  "**");
					for(int i= 0; i<Warriors.length; i++) 
						System.out.println("\t" + Warriors[i].getPlayer());
					System.out.println("***************************************\n");
					break;
					
				case "Los Angeles Lakers":
					System.out.println("\n** The " + nbaTeam + " starting " + Lakers.length +  "**");
					for(int i= 0; i<Lakers.length; i++) 
						System.out.println("\t" + Lakers[i].getPlayer());
					System.out.println("***************************************\n");
					break;
					
				//You can never view the FreeAgents team, simply used for printing(KEEP)
				case "Free Agents":
					System.out.println("\n-- The " + nbaTeam + " available --");
					for(int i= 0; i<FreeAgents.length; i++)
						System.out.println("\t" + FreeAgents[i].getPlayer());
					System.out.println("__________________________________\n");
					break;
				
				default:
					break;	
			}
		}
		
	//view a player
	public void viewPlayer() {
		System.out.println("A Player to view code(will be added later).....\n");
	}

		
	//add a player
	public void signPlayer() {
		
		Scanner scan = new Scanner(System.in);
		String signedPlayer = "";
		
		while((!playerList2.contains(signedPlayer))) {
			
			System.out.print("\nPlease enter the player you want signed: ");
			signedPlayer = scan.nextLine();
			
			//checks if player exists in the league
			if(!playerList2.contains(signedPlayer)) 
				System.out.println("[Error] Player does not exist in the League!");
			else
				break;
		}
		
		List<Player> list;
		boolean found = false;
		
		switch(nbaTeam) {
		 
			case "Boston Celtics": 
				
				if(!(Celtics.length < 5)){
					System.out.println("[Error] The " + nbaTeam + " already has a full roster of 5 players.\n");
					break;
				}
				
				list = Arrays.asList(FreeAgents);

				//This checks if player exists in the FreeAgency list
				for(Player temp1 : list) {
					if(temp1.getPlayer().equals(signedPlayer)) 
						found = true;		
				}
				
				if(found == true) 
					Celtics = addTheElement2(Celtics, signedPlayer);
				else 
					System.out.println(errorMessageSign);
				
				break;
			
				//I dont think this will ever run because of prior checks 
			default:
				System.out.println("[Error] No NBA team was chosen.");
				break;
		}
	}
	
	public Player[] addTheElement2(Player[] team, String name) {
		
		Player[] tempFreeAgents = new Player[FreeAgents.length-1];
		
		if(team == null) 
			return team;
		
		for(int i=0, k=0; i < FreeAgents.length; i++) {
			
			if(FreeAgents[i].getPlayer().equals(name))  {
				
				//any signed player is immediately removed from the Free Agency list
				Player[] tempTeam = new Player[team.length+1];
				
					for(int m=0; i < tempTeam.length; m++) {
						
						//sets last tempTeam roster spot to be the released player
						if( m == tempTeam.length-1){
							tempTeam[tempTeam.length-1] = FreeAgents[i];	
							break;
						}
						tempTeam[m] = team[m];
					}
				
				team = tempTeam;
				continue;	//statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
			}//ends if
			
			tempFreeAgents[k++] = FreeAgents[i];
		}
			
		FreeAgents = tempFreeAgents;
		return team;
	}
	
	//release a player
	public void releasePlayer() {
		
		Scanner scan = new Scanner(System.in);
		String releasedPlayer = "";
		
		while((!playerList2.contains(releasedPlayer))) {
			
			System.out.print("\nPlease enter the player you want released: ");
			releasedPlayer = scan.nextLine();
			
			//checks if player exists in the league
			if(!playerList2.contains(releasedPlayer)) 
				System.out.println("[Error] Player does not exist in the League!");
			else
				break;
		}
		
		List<Player> list;
		boolean found = false;
		
		switch(nbaTeam) {
		 
			case "Boston Celtics": 
				
				list = Arrays.asList(Celtics);

				//This check needs to iterator through the entire team and check if the player exists,
				for(Player temp1 : list) {
					if(temp1.getPlayer().equals(releasedPlayer)) 
						found = true;		
				}
				
				if(found == true) {
					Celtics = removeTheElement(Celtics, releasedPlayer);
				} else {
					System.out.println(errorMessageRel);
				}
				break;
				
			case "Brooklyn Nets":
				
				list = Arrays.asList(Nets);
				for(Player temp1 : list) {
					if(temp1.getPlayer().equals(releasedPlayer)) 
						found = true;		
				}
				
				if(found == true) {
					Nets = removeTheElement(Nets, releasedPlayer);
				} else {
					System.out.println(errorMessageRel);
				}
				break;
				
			case "Chicago Bulls":
				
				list = Arrays.asList(Bulls);
				for(Player temp1 : list) {
					if(temp1.getPlayer().equals(releasedPlayer)) 
						found = true;		
				}
				
				if(found == true) {
					Bulls = removeTheElement(Bulls, releasedPlayer);
				} else {
					System.out.println(errorMessageRel);
				}
				break;
				
			case "Los Angeles Lakers":
				
				list = Arrays.asList(Lakers);
				for(Player temp1 : list) {
					if(temp1.getPlayer().equals(releasedPlayer)) 
						found = true;		
				}
				
				if(found == true) {
					Lakers = removeTheElement(Lakers, releasedPlayer);
				} else {
					System.out.println(errorMessageRel);
				}
				break;
				
			case "Golden State Warriors":
				
				list = Arrays.asList(Warriors);
				for(Player temp1 : list) {
					if(temp1.getPlayer().equals(releasedPlayer)) 
						found = true;		
				}
				
				if(found == true) {
					Warriors = removeTheElement(Warriors, releasedPlayer);
				} else {
					System.out.println(errorMessageRel);
				}
				break;
				
			//This should never run unless nbaTeam is overwritten
			default:
				System.out.println("[Error] No NBA team was chosen.");
				break;
		}//ends switch
	}
	
	public Player[] removeTheElement(Player[] team, String name) {
		
		Player[] tempTeam = new Player[team.length-1];
		
		if(team == null) 
			return team;
		
		for(int i=0, k=0; i < team.length; i++) {
			
			if(team[i].getPlayer().equals(name))  {
				
				//any released player is immediately added to the Free Agency list
				Player[] tempFreeAgents = new Player[FreeAgents.length+1];
				
					for(int m=0; i < tempFreeAgents.length; m++) {
						
						//sets last FAroster spot to be the released player
						if( m == tempFreeAgents.length-1){
							tempFreeAgents[tempFreeAgents.length-1] = team[i];	
							break;
						}
						tempFreeAgents[m] = FreeAgents[m];
					}
				
				FreeAgents = tempFreeAgents;
				continue;	//statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
			}//ends if
			
			tempTeam[k++] = team[i];
		}
			
		team = tempTeam;
		return team;
	}
	
	//basic print of each player AFTER they have all been added to the list
	public void print() throws FileNotFoundException {
		
		Date currentDate = new Date();
		SimpleDateFormat year = new SimpleDateFormat("yyyy");

		String tmpTeam = "";
		tmpTeam = nbaTeam;	//sets the correct user's nbaTeam to a tempVal
		
		System.out.println("\n~~~ Welcome to the " + year.format(currentDate) + " NBA League! ~~~");
		
		for(int i=0; i<proteamNames.length; i++) {
			nbaTeam = proteamNames[i];
			viewTeam();
		}	
		
		nbaTeam = tmpTeam;
		viewPlayer();
	}
	
	//based on past code this should print each player
	public void printLeague() {
			
		//String[][] League2 = new String[][] {Bulls2, Celtics2, Lakers2, Nets2, Warriors2, FreeAgents2};
		String[][] League2 = new String[][] {};	//this needs to be changed to Person[][] League2.....
		
		
		//then call the player print method,
			
		System.out.println("\n*** This is test code for printing the LeagueArray ***");
		//List<Array> list = new List<Array>();
		
		String[] tempT;
		
		for(int n=0; n <League2.length; n++) {
			
			tempT = new String[League2[n].length];
			tempT = League2[n];
			//Celtics =
			System.out.println(Arrays.toString(tempT));	//keep it tempT in order to prove LEAGUE holds each teamArray
			//convert this to a list so it prints better,
		}
		
		
		System.out.println("\n*** This is test code for printing the LeagueArray ***\n");
	}
	

}
