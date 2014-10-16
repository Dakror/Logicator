package de.dakror.logicator;

import javax.swing.JLabel;

/**
 * @author Dakror
 */
public class Connection extends JLabel
{
	private static final long serialVersionUID = 1L;
	
	boolean input;
	
	public Connection(String name, boolean input)
	{
		super(name);
		setName(name);
		setHorizontalAlignment(CENTER);
		this.input = input;
	}
	
	public boolean isInput()
	{
		return input;
	}
}
