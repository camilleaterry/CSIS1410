
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.GridLayout;
import java.awt.SystemColor;

import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class DemoWrapperClassGui extends JFrame {

    private JPanel contentPane;

    private JMenuBar menuBar;
    private JMenuItem mntnChar;
    private JMenuItem mntmNumber;
    private JMenuItem mntnExit;

    private JPanel charControlPanel;
    private JTextField btnCharSubmit;
    private JTextArea charLabel;

    private JPanel numberControlPanel;
    private JTextArea numberTextArea;
    //private final ButtonGroup buttonGroup = new ButtonGroup();
    private JRadioButton btnNumberInactiveButton;
    private JRadioButton rdbtnBinaryOctHex;
    private final ButtonGroup buttonGroup_1 = new ButtonGroup();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    DemoWrapperClassGui frame = new DemoWrapperClassGui();
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
    public DemoWrapperClassGui() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(50, 50, 700, 450);

        createMenu();
        createCharControlPanel();
        createCharLabel();
        createNumberControlPanel();
        createNumberTextArea();

        createContentPane();
    }

    private void createContentPane() {
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        contentPane.setFont(new Font("Verdana", Font.PLAIN, 26));
        setContentPane(contentPane);

        contentPane.add(numberControlPanel, BorderLayout.WEST);
        contentPane.add(numberTextArea, BorderLayout.CENTER);

        contentPane.add(charControlPanel, BorderLayout.WEST);
        contentPane.add(charLabel, BorderLayout.CENTER);
    }

    private void createNumberTextArea() {
        numberTextArea = new JTextArea();
        numberTextArea.setMargin(new Insets(25, 25, 25, 25));
        numberTextArea.setText("JTextArea");
    }

    private void createNumberControlPanel() {
        numberControlPanel = new JPanel();
        numberControlPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
        numberControlPanel.setLayout(new GridLayout(12, 1, 0, 0));
        final DemoWrapperClass toldButton = new DemoWrapperClass();
 

        btnNumberInactiveButton = new JRadioButton("Min Max");
        buttonGroup_1.add(btnNumberInactiveButton);
        numberControlPanel.add(btnNumberInactiveButton);
        btnNumberInactiveButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				numberTextArea.setText(toldButton.minMax()); 
				
			}
        	
        });
        
        rdbtnBinaryOctHex = new JRadioButton("Binary Oct Hex");
        buttonGroup_1.add(rdbtnBinaryOctHex);
        numberControlPanel.add(rdbtnBinaryOctHex);
        rdbtnBinaryOctHex.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				numberTextArea.setText(toldButton.toBinary(15)); 
				
			}
        	
        });
        
    }

    private void createCharLabel() {
        charLabel = new JTextArea("Char");
        charLabel.setForeground(new Color(255, 255, 255));
        charLabel.setOpaque(true);
        charLabel.setBackground(new Color(220, 20, 60));
        charLabel.setFont(new Font("Verdana", Font.PLAIN, 40));
        charLabel.setMargin(new Insets(30,30,30,30));
    }

    private void createCharControlPanel() {
        charControlPanel = new JPanel();
        charControlPanel.setBackground(SystemColor.controlHighlight);
        charControlPanel.setBorder(new EmptyBorder(15, 15, 15, 15));
        charControlPanel.setLayout(new GridLayout(7, 1, 0, 0));
        charControlPanel.setPreferredSize(new Dimension(150, 100));
      
      
        final DemoWrapperClass getChar = new DemoWrapperClass();
       

        btnCharSubmit = new JTextField("Submit");
        charControlPanel.add(btnCharSubmit);
        
        
        btnCharSubmit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String x = btnCharSubmit.getText();
				char c = x.charAt(0); 
				
				charLabel.setText(getChar.charProperties(c));
				
			}
		});
    }

    private void createMenu() {
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        mntmNumber = new JMenuItem("Number");
        mntmNumber.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                contentPane.removeAll();
                contentPane.add(numberControlPanel, BorderLayout.WEST);
                contentPane.add(numberTextArea, BorderLayout.CENTER);
                revalidate();
                repaint();
            }
        });
        menuBar.add(mntmNumber);

        mntnChar = new JMenuItem("Char");
        mntnChar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                contentPane.removeAll();
                contentPane.add(charControlPanel, BorderLayout.WEST);
                contentPane.add(charLabel, BorderLayout.CENTER);
                revalidate();
                repaint();
            }
        });
        menuBar.add(mntnChar);

        mntnExit = new JMenuItem("Exit");
        mntnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.exit(0);
            }
        });
        menuBar.add(mntnExit);
    }

}
