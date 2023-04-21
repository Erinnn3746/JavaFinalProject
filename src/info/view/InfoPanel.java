package info.view;

import info.controller.Controller;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;

public class InfoPanel extends JPanel
{
	private Controller app;
	private SpringLayout layout;
	
	private JPanel homePanel;
	
	private JScrollPane dataPane;
	
	private JTextArea displayArea;
	
	public InfoPanel(Controller app)
	{
		super();
		this.app = app;
		this.layout = new SpringLayout();
		
		this.homePanel = new JPanel(new GridLayout(0,2));
		this.dataPane = new JScrollPane();
		
		this.displayArea = new JTextArea();
		
		setupPanel();
		setupListeners();
		setupLayout();
	}
	
	private void setupPanel()
	{
		this.setLayout(layout);
		this.setBackground(new Color(255, 193, 229));
	}
	
	private void setupListeners()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
}
