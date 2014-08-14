
import java.util.Random; 

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Building extends JPanel
{
	
	@Override
	protected void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		Random randomColor = new Random();
		
		g.fillRect(175, 50, 105, 400);	
		g.setColor(Color.black); 
		for (int yValue = 60; yValue <=420; yValue +=20)
		{
			for(int xValue = 180; xValue <= 260; xValue+=20 )
			{
				float red = randomColor.nextFloat();
				float green = randomColor.nextFloat();
				float blue = randomColor.nextFloat();
				Color c = new Color(red, green, blue); 
				g.setColor(c);
			    g.fillRect(xValue, yValue, 15, 15);
			}
		
		}
		
	}
		

}