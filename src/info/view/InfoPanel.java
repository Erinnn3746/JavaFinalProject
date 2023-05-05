package info.view;

import info.controller.Controller;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Dimension;

/**
 * Variable Initializer 
 * @author ezha0219
 *
 */
public class InfoPanel extends JPanel implements ActionListener
{
	private Controller app;
	private SpringLayout layout;
	
	private JPanel homePanel;
	
	private JScrollPane dataPane;
	
	private JTextArea displayArea;
	
	private boolean playerTurn;
	
	private ArrayList<JButton> buttonList = new ArrayList<>();
	private JButton buttonOne;
	private JButton buttonTwo;
	private JButton buttonThree;
	private JButton buttonFour;
	private JButton buttonFive;
	private JButton buttonSix;
	private JButton buttonSeven;
	private JButton buttonEight;
	private JButton buttonNine;
	
	private boolean boolOne = false;
	private boolean boolTwo = false;
	private boolean boolThree = false;
	private boolean boolFour = false;
	private boolean boolFive = false;
	private boolean boolSix = false;
	private boolean boolSeven = false;
	private boolean boolEight = false;
	private boolean boolNine = false;
	
	
	
	public InfoPanel(Controller app)
	{
		super();
		this.app = app;
		this.layout = new SpringLayout();
		
		this.homePanel = new JPanel(new GridLayout(0,2));
		this.dataPane = new JScrollPane();
		
		this.displayArea = new JTextArea();
	
		this.buttonOne = new JButton();
		this.buttonTwo = new JButton();
		this.buttonThree = new JButton();
		this.buttonFour = new JButton();
		this.buttonFive = new JButton();
		this.buttonSix = new JButton();
		this.buttonSeven = new JButton();
		this.buttonEight = new JButton();
		this.buttonNine = new JButton();
		
		this.buttonList.add(buttonOne);
		this.buttonList.add(buttonTwo);
		this.buttonList.add(buttonThree);
		this.buttonList.add(buttonFour);
		this.buttonList.add(buttonFive);
		this.buttonList.add(buttonSix);
		this.buttonList.add(buttonSeven);
		this.buttonList.add(buttonEight);
		this.buttonList.add(buttonNine);
		
		this.playerTurn = (false);
		
		setupPanel();
		setupListeners();
		setupLayout();
		
	}
	
	/**
	 * The setup of the panel
	 * Details and looks
	 */
	private void setupPanel()
	{
		this.setLayout(new GridLayout(3,3));
		this.setBackground(new Color(255, 193, 229));
		
		this.add(buttonOne);
		buttonOne.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if(playerTurn)
				{
					buttonOne.setText("O");	
					playerTurn = (false);
				}
				else
				{
					buttonOne.setText("X");
					playerTurn = (true);
				}
			}
		});
	
		this.add(buttonTwo);
		buttonTwo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if(playerTurn)
				{
					buttonTwo.setText("O");	
					playerTurn = (false);
				}
				else
				{
					buttonTwo.setText("X");
					playerTurn = (true);
				}
			}
		});
	
		this.add(buttonThree);
		buttonThree.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if(playerTurn)
				{
					buttonThree.setText("O");	
					playerTurn = (false);
				}
				else
				{
					buttonThree.setText("X");
					playerTurn = (true);
				}
			}
		});
	
		this.add(buttonFour);
		buttonFour.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if(playerTurn)
				{
					buttonFour.setText("O");	
					playerTurn = (false);
				}
				else
				{
					buttonFour.setText("X");
					playerTurn = (true);
				}
			}
		});
		
		this.add(buttonFive);
		buttonFive.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if(playerTurn)
				{
					buttonFive.setText("O");
					playerTurn = (false);
				}
				else
				{
					buttonFive.setText("X");
					playerTurn = (true);
				}	
			}
		});
		
		this.add(buttonSix);
		buttonSix.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if(playerTurn)
				{
					buttonSix.setText("O");	
					playerTurn = (false);
				}
				else
				{
					buttonSix.setText("X");
					playerTurn = (true);
				}
			}
		});
		
		this.add(buttonSeven);
		buttonSeven.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if(playerTurn)
				{
					buttonSeven.setText("O");	
					playerTurn = (false);
				}
				else
				{
					buttonSeven.setText("X");
					playerTurn = (true);
				}	
			}
		});
		
		this.add(buttonEight);
		buttonEight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if(playerTurn)
				{
					buttonEight.setText("O");	
					playerTurn = (false);
				}
				else
				{
					buttonEight.setText("X");
					playerTurn = (true);
				}	
			}
		});
		
		this.add(buttonNine);
		buttonNine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if(playerTurn)
				{
					buttonNine.setText("O");
					playerTurn = (false);
				}
				else
				{
					buttonNine.setText("X");
					playerTurn = (true);
				}
			}
		});
	}
	
	/**
	 * All the actions that are needed for buttons to work
	 */
	private void setupListeners()
	{
		
	}
	
	/**
	 * The layout of the panel
	 * It can adjust the size and position of objects
	 */
	private void setupLayout()
	{
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
	}
}
