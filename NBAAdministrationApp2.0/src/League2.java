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
	
	public static List<Player> BullsList = new ArrayList<Player>();
	public List<String> proteamNames = new ArrayList();	//list of team names in League
	
	public Player[] PLAYERS = new Player[31];	//currently there are 31 players on the file, find a way to not HARDCODE
	protected Player[] Celtics = new Player[5];
	protected Player[] Lakers = new Player[5];
	protected Player[] Nets = new Player[5];
	protected Player[] Bulls = new Player[5];
	protected Player[] Warriors = new Player[5];
	protected Player[] FreeAgents = new Player[6];
	
	
	public String[] proteamNames2 = new String[6];
	//these are the full professional team names
	private String celticsT= "Boston Celtics";
	private String netsT = "Brooklyn Nets";
	private String bullsT = "Chicago Bulls";
	private String warriorsT = "Golden State Warriors";
	private String lakersT = "Los Angeles Lakers";
	private String freeAgentsT = "Free Agents";
	//**test code **
	
	public String nbaTeam = "";

	
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
				//System.out.println("Player: " + Bulls[itrB].getPlayer() + ", "+ Bulls[itrB].getTeam());
				itrB++;
				
			} else if(team.contains("Celtics")) {
				Celtics[itrC] = new Player(playerName, team, jerNo);
				//System.out.println("Player: " + Celtics[itrC].getPlayer() + ", "+ Celtics[itrC].getTeam());
				itrC++;
				
			} else if(team.contains("FreeAgents")) {
				FreeAgents[itrFA] = new Player(playerName, team, jerNo);
				//System.out.println("Player: " + FreeAgents[itrFA].getPlayer() + ", "+ FreeAgents[itrFA].getTeam());
				itrFA++;
				
			} else if(team.contains("Lakers")) {
				Lakers[itrL] = new Player(playerName, team, jerNo);
				//System.out.println("Player: " + Lakers[itrL].getPlayer() + ", "+ Lakers[itrL].getTeam());
				itrL++;
				
			} else if(team.contains("Nets")) {
				Nets[itrN] = new Player(playerName, team, jerNo);
				//System.out.println("Player: " + Nets[itrN].getPlayer() + ", "+ Nets[itrN].getTeam());
				itrN++;
				
			} else {	//"Warriors"
				Warriors[itrW] = new Player(playerName, team, jerNo);
				//System.out.println("Player: " + Warriors[itrW].getPlayer() + ", "+ Warriors[itrW].getTeam());
				itrW++;
			}
			
			i++;	//this incremented the player list
			playerList2.add(playerName);	//adds player to a complete list of players in the league
		}//ends the while loop 
	}
	
	//checks if userteam input is a real team our NBA league
	public boolean checkLeague(String teamName) throws FileNotFoundException {
		
		boolean found = false;
		
		Scanner in = new Scanner(System.in);
		populateLeague(); 

		//Once the while loop ends, found must be true, add an IF statement if wanted

		while(!Arrays.asList(proteamNames2).contains(teamName)) {
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
		
		proteamNames2[0] = celticsT;
		proteamNames2[1] = netsT;
		proteamNames2[2] = bullsT;
		proteamNames2[3] = warriorsT;
		proteamNames2[4] = lakersT;
		proteamNames2[5] = freeAgentsT;
	
	}
	
	//view a team
		public void viewTeam() {
			
			Scanner scann = new Scanner(System.in);
			
			switch(nbaTeam) {
				case "Boston Celtics": 
					System.out.println("\n** The " + nbaTeam + " starting 5 **");
					for(int i= 0; i<Celtics.length; i++) 
						System.out.println("\t" + Celtics[i].getPlayer());
					System.out.println("***************************************\n");
					
					//print entire league
					//call view player
					break;
					
				case "Brooklyn Nets":
					System.out.println("\n** The " + nbaTeam + " starting 5 **");
					for(int i= 0; i<Nets.length; i++) 
						System.out.println("\t" + Nets[i].getPlayer());
					System.out.println("***************************************\n");
					
					//print entire league
					//call view player
					break;
					
				case "Chicago Bulls":
					System.out.println("\n** The " + nbaTeam + " starting 5 **");
					for(int i= 0; i<Bulls.length; i++) 
						System.out.println("\t" + Bulls[i].getPlayer());
					System.out.println("***************************************\n");
					
					//print entire league
					//call view player
					break;
					
				case "Golden State Warriors":
					System.out.println("\n** The " + nbaTeam + " starting 5 **");
					for(int i= 0; i<Warriors.length; i++) 
						System.out.println("\t" + Warriors[i].getPlayer());
					System.out.println("***************************************\n");
					
					//print entire league
					//call view player
					break;
					
				case "Los Angeles Lakers":
					System.out.println("\n** The " + nbaTeam + " starting 5 **");
					for(int i= 0; i<Lakers.length; i++) 
						System.out.println("\t" + Lakers[i].getPlayer());
					System.out.println("***************************************\n");
					
					//print entire league
					//call view player
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
	public void signPlayer() throws FileNotFoundException {
		
		System.out.println("\n*** No code yet***");

	}
	
	//release a player
	public void releasePlayer() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\nPlease enter the player you want released: ");
		String releasedPlayer = scan.nextLine();
		
		List<Player> list;
		
		switch(nbaTeam) {
		 
			case "Boston Celtics": 
				list = Arrays.asList(Celtics);
				String[] tempCeltics = new String[5];
				
				if(list.contains(releasedPlayer))
					System.out.println("We in here C");
				
				//checks if player exists in team, then removes
				for(int i=0; i<Celtics.length; i++) {
					
					
					if(Celtics[i].equals(releasedPlayer)){
					//if(Celtics[i].contains(releasedPlayer)){
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
	public Player[] removeTheElement(Player[] celtics2, String name) {
		
		System.out.println("REMOVE currently only works for Celtics, double check\n");
		
		//copy code
		if(celtics2 == null) {
			return celtics2;
		}
		
		Player[] tempArray = new Player[celtics2.length-1];
		
		for(int i=0, k=0; i < celtics2.length; i++) {
			
			if(celtics2[i].equals(name))
				continue;	//statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
			
			tempArray[k++] = celtics2[i];
		}

		Celtics = tempArray;
		for(int j=0;j<Celtics.length;j++) 
			System.out.println(Celtics[j] + " TEST --------->");
		System.out.println(Celtics);
		return tempArray;
	}
	
	//basic print of each player AFTER they have all been added to the list
	public void print() throws FileNotFoundException {
		
		Date currentDate = new Date();
		SimpleDateFormat year = new SimpleDateFormat("yyyy");

		String tmpTeam = "";
		tmpTeam = nbaTeam;	//sets the correct user's nbaTeam to a tempVal
		
		System.out.println("\n~~~ Welcome to the " + year.format(currentDate) + " NBA League! ~~~");
		
		for(int i=0; i<proteamNames2.length; i++) {
			nbaTeam = proteamNames2[i];
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
