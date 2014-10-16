package de.dakror.logicator.gate;

import java.awt.Dimension;
import java.awt.Font;

import de.dakror.logicator.Logicator;

public class Button extends Gate
{
	private static final long serialVersionUID = 1L;
	
	public Button()
	{
		setText("B");
		setFont(new Font("Arial", Font.BOLD, 25));
		
		setBorder(null);
		setSize(Logicator.gridSize * 3, Logicator.gridSize * 3);
		setPreferredSize(new Dimension(Logicator.gridSize * 3, Logicator.gridSize * 3));
		addConnection(2, 1, false, "S");
	}
}
