package de.dakror.logicator.gate;

import java.awt.Font;

import javax.swing.JToggleButton;

import de.dakror.logicator.Logicator;

public class Lever extends Gate
{
	private static final long serialVersionUID = 1L;
	
	public Lever()
	{
		setModel(new JToggleButton.ToggleButtonModel());
		setText("L");
		setFont(new Font("Arial", Font.BOLD, 25));
		
		setBorder(null);
		setSize(Logicator.gridSize * 3, Logicator.gridSize * 3);
		addConnection(2, 1, false, "S");
	}
}
