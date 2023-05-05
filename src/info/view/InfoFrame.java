package info.view;

import info.controller.Controller;

import javax.swing.JFrame;

/**
 * InfoFrame to carry the general look of the program
 * @author erin
 *
 */
public class InfoFrame extends JFrame
{
	private Controller app;
	private InfoPanel panel;
	
	/**
	 * Constructor
	 * @param app
	 */
	public InfoFrame(Controller app)
	{
		super();
		this.app = app;
		this.panel = new InfoPanel(this.app);
		
		setupFrame();
	}
	
	/**
	 * This is the setupFrame method
	 */
	private void setupFrame()
	{
		this.setContentPane(panel);
		this.setTitle("Tic Tac Toe");
		this.setSize(800, 600);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
}
