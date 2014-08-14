import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class guiLayout extends JFrame {

	public guiLayout() {

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 1, 0, 0));

		JLabel lblLabel = new JLabel("Label");
		lblLabel.setOpaque(true);
		lblLabel.setForeground(Color.BLACK);
		lblLabel.setBackground(Color.RED);
		lblLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblLabel);

		final JButton clickMeButton = new JButton("Click Me");
		clickMeButton.setFont(new Font("Gill Sans", Font.BOLD, 15));
		clickMeButton.setForeground(Color.WHITE);
		clickMeButton.setBorderPainted(false);
		clickMeButton.setOpaque(true);
		clickMeButton.setBackground(Color.BLUE);
		panel.add(clickMeButton);

		final JLabel lblNewLabel = new JLabel("Hi");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);

		final JButton btnButton = new JButton("Button");
		btnButton.setForeground(Color.WHITE);
		btnButton.setFont(new Font("Gill Sans", Font.BOLD, 15));
		btnButton.setBorderPainted(false);
		btnButton.setOpaque(true);
		btnButton.setBackground(Color.BLUE);
		panel.add(btnButton);

		clickMeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (clickMeButton.getBackground() == Color.BLUE) {
					clickMeButton.setBackground(Color.GREEN);

				} else {
					clickMeButton.setBackground(Color.BLUE);
					lblNewLabel.setBackground(Color.YELLOW);
				}

			}

		});

	}

	public static void main(String[] args) {
		guiLayout frame = new guiLayout();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);

	}
}
