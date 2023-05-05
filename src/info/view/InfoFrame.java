package info.view;

import info.controller.Controller;

import javax.swing.JFrame;

/**
 * 
 * @author erin
 *
 */
public class InfoFrame extends JFrame
{
	private Controller app;
	private InfoPanel panel;
	
	public InfoFrame(Controller app)
	{
		super();
		this.app = app;
		this.panel = new InfoPanel(this.app);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(panel);
		this.setTitle(" ");
		this.setSize(800, 600);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
}
