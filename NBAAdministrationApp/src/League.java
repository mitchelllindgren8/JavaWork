import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class League {
	
	public List<String> playerList = new ArrayList();	//list of list of player
    public ArrayList<String> newteamList = new ArrayList();	//list of team names in League
	private String[] tempTeam = new String[6];	//holds the 5 players into a temp array
	private String fullteamName;	//"Los Angelos Lakers" not just "Lakers"
	
	private int itr = 0;
	
	public Team tm1 = new Team();
	
	public League(String teamNamee) {
		
		this.fullteamName = teamNamee;
	}
	
	
	public void populateLeague() {
		
		newteamList.add(tm1.bullsT);
		newteamList.add(tm1.celticsT);
		newteamList.add(tm1.lakersT);
		newteamList.add(tm1.netsT);
		newteamList.add(tm1.warriorsT);
		newteamList.add(tm1.freeAgentsT);
	}
	
	public void populatePlayerList(String[] playerRoster) {
		
		this.tempTeam = playerRoster;
		
		//this code can be deleted once the print is finalized 
		  //add the ArrayList of players to a List
		  for(String text: tempTeam){
			  playerList.add(text);
		  }
		 
		  Team[] leagueArray = {};
		  
		  //leagueArray[itr] = tempTeam
		 
		  
		
	}
	
	public boolean checkLeague() {
		
		boolean found = false;
		
		if(newteamList.contains(fullteamName)) 
			found = true;
		
		return found;
	}
	
	public void printLeague() {
				
		 int i = 0;
		 int j = 0;
		 //tm1.populateLeague();
		 
		 /*
		 while (i < 6) {
			 
			 System.out.println("** The " + newteamList.get(i) + " **");
			 
			 //iterate 5 times b/c the list combines all the teams
			 for(int k = 0; k < 5; k++) {
				 System.out.println("\t" + playerList.get(j));
				 j++;
			 }
			 System.out.println("\n");
			 i++;
		 }
		 */
		 
		//other method of printing
		String[] tempT;

		for(int n=0; n <tm1.LEAGUE.length; n++) {
			
			tempT = new String[tm1.LEAGUE[n].length];
			
			System.out.println(tempT.length);
			tempT.equals(tm1.LEAGUE[n]);
			System.out.println(Arrays.toString(tempT));	//keep it tempT in order to prove LEAGUE holds each teamArray
		} 
	}

}
