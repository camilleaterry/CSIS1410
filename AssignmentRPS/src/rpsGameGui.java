// Name: Anil Dhungel 
// CSIS 1410
//ROCK PAPER SCISSORS ASSIGNMENT

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.SystemColor;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import java.awt.Color;

public class rpsGameGui
{
	public static void main(String[] args)
	{
		// create frame to displaty all the components
		JFrame frame = new JFrame("Amazing RPS");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 430);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);

		// button panel
		JPanel btnPanel = new JPanel();
		btnPanel.setPreferredSize(new Dimension(250, 10));
		btnPanel.setBounds(0, 0, 175, 412);
		btnPanel.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(btnPanel);
		btnPanel.setLayout(null);

		// You choose Label
		JLabel lblYouChoose = new JLabel("CLICK A BUTTON");
		lblYouChoose.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 12));
		lblYouChoose.setBounds(10, 11, 165, 22);
		btnPanel.add(lblYouChoose);

		// Rock button
		JButton btnRock = new JButton("ROCK\r\n");
		btnRock.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 12));
		btnRock.setBounds(10, 80, 115, 25);
		btnPanel.add(btnRock);

		// Paper button
		JButton btnPaper = new JButton("PAPER");
		btnPaper.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 12));
		btnPaper.setBounds(10, 130, 115, 25);
		btnPanel.add(btnPaper);

		// Scissors button
		JButton btnScissors = new JButton("SCISSORS");
		btnScissors.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 12));
		btnScissors.setBounds(10, 180, 115, 25);
		btnPanel.add(btnScissors);

		// lbl for user selection image
		JLabel lblUserImage = new JLabel();
		lblUserImage.setPreferredSize(new Dimension(128, 128));
		lblUserImage.setBounds(236, 115, 128, 128);
		frame.getContentPane().add(lblUserImage);

		// lbl for computer selection image
		JLabel lblCompImage = new JLabel();
		lblCompImage.setPreferredSize(new Dimension(128, 128));
		lblCompImage.setBounds(464, 115, 128, 128);
		frame.getContentPane().add(lblCompImage);
		frame.setVisible(true);

		// label to display results
		JLabel showChoiceLabel = new JLabel();
		showChoiceLabel.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 12));
		showChoiceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		showChoiceLabel.setBounds(185, 300, 539, 41);
		frame.getContentPane().add(showChoiceLabel);

		// Label to display win and loss result
		JLabel lblResult = new JLabel("CLICK ON A BUTTON TO PLAY");
		lblResult.setForeground(Color.BLACK);
		lblResult.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 20));
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setBounds(230, 11, 430, 82);
		frame.getContentPane().add(lblResult);
		
		// shows number of wins
		JLabel lblWin = new JLabel("WIN:");
		lblWin.setBounds(25, 275, 80, 20);
		btnPanel.add(lblWin);
		lblWin.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 14));

		// shows number of ties
		JLabel lblTie = new JLabel("TIE:");
		lblTie.setBounds(25, 300, 80, 20);
		btnPanel.add(lblTie);
		lblTie.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 14));

		// show number of loss
		JLabel lblLoss = new JLabel("LOSS:");
		lblLoss.setBounds(25, 325, 80, 20);
		btnPanel.add(lblLoss);
		lblLoss.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 14));

		// create instance of action listener class
		ActionListener listener = new rpsGameListener(btnRock, btnPaper,
				btnScissors, lblUserImage, lblCompImage, showChoiceLabel,
				lblResult, lblWin, lblLoss, lblTie);
		

		// add action listener to buttons
		btnRock.addActionListener(listener);
		btnPaper.addActionListener(listener);
		btnScissors.addActionListener(listener);

	}
}
