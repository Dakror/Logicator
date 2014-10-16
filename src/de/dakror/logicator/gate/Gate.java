package de.dakror.logicator.gate;

import java.awt.Color;
import java.awt.Component;
import java.security.InvalidParameterException;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import de.dakror.logicator.Logicator;
import de.dakror.logicator.wiring.Connection;

/**
 * @author Dakror
 */
public abstract class Gate extends JButton
{
	private static final long serialVersionUID = 1L;
	
	public Gate()
	{
		setFocusPainted(false);
		setLayout(null);
		setBackground(Color.white);
		setOpaque(true);
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
	
	protected void addConnection(int x, int y, boolean input, String name)
	{
		for (Component c : getComponents())
			if (c.getName().equals(name)) throw new InvalidParameterException("Connection already exists with name: " + name);
		
		Connection c = new Connection(name, input);
		c.setBounds(x * Logicator.gridSize, y * Logicator.gridSize, Logicator.gridSize, Logicator.gridSize);
		add(c);
	}
}
