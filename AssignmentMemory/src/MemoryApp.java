/*
 * Name:Anil Dhungel
 * Assignment 5 Memory
 * CSIS-1410
 */
import javax.swing.JFrame;
import java.awt.Font;

public class MemoryApp
{
	public static void main (String[] args)
	{
		Memory frame = new Memory(); 
		frame.getContentPane().setFont(new Font("American Typewriter", Font.BOLD, 16));
		frame.setSize(738,375);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
	}
}
