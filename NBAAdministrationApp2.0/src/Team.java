import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;


public class Team {
	
	//REMINDER (static): indicates that the particular member belongs to a type itself, rather than to an instance of that type. (only one instance of that static member is created which is shared across all instances of the class)
	private static String nbaTeam;
	private int iterator = 0;

	//objects
	public League2 league = new League2();
	
	//Team Constructor
	public Team(String team) throws FileNotFoundException {
		
		boolean found = league.checkLeague(team);
		setTeam();

		while(found == true && iterator == 0) 	//note to self, when comparing boolean use 2 "=="
			printMenu();
		
	}
	
	//sets this Team.nbaTeam to the correct League.nbaTeam
	public String setTeam() {
		
		nbaTeam = league.nbaTeam;
		return nbaTeam;
	}
	
	//main print menu
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
	

}//ends main team class
