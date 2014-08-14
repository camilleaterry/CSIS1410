//Student: Anil Dhungel
// CSIS 1410
//Assignment 07 ListVsSet

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.GridLayout;
import java.awt.SystemColor;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class ListVsSetGui extends JFrame {

	private JPanel contentPane;

	private JMenuBar menuBar;
	private JMenuItem mntnListVsSet;
	private JMenuItem mntmDemo;
	private JMenuItem mntnExit;

	private JTextArea listVsSetTextArea;

	private JPanel demoControlPanel;
	private JLabel lblYourChoice;
	private JRadioButton rdbtnListELements;
	private JRadioButton rdbtnSetElements;
	private JRadioButton rdbtnAddElements;

	private final ButtonGroup buttonGroup = new ButtonGroup();

	private JTextArea demoTextArea;
	private JPanel ListVsSetPanel;
	private JLabel lblNewLabel;
	private JLabel lblOnePanelToo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					ListVsSetGui frame = new ListVsSetGui();
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
	public ListVsSetGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 700, 450);

		createMenu();
		createListVsSetTextArea();
		createDemoControlPanel();
		createDemoTextArea();
		createContentPane();
	}

	private void createContentPane() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setFont(new Font("Verdana", Font.PLAIN, 26));
		setContentPane(contentPane);

		// contentPane.add(demoControlPanel, BorderLayout.WEST);
		// contentPane.add(demoTextArea, BorderLayout.CENTER);

		contentPane.add(listVsSetTextArea, BorderLayout.CENTER);

		ListVsSetPanel = new JPanel();
		ListVsSetPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
		contentPane.add(ListVsSetPanel, BorderLayout.WEST);
		ListVsSetPanel.setLayout(new GridLayout(7, 1, 0, 0));

		lblOnePanelToo = new JLabel("One panel too many.");
		ListVsSetPanel.add(lblOnePanelToo);

		lblNewLabel = new JLabel("This panel needs to go");
		ListVsSetPanel.add(lblNewLabel);
	}

	private void createDemoTextArea() {
		demoTextArea = new JTextArea();
		demoTextArea.setBackground(UIManager.getColor("TextField.light"));
		demoTextArea.setFont(new Font("Consolas", Font.PLAIN, 16));
		demoTextArea.setMargin(new Insets(25, 25, 25, 25));
	}

	private ListVsSetDemo toldtoMake = new ListVsSetDemo(new ColoredSquare(14,
			Color.BLUE), new ColoredSquare(18, Color.RED), new ColoredSquare(
			12, Color.YELLOW), new ColoredSquare(18, Color.RED),
			new ColoredSquare(16, Color.GREEN));

	private void createDemoControlPanel() {
		demoControlPanel = new JPanel();
		demoControlPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
		demoControlPanel.setLayout(new GridLayout(12, 1, 0, 0));

		lblYourChoice = new JLabel("Your Choice:");
		lblYourChoice.setFont(new Font("Consolas", Font.BOLD, 14));
		demoControlPanel.add(lblYourChoice);

		rdbtnListELements = new JRadioButton("List Elements");
		rdbtnListELements.setFont(new Font("Consolas", Font.PLAIN, 14));
		buttonGroup.add(rdbtnListELements);
		demoControlPanel.add(rdbtnListELements);

		rdbtnListELements.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				demoTextArea.setText(toldtoMake.getListElements());

			}
		});

		rdbtnSetElements = new JRadioButton("Set Elements");
		rdbtnSetElements.setFont(new Font("Consolas", Font.PLAIN, 14));
		buttonGroup.add(rdbtnSetElements);
		demoControlPanel.add(rdbtnSetElements);
		rdbtnSetElements.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				demoTextArea.setText(toldtoMake.getSetElements());

			}
		});

		rdbtnAddElements = new JRadioButton("Add Elements");
		rdbtnAddElements.setFont(new Font("Consolas", Font.PLAIN, 14));
		buttonGroup.add(rdbtnAddElements);
		demoControlPanel.add(rdbtnAddElements);
		rdbtnAddElements.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ColoredSquare newElement = new ColoredSquare(10, Color.ORANGE);
				toldtoMake.addElement(newElement);
				demoTextArea.setText("New element is added "
						+ newElement.toString());

			}
		});

	}

	private void createListVsSetTextArea() {
		listVsSetTextArea = new JTextArea(
				"The 2 main differences between interface List and Set are:\n"
						+ "1. List is an ordered sequence of elements whereas Set is a distinct list of elements which is unordered\n"
						+ "2. List is used to collection of elements with duplicates.Set is used to collection of elements without duplicates.");
		listVsSetTextArea.setMargin(new Insets(25, 25, 25, 25));
		listVsSetTextArea.setForeground(new Color(255, 255, 255));
		listVsSetTextArea.setOpaque(true);
		listVsSetTextArea.setBackground(SystemColor.inactiveCaptionText);
		listVsSetTextArea.setFont(new Font("Verdana", Font.PLAIN, 18));
		listVsSetTextArea.setLineWrap(true);
	}

	private void createMenu() {
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mntmDemo = new JMenuItem("Demo");
		mntmDemo.setHorizontalAlignment(SwingConstants.CENTER);
		mntmDemo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				contentPane.removeAll();
				contentPane.add(demoControlPanel, BorderLayout.WEST);
				contentPane.add(demoTextArea, BorderLayout.CENTER);
				revalidate();
				repaint();
			}
		});
		menuBar.add(mntmDemo);

		mntnListVsSet = new JMenuItem("List vs Set");
		mntnListVsSet.setHorizontalAlignment(SwingConstants.CENTER);
		mntnListVsSet.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				contentPane.removeAll();
				contentPane.add(listVsSetTextArea, BorderLayout.CENTER);
				revalidate();
				repaint();
			}
		});
		menuBar.add(mntnListVsSet);

		mntnExit = new JMenuItem("Exit");
		mntnExit.setHorizontalAlignment(SwingConstants.CENTER);
		mntnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}

		});
		menuBar.add(mntnExit);
	}

}
