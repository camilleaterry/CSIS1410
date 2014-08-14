import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.SwingConstants;


@SuppressWarnings("serial")
public class CoinGUI extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoinGUI frame = new CoinGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CoinGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		final JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("American Typewriter", Font.PLAIN, 16));
		lblNewLabel.setSize(new Dimension(300, 0));
		lblNewLabel.setPreferredSize(new Dimension(300, 0));
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
		
		Icon Image1 = new ImageIcon(getClass().getResource("UsCent.png"));
		JRadioButton rdbtnNewRadioButton = new JRadioButton(Image1);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText(Coin.CENT.toString());
			}
		});
		
	
		buttonGroup.add(rdbtnNewRadioButton);
		panel.add(rdbtnNewRadioButton);
		
		Icon Image2 = new ImageIcon(getClass().getResource("UsNickel.png"));
		JRadioButton rdbtnNickel = new JRadioButton(Image2);
		rdbtnNickel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText(Coin.NICKEL.toString());
			}
		});
		buttonGroup.add(rdbtnNickel);
		panel.add(rdbtnNickel);
		
		Icon Image3 = new ImageIcon(getClass().getResource("UsDime.png"));
		JRadioButton rdbtnDime = new JRadioButton(Image3);
		rdbtnDime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText(Coin.DIME.toString());
			}
		});
		buttonGroup.add(rdbtnDime);
		panel.add(rdbtnDime);
		
		Icon Image4 = new ImageIcon(getClass().getResource("UsQuarter.png"));
		JRadioButton rdbtnQuarter = new JRadioButton(Image4);
		rdbtnQuarter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText(Coin.QUARTER.toString());
			}
		});
		buttonGroup.add(rdbtnQuarter);
		panel.add(rdbtnQuarter);
		
		
		
		
		
	}

}
