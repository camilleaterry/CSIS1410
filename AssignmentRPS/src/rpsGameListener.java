// Name: Anil Dhungel 
// CSIS 1410
//ROCK PAPER SCISSORS ASSIGNMENT
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class rpsGameListener implements ActionListener
{

	// Declaring variables

	rpsGame game;

	JButton btnRock;
	JButton btnPaper;
	JButton btnScissors;

	JLabel lblUserImage;
	JLabel lblCompImage;
	JLabel showChoiceLabel;
	JLabel lblResult;
	JLabel lblWin;
	JLabel lblLoss;
	JLabel lblTie;

	Icon paper;
	Icon rock;
	Icon scissors;

	int win = 0;
	int loss = 0;
	int tie = 0;

	// Constructor
	public rpsGameListener(JButton btnRock, JButton btnPaper,
			JButton btnScissors, JLabel lblUserImage, JLabel lblCompImage,
			JLabel showChoiceLabel, JLabel lblResult, JLabel lblWin,
			JLabel lblLoss, JLabel lblTie)
	{
		this.game = new rpsGame();
		this.btnRock = btnRock;
		this.btnPaper = btnPaper;
		this.btnScissors = btnScissors;

		this.lblUserImage = lblUserImage;
		this.lblCompImage = lblCompImage;
		this.showChoiceLabel = showChoiceLabel;
		this.lblResult = lblResult;
		this.lblWin = lblWin;
		this.lblLoss = lblLoss;
		this.lblTie = lblTie;

	}

	// Action Even handler
	@Override
	public void actionPerformed(ActionEvent e)
	{
		rpsGame.choice userChoice = null;

		paper = new ImageIcon(getClass().getResource("paper.png"));
		rock = new ImageIcon(getClass().getResource("rock.png"));
		scissors = new ImageIcon(getClass().getResource("scissors.png"));

		if (e.getSource() == btnRock)
		{
			userChoice = rpsGame.choice.ROCK;
			lblUserImage.setIcon(rock);
		} else if (e.getSource() == btnPaper)
		{
			userChoice = rpsGame.choice.PAPER;
			lblUserImage.setIcon(paper);
		} else if (e.getSource() == btnScissors)
		{
			userChoice = rpsGame.choice.SCISSORS;
			lblUserImage.setIcon(scissors);
		}

		rpsGame.choice computerChoice = game.getComputerChoice();

		if (computerChoice == rpsGame.choice.ROCK)
		{
			lblCompImage.setIcon(rock);
		} else if (computerChoice == rpsGame.choice.PAPER)
		{
			lblCompImage.setIcon(paper);
		} else if (computerChoice == rpsGame.choice.SCISSORS)
		{
			lblCompImage.setIcon(scissors);
		}

		// check the status of the game win, loss, tie

		rpsGame.status status = game.gameStatus(userChoice, computerChoice);

		if (status == rpsGame.status.WIN)
		{
			showChoiceLabel.setText("YOU CHOSE: " + userChoice
					+ ". COMPUTER CHOSE: " + computerChoice);
			lblResult.setText("YOU WON!");
			win++;

		} else if (status == rpsGame.status.LOSE)
		{
			showChoiceLabel.setText("YOU CHOSE: " + userChoice
					+ ". COMPUTER CHOSE: " + computerChoice);
			lblResult.setText("COMPUTER WON!");

			loss++;

		} else
		{
			showChoiceLabel.setText("YOU CHOSE: " + userChoice
					+ ". COMPUTER CHOSE: " + computerChoice);
			lblResult.setText("IT'S A TIE!");

			tie++;

		}

		// add text to win, loss and tie count labels
		lblTie.setText ("TIE   :" + tie);
		lblLoss.setText("LOSS:" + loss);
		lblWin.setText ("WIN  :" + win);

	}

}
