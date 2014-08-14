//Author - Anil Dhungel 
//Assignment 6- GUI FACE 

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

@SuppressWarnings("serial")
public class Face extends JFrame {
	// Check box variable
	private JCheckBox chckbxNose;
	private JCheckBox chckbxEyes;
	private JCheckBox chckbxMouth;

	// ImageIcon variables

	private ImageIcon[] eyes = new ImageIcon[5];
	private ImageIcon[] nose = new ImageIcon[5];
	private ImageIcon[] mouth = new ImageIcon[5];

	// Image variable
	private int indexEyes;
	private int indexNose;
	private int indexMouth;

	// Variable for red green and blue value of color
	private int red = 255;
	private int green = 255;
	private int blue = 255;

	public Face() {
		// Panel to add checkbox buttons, JLabel and Updated button
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(150, 150));
		getContentPane().add(panel, BorderLayout.WEST);
		panel.setLayout(null);

		JLabel lblYouChoose = new JLabel("You Choose:");
		lblYouChoose.setBounds(6, 17, 79, 16);
		panel.add(lblYouChoose);

		// checkbox for mouth
		chckbxMouth = new JCheckBox("Mouth");
		chckbxMouth.setBounds(6, 38, 128, 23);
		panel.add(chckbxMouth);

		// Checkbox for nose
		chckbxNose = new JCheckBox("Nose\n");
		chckbxNose.setBounds(6, 73, 128, 23);
		panel.add(chckbxNose);

		// Checkbox for eyes
		chckbxEyes = new JCheckBox("Eyes\n");
		chckbxEyes.setBounds(6, 108, 128, 23);
		panel.add(chckbxEyes);

		// update button
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setBounds(6, 143, 104, 29);
		panel.add(btnUpdate);

		// ImageIcons

		for (int i = 1; i <= 5; i++) {
			eyes[i - 1] = new ImageIcon(getClass().getResource(
					"eye" + i + ".png"));
		}

		for (int i = 1; i <= 5; i++) {
			nose[i - 1] = new ImageIcon(getClass().getResource(
					"nose" + i + ".png"));
		}

		for (int i = 1; i <= 5; i++) {
			mouth[i - 1] = new ImageIcon(getClass().getResource(
					"mouth" + i + ".png"));
		}

		// adding paint component to the panel
		add(new ovalComponent());

		// Action Listener conditions
		btnUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if ((!chckbxMouth.isSelected() && !chckbxEyes.isSelected() && !chckbxNose
						.isSelected())) {
					red = (int) (Math.random() * 256);
					green = (int) (Math.random() * 256);
					blue = (int) (Math.random() * 256);
					repaint();
				} else {
					if (chckbxEyes.isSelected()) {
						indexEyes = (1 + indexEyes) % eyes.length;
					}

					if (chckbxNose.isSelected()) {
						indexNose = (1 + indexNose) % nose.length;
					}

					if (chckbxMouth.isSelected()) {
						indexMouth = (1 + indexMouth) % mouth.length;
					}

				}
				repaint();
				//
			}

		});
	}

	// paint component methods
	public class ovalComponent extends JPanel {
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			this.setBackground(Color.BLUE);
			drawFace faceDrawn = new drawFace();
			faceDrawn.drawingFace(g);
		}
	}

	// all the items to draw face
	private class drawFace {
		public void drawingFace(Graphics g) {
			g.setColor(new Color(red, green, blue));
			g.fillOval(50, 18, 400, 400);
			g.setColor(Color.BLACK);
			g.drawImage(eyes[indexEyes].getImage(), 110, 65, 280, 200, null);
			g.drawImage(nose[indexNose].getImage(), 215, 185, 77, 125, null);
			g.drawImage(mouth[indexMouth].getImage(), 157, 270, 200, 125, null);

			Graphics2D g2d = (Graphics2D) g;
			g2d.setStroke(new BasicStroke(12.0f));
			Ellipse2D ellipse = new Ellipse2D.Double(50, 18, 400, 400);
			g2d.draw(ellipse);
		}
	}
}