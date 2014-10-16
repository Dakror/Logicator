package de.dakror.logicator;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Logicator extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	JPanel content;
	JPanel tools;
	
	public Logicator()
	{
		super("Logicator");
		setSize(720, 420);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	
	public void initComponents()
	{	
		
	}
	
	public static void main(String[] args)
	{
		new Logicator();
	}
}
