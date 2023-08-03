import java.util.Scanner;
import java.util.Random;
public class Rock
{
	public static void main (String[] args)
	{
	String computer = "";
	String user = "";
	Scanner s = new Scanner(System.in);
	System.out.println("Rock paper scissors");
	String user = scanner.nextLine();
	Random number = new Random();
	int number = random.NextInt(3);
    if (number == 0)
    {
    computer = "rock";
    }
    else if (number == 1)
    {
    computer = "paper";

    }
    else 
    {
    computer = "scissors";
    }
    if (user.equals("q"))
    {
    System.out.println("QUIT");
    }
	}
	public static boolean game(String user, String computer)
	{
	if (user.equalsIgnoreCase(computer))
	{
	System.out.println("Draw");
	System.out.println("User selected " + user);
	System.out.println("Computer selected " + computer);
	}
	if (user.equalsIgnoreCase("rock")&&(computer.equals("paper")))
	{
	System.out.println("Computer wins");
	System.out.println("User selected " + user);
	System.out.println("Computer selected " + computer);
	}
	if (user.equalsIgnoreCase("rock")&&(computer.equals("scissors")))
	{
	System.out.println("User wins");
	System.out.println("User selected " + user);
	System.out.println("Computer selected " + computer);
	}
	if (user.equalsIgnoreCase("scissors")&&(computer.equals("paper")))
	{
	System.out.println("User wins");
	System.out.println("User selected " + user);
	System.out.println("Computer selected " + computer);
	}
	if (user.equalsIgnoreCase("scissors")&&(computer.equals("rock")))
	{
	System.out.println("Computer wins");
	System.out.println("User selected " + user);
	System.out.println("Computer selected " + computer);
	}
	if (user.equalsIgnoreCase("paper")&&(computer.equals("rock")))
	{
	System.out.println("User wins");
	System.out.println("User selected " + user);
	System.out.println("Computer selected " + computer);
	}
	if (user.equalsIgnoreCase("paper")&&(computer.equals("scissors")))
	{
	System.out.println("Computer wins");
	System.out.println("User selected " + user);
	System.out.println("Computer selected " + computer);
	}
	}
}