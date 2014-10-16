package de.dakror.logicator;

import java.awt.Color;
import java.awt.Component;
import java.security.InvalidParameterException;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

/**
 * @author Dakror
 */
public class Gate extends JLabel
{
	private static final long serialVersionUID = 1L;
	
	public Gate()
	{
		setLayout(null);
		setBackground(Color.white);
		setOpaque(true);
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
	
	public void addConnection(int x, int y, boolean input, String name)
	{
		for (Component c : getComponents())
			if (c.getName().equals(name)) throw new InvalidParameterException("Connection already exists with name: " + name);
		
		Connection c = new Connection(name, input);
		c.setBounds(x * Logicator.gridSize, y * Logicator.gridSize, Logicator.gridSize, Logicator.gridSize);
		add(c);
	}
}
