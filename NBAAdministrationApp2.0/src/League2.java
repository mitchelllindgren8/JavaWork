import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

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
	
	
	//**test code **
	public String[] proteamNames2 = new String[6];
	//these are the full professional team names
	private String celticsT= "Boston Celtics";
	private String netsT = "Brooklyn Nets";
	private String bullsT = "Chicago Bulls";
	private String warriorsT = "Golden State Warriors";
	private String lakersT = "Los Angeles Lakers";
	private String freeAgentsT = "Free Agents";
	//**test code **
	
	public String teamN = "";

	
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
		teamN = teamName;	//this acts as a "setTeam()"
		found = true;
		
		return found;
	}
	
	
	public String getTeam() {
		return teamN;
	}

	
	//adds the professional team names to the League List, "Los Angelos Lakers, etc"
	// ***** find a way to reset the list that way all the teams arent continuously added to list
	public void populateLeague() {
		
		proteamNames2[0] = celticsT;
		proteamNames2[1] = "Brooklyn Nets";
		proteamNames2[2] = "Chicago Bulls";
		proteamNames2[3] = "Golden State Warriors";
		proteamNames2[4] = "Los Angeles Lakers";
		proteamNames2[5] = "Free Agents";
		
		for(int i=0; i<proteamNames2.length; i++) {
			System.out.println(proteamNames2[i].toString());
		}
	
	}
	
	//basic print of each player AFTER they have all been added to the list
	public void print() {
		
		
		
		for(String text: playerList2){
			System.out.println(text);
		}
		
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
