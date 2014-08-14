// Name: Anil Dhungel 
// CSIS 1410
//ROCK PAPER SCISSORS ASSIGNMENT

import java.util.Random;

public class rpsGame
{
	public static enum choice
	{
		ROCK, PAPER, SCISSORS;
	}

	public static enum status
	{
		WIN, LOSE, TIE;
	}

	// check to see who wins the game
	public status gameStatus(choice userChoice, choice computerChoice)
	{
		if (userChoice == choice.ROCK)
		{
			if (computerChoice == choice.PAPER)
			{

				return status.LOSE;

			} else if (computerChoice == choice.SCISSORS)
			{

				return status.WIN;
			}
		} else if (userChoice == choice.PAPER)
		{
			if (computerChoice == choice.SCISSORS)
			{

				return status.LOSE;
			} else if (computerChoice == choice.ROCK)
			{

				return status.WIN;
			}
		} else if (userChoice == choice.SCISSORS)
		{
			if (computerChoice == choice.PAPER)
			{

				return status.WIN;
			} else if (computerChoice == choice.ROCK)
			{

				return status.LOSE;
			}
		}

		return status.TIE;

	}

	// get randome choice for Computer
	public choice getComputerChoice()
	{
		choice[] choices = choice.values();
		Random random = new Random();
		int index = random.nextInt(choices.length);
		return choices[index];
	}

}
