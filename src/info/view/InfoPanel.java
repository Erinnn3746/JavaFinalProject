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
				// TODO Auto-generated method stub	
			}
		});
		this.add(buttonTwo);
		buttonTwo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub	
			}
		});
		this.add(buttonThree);
		buttonThree.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub	
			}
		});
		this.add(buttonFour);
		buttonFour.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub	
			}
		});
		this.add(buttonFive);
		buttonFive.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub	
			}
		});
		this.add(buttonSix);
		buttonSix.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub	
			}
		});this.add(buttonSeven);
		buttonSeven.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub	
			}
		});this.add(buttonEight);
		buttonEight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub	
			}
		});this.add(buttonNine);
		buttonNine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub	
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
