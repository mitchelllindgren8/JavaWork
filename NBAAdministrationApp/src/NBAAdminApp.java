import java.util.Scanner;

public class NBAAdminApp {
	
	public static String teamInput = "";
	public static Team team = new Team();
	
	
	public static void main(String[] args) {
		
		System.out.print("*** Welcome NBA Owner ***\n(Please choose your respective basketball team)"
				+ "\n\tBoston Celtics\n\tBrooklyn Nets\n\tChicago Bulls\n\tGolden State Warriors\n\tLos Angeles Lakers\n>>>");
		
		Scanner scan = new Scanner(System.in);
		teamInput = scan.nextLine();

		team.Team(teamInput);
		
	}

}
