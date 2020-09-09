// Excersise on page 386-391. ****main method now present****

import java.util.*;
public class BowlingTeamDemo4
{
	public static void main(String[] args)
	{
		
			// variables and constants
		String name;
		int x;
		int y;
		final int NUM_TEAM_MEMBERS = 4;
		final int NUM_TEAMS = 4;
		}

			// input phase
		Scanner input = new Scanner(System.in);


		BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];

		// Call to getTeamData() method
		getTeamData(teams);

		// output phase
		for(y = 0; y < NUM_TEAMS; ++y)
		{
			System.out.println("\nMembers of team " + teams[y].getTeamName());
			// loop the process of putting each individual memer of bowlTeam
			for(x= 0; x < NUM_TEAM_MEMBERS; ++x)
			{
				System.out.print(teams[y].getMember(x) + " ");
			}
			System.out.println();

	}

	// Added feature that will allow the user to lookup the roster of any existing team by just entering the team name
		System.out.print("\n\nEnter a team name to see its roster");
		name = input.nextLine();
		for(y = 0; y < teams.length; ++y)
		{
			if(name.equalsIgnoreCase(teams[y].getTeamName()))
			{
				for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
				{
					System.out.print(teams[y].getMember(x) + " ");
				}// end of for loop
			}// end of if statement
		}//end of for loop

		}//end of y loop for output phase

		// definition of the getTeamData method
		public static void getTeamData(BowlingTeam[] teams)
		{
			// variables and constants
		String name;
		int x;
		int y;
		final int NUM_TEAM_MEMBERS = 4;
		final int NUM_TEAMS = 4;
		}

			// input phase
		Scanner input = new Scanner(System.in);

		//loop for each individual team
		for(y = 0; y < NUM_TEAMS; ++y) 
		{
			teams[y] = new BowlingTeam();
			System.out.print("Please enter team name >>");
			name = input.nextLine();
			teams[y].setTeamName(name);
			System.out.println("Enter 4 team members please:");
		
			// loop process of entering members for the team
			for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
			{
				System.out.print("Enter team member's name >> ");
				name = input.nextLine();
				teams[y].setMember(x, name);
			}
		}// end of y loop for teams
}