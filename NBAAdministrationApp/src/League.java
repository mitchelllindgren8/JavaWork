import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class League {
	
	public List<String> playerList = new ArrayList();	//list of list of player
    public ArrayList<String> newteamList = new ArrayList();
 
    
    ///////// Test code for array
    public String[] teamListArray = new String[6];
    private int itr = 0;	//acts as a global counter or iterator
    ///////
    
    public List<String> list =new ArrayList<String>();
	
	private String[] tempTeam = new String[6];	//holds the 5 players into a tempValue
	private String fullteamName;	//"Los Angelos Lakers" not just "Lakers
	
	public Team tm1 = new Team();
	

	
	//Array, String Constructor
	//public League(String[] team, String teamNamee) {
	public League(String teamNamee) {
		
		this.fullteamName = teamNamee;
		System.out.println(fullteamName + ":confirmation fullteamName works");
		
		//populateLeague();
	}
	
	
	public void populateLeague() {
		
			//this.tempName = name;
			
			//System.out.println(tempName);
			System.out.println("we in popLeague: adding teams to league");
			//newteamList.add(tempName);
			
			newteamList.add(tm1.bullsT);
			newteamList.add(tm1.celticsT);
			newteamList.add(tm1.freeAgentsT);
			newteamList.add(tm1.lakersT);
			newteamList.add(tm1.netsT);
			newteamList.add(tm1.warriorsT);
			
			System.out.println(newteamList);


	  //add the ArrayList of players to a List
	  //for(String text: tempTeam){
		//  playerList.add(text);
	  //}
	  
	  //playerList.addAll(tempTeam);
      
      //printLeague();
	}
	
	public boolean checkLeague() {
		
		boolean found = false;
		
		if(newteamList.contains(fullteamName)) {
			
			//System.out.println(tm.leagueList);
			//System.out.println(fullteamName);
			found = true;
		}
		return found;
	}
	
	public void printLeague() {
		
		System.out.println();
		
		 for(String fruit:newteamList)  
			  System.out.println(fruit);
		 System.out.println("\n");
		 
		//System.out.println(playerList);
		
		
		//System.out.println("In League- Print");
		
		/*
		System.out.println("\nThe " + fullteamName);
		playerList = Arrays.asList(tempTeam);
		//list.add(tempTeam);	//try to add the Array "tempTeam" to the List here
		System.out.println(playerList + "\n");
		*/
		
		//can delete, prints each team
		//System.out.println("\nLeague Constructor printing");
		//for(int i= 0; i<5; i++) 
			//System.out.println("\t" + tempTeam[i]);
		//System.out.println("***************************************\n");
		//////////////
	}

}
