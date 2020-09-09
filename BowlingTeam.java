// Exercise on pages 386-391 ***Blueprint no main method data....can also use for future reference****

public class BowlingTeam
{
	// Data field varibles for this class
	private String teamName;
	private String[] members = new String[4];

	// No custom constructors, this class uses java default constructors

	// Mutator (setter) method for teamName
	public void setTeamName(String team)
	{
		teamName = team;
	}

	// accessor (getter) method for teamName
	public String getTeamName()
	{
		return teamName;
	}

	// mutator (setter) method for members[]
	public void setMember(int number, String name)
	{
		members[number] = name; 
	}

	// accessor (getter) method for members[]
	public String getMember(int number)
	{
		return members[number];
	}

}