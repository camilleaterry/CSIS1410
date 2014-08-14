
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


@SuppressWarnings("serial")
public class ImageButton extends JFrame
{
	private JButton imgButton; 
	private Icon clickImage; 
	
	public ImageButton()
	{
		super("Lab Button");
		
		Icon Image1 = new ImageIcon(getClass().getResource("Image1.png"));
		Icon Image2 = new ImageIcon(getClass().getResource("Image2.png"));
		clickImage = new ImageIcon(getClass().getResource("Image3.gif"));
		
		imgButton = new JButton(Image1);
		imgButton.setRolloverIcon(Image2);
		
		add(imgButton);
		ButtonClickEventHandler buttonEventHandler = new ButtonClickEventHandler();
		imgButton.addActionListener(buttonEventHandler);
		
			
	}
	
	private class ButtonClickEventHandler implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			imgButton.setRolloverEnabled(false);
			imgButton.setIcon(clickImage); 
			
		}	
		
	}	
	
	
}
