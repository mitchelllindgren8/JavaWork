package NBAapp;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NBAAdminApp {
	
	public static String teamInput = "";
	public static String Owner = "";
	
	//public String[][] LEAGUE = new String[][] {Bulls, Celtics, Lakers, Nets, Warriors, FreeAgents};
	public static String[][] LEAGUE = new String[6][];
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		boolean found = false;
	
		//ask if player or owner
		System.out.println("VERSION 2.3\n");
		System.out.print("*** Welcome NBA Owner ***\n(Please choose your respective basketball team)"
				+ "\n\tBoston Celtics\n\tBrooklyn Nets\n\tChicago Bulls\n\tGolden State Warriors\n\tLos Angeles Lakers\n>>>");
		
		Scanner scan = new Scanner(System.in);
		teamInput = scan.nextLine();
		
		//then call Team or League with the user team input
		//League2 League = new League2();	//creates entire League list, team list, player list, sets player attributes 
		//found = League.checkLeague(teamInput);
		//Team tm = new Team(found);
		
		Team tm = new Team(teamInput);
		
		
	
		/*
		System.out.print("Please enter your name as Owner: \n>>>");
		Owner = scan.nextLine();
		*/
	}
}
