/*
 * Name:Anil Dhungel
 * Assignment 5 Memory
 * CSIS-1410
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Memory extends JFrame
{
	//Assigning variables
	private Icon Image;	
	private Icon Image1;
	private Icon Image2;
	private Icon Image3;
	private Icon Image4;
	private Icon Image5;
	private Icon Image6;

	private JToggleButton button1;
	private JToggleButton button2; 
	private JToggleButton button3; 
	private JToggleButton button4; 
	private JToggleButton button5; 
	private JToggleButton button6; 
	private JToggleButton button7; 
	private JToggleButton button8; 
	private JToggleButton button9; 
	private JToggleButton button10; 
	private JToggleButton button11; 
	private JToggleButton button12; 
	private JLabel titleName;

	//Creating Constructor 	
	public Memory()
	{
		super("Memory Game");

		//Setting up Panel and Layout
		JPanel buttonsPanel = new JPanel(); 
		buttonsPanel.setLayout(new GridLayout(3,4,10,10));
		buttonsPanel.setBackground(new Color (200,200,200));
		buttonsPanel.setBorder(BorderFactory.createEmptyBorder(20,0,0,0));
				
				
		
		//Assigning Image variable 
		Image = new ImageIcon(getClass().getResource("button.png"));
		Image1 = new ImageIcon(getClass().getResource("bangladesh.png"));
		Image2 = new ImageIcon(getClass().getResource("brazil.png"));
		Image3 = new ImageIcon(getClass().getResource("canada.png"));
		Image4 = new ImageIcon(getClass().getResource("india.png"));
		Image5 = new ImageIcon(getClass().getResource("usa.png"));
		Image6 = new ImageIcon(getClass().getResource("argentina.png"));

		//Creating new Toggle buttons

		button1 = new JToggleButton (Image,true);
		buttonsPanel.add(button1);

		button2 = new JToggleButton(Image,true);
		buttonsPanel.add(button2);

		button12 = new JToggleButton(Image,true);
		buttonsPanel.add(button12);

		button3 = new JToggleButton(Image,true);
		buttonsPanel.add(button3);

		button8 = new JToggleButton(Image,true);
		buttonsPanel.add(button8);

		button4 = new JToggleButton(Image,true);
		buttonsPanel.add(button4);

		button11 = new JToggleButton(Image,true);
		buttonsPanel.add(button11);

		button10 = new JToggleButton(Image,true);
		buttonsPanel.add(button10);

		button6 = new JToggleButton(Image,true);
		buttonsPanel.add(button6);

		button5 = new JToggleButton(Image,true);
		buttonsPanel.add(button5);

		button7 = new JToggleButton(Image,true);
		buttonsPanel.add(button7);

		button9 = new JToggleButton(Image,true);
		buttonsPanel.add(button9);

		//Adding actionlistener to the button 
		ButtonClickEventHandler buttonEventHandler = new ButtonClickEventHandler();
		button1.addActionListener(buttonEventHandler);
		button2.addActionListener(buttonEventHandler);
		button3.addActionListener(buttonEventHandler);
		button4.addActionListener(buttonEventHandler);
		button5.addActionListener(buttonEventHandler);
		button6.addActionListener(buttonEventHandler);
		button7.addActionListener(buttonEventHandler);
		button8.addActionListener(buttonEventHandler);
		button9.addActionListener(buttonEventHandler);
		button10.addActionListener(buttonEventHandler);
		button11.addActionListener(buttonEventHandler);
		button12.addActionListener(buttonEventHandler);


		//Setting up second JPanel for adding title
		JPanel titlePanel = new JPanel(); 
		titlePanel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		titlePanel.setLayout(new BorderLayout());


		titlePanel.add(titleName= new JLabel("MEMORY",SwingConstants.CENTER),BorderLayout.NORTH);
		titleName.setForeground(Color.BLACK);
		titleName.setFont(new Font("American Typewriter", Font.BOLD, 18));
		titleName.setVerticalAlignment(SwingConstants.TOP);

		titlePanel.add(buttonsPanel,BorderLayout.CENTER);
		titlePanel.setBackground(new Color (200,200,200));
		getContentPane().add(titlePanel);
	}
	//Eventhandler class 
	private class ButtonClickEventHandler implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if(e.getSource()==button1)
			{
				if(button1.isSelected()){
					button1.setIcon(Image);
				}
				else
				{
					button1.setIcon(Image1);
				}

			}
			if(e.getSource()==button2)
			{
				if(button2.isSelected()){
					button2.setIcon(Image);
				}
				else
				{
					button2.setIcon(Image2);
				}
			}
			if(e.getSource()==button3)
			{
				if(button3.isSelected()){
					button3.setIcon(Image);
				}
				else
				{
					button3.setIcon(Image3);
				}
			}
			if(e.getSource()==button4)
			{
				if(button4.isSelected()){
					button4.setIcon(Image);
				}
				else
				{
					button4.setIcon(Image4);
				}
			}
			if(e.getSource()==button5)
			{
				if(button5.isSelected()){
					button5.setIcon(Image);
				}
				else
				{
					button5.setIcon(Image5);
				}
			}
			if(e.getSource()==button6)
			{
				if(button6.isSelected()){
					button6.setIcon(Image);
				}
				else
				{
					button6.setIcon(Image6);
				}
			}
			if(e.getSource()==button7)
			{
				if(button7.isSelected()){
					button7.setIcon(Image);
				}
				else
				{
					button7.setIcon(Image1);
				}
			}
			if(e.getSource()==button8)
			{
				if(button8.isSelected()){
					button8.setIcon(Image);
				}
				else
				{
					button8.setIcon(Image2);
				}
			}
			if(e.getSource()==button9)
			{
				if(button9.isSelected()){
					button9.setIcon(Image);
				}
				else
				{
					button9.setIcon(Image3);
				}
			}
			if(e.getSource()==button10)
			{
				if(button10.isSelected()){
					button10.setIcon(Image);
				}
				else
				{
					button10.setIcon(Image4);
				}
			}
			if(e.getSource()==button11)
			{
				if(button11.isSelected()){
					button11.setIcon(Image);
				}
				else
				{
					button11.setIcon(Image5);
				}
			}
			if(e.getSource()==button12)
			{
				if(button12.isSelected()){
					button12.setIcon(Image);
				}
				else
				{
					button12.setIcon(Image6);
				}
			}

		}


	}

}
