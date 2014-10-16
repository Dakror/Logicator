package de.dakror.logicator;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

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
		JScrollPane wrapper = new JScrollPane(content, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		add(wrapper, BorderLayout.CENTER);
		
		Gate g = new Gate();
		g.setBounds(gridSize, gridSize, gridSize * 3, gridSize * 3);
		g.addConnection(0, 0, true, "A");
		content.add(g);
		
		tools = new JPanel();
		tools.setLayout(new BoxLayout(tools, BoxLayout.X_AXIS));
		tools.setPreferredSize(new Dimension(1, 60));
		add(tools, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args)
	{
		new Logicator();
	}
}
