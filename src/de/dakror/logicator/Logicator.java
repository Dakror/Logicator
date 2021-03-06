package de.dakror.logicator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.DefaultButtonModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;

import de.dakror.logicator.gate.Button;
import de.dakror.logicator.gate.Gate;
import de.dakror.logicator.gate.Lever;

/**
 * @author Dakror
 */
public class Logicator extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	public static final int gridSize = 16;
	
	JPanel content;
	JPanel tools;
	
	public Logicator()
	{
		super("Logicator");
		setSize(800, 480);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initComponents();
		
		setVisible(true);
	}
	
	public void initComponents()
	{
		setLayout(new BorderLayout());
		
		content = new JPanel(null);
		content.setBackground(Color.white);
		JScrollPane wrapper = new JScrollPane(content, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		add(wrapper, BorderLayout.CENTER);
		
		addGate(1, 4, new Button());
		addGate(8, 4, new Lever());
		
		tools = new JPanel();
		tools.setLayout(new FlowLayout());
		tools.setPreferredSize(new Dimension(1, 60));
		
		addGateToToolbar(new Button());
		addGateToToolbar(new Lever());
		
		add(tools, BorderLayout.SOUTH);
	}
	
	public void addGateToToolbar(Gate g)
	{
		g.setPreferredSize(g.getSize());
		g.setEnabled(false);
		g.setModel(new DefaultButtonModel());
		
		tools.add(g);
	}
	
	public void addGate(int x, int y, Gate g)
	{
		g.setBounds(x * gridSize, y * gridSize, g.getWidth(), g.getHeight());
		content.add(g);
	}
	
	public static void main(String[] args)
	{
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		new Logicator();
	}
}
