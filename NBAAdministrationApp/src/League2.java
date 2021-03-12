import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class League2 {
	
    public List<String> proteamNames = new ArrayList();	//list of team names in League
	
	public List<String> playerList2 = new ArrayList();	//list of list of player
	protected static String[] Celtics2 = new String[5];
	protected static String[] Lakers2 = new String[5];
	protected String[] Nets2 = new String[5];
	protected String[] Bulls2 = new String[5];
	protected static  String[] Warriors2 = new String[5];
	protected static String[] FreeAgents2 = new String[6];
	
	public Player[] PLAYERS = new Player[31];	//currently there are 31 players on the file, find a way to not HARDCODE
	
	public String teamN = "";

	
	public League2() throws FileNotFoundException {
		
		createLeague();
	}
	
	//reads DB file of players and sets their attributes
	private void createLeague() throws FileNotFoundException {
		
		/*
		//read in file
		int i = 0;
		File f = new File("players1.txt");
		Scanner scanF = new Scanner(f);
		
		
		while(scanF.hasNext()) {
			String temp = scanF.nextLine();
			Scanner scanR = new Scanner(temp);
			scanR.useDelimiter("#");
			
			String playerName, jerNo, team;
			playerName = scanR.next();
			jerNo = scanR.next();
			team = scanR.next();
			
			//call player, set name, No., team

			//this needs to be an object that gets created and saved,
			//WHERE: I have no idea where to save the Array/List of objects
			//ONCE: figured out call createTeams and pass the object player into the method
			//based on the obj.players team, assign him to the correct List or Array(team)
			//once that is done "Phase Populate League" should be done
			
			PLAYERS[i] = new Player(playerName, team, jerNo);			
			
			if(Person.teamName.contains("Bulls")){
				System.out.println("Bulls yuhh");
				
			} else if(Person.teamName.contains("Celtics")) {
				System.out.println("Celtics yuhh");
				
			} else if(Person.teamName.contains("FreeAgents")) {
				System.out.println("FreeAgents yuhh");
				
			} else if(Person.teamName.contains("Lakers")) {
				System.out.println("Lakers yuhh");
				
			} else if(Person.teamName.contains("Nets")) {
				System.out.println("Nets yuhh");
				
			} else {	//"Warriors"
				System.out.println("Warriors yuhh");
			}
			
			i++;
			playerList2.add(playerName);	//adds player to a complete list of players in the league
		}//ends the while loop 
		
		*/
	}
	
	//checks 
	public boolean checkLeague(String teamName, boolean found) {
		
		Scanner in = new Scanner(System.in);
		populateLeague();	//loook at comment below 

		//Once the while loop ends, found must be true, add an IF statement if wanted
		while(!proteamNames.contains(teamName)){
			System.out.print("[Error] Please enter the correct team name: ");
			teamName = in.nextLine();

		}
		
		found = true;
		Team tm = new Team(teamName);	//passes the correct team-name into Team to be used later
		
		return found;
	}

	
	public void createTeams() {
		
	}
	
	//adds the professional team names to the League List, "Los Angelos Lakers, etc"
	// ***** find a way to reset the list that way all the teams arent continuously added to list
	public void populateLeague() {
		
		proteamNames.add("Chicago Bulls");
		proteamNames.add("Boston Celtics");
		proteamNames.add("Los Angeles Lakers");
		proteamNames.add("Brooklyn Nets");
		proteamNames.add("Golden State Warriors");
		proteamNames.add("Free Agents");
	
	}
	
	//basic print of each player AFTER they have all been added to the list
	public void print() {
		
		for(String text: playerList2){
			System.out.println(text);
		}
		
	}
	
	//based on past code this should print each player
	public void printLeague() {
			
		String[][] League2 = new String[][] {Bulls2, Celtics2, Lakers2, Nets2, Warriors2, FreeAgents2};
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
