package info.view;

import info.controller.Controller;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class InfoStartPanel extends JPanel
{
	public InfoStartPanel (Controller app)
	{
		this.setLayout(new SpringLayout());
		this.setBackground(new Color(255, 193, 229));
		this.add(new InfoPanel(app));
	}
}
