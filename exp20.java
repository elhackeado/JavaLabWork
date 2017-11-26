// WRITE A JAVA PROGRAM TO DEMONSTRATE MOUSE EVENTS 

import java.awt.*;
import java.awt.event.*;

public class exp20 extends Frame implements MouseListener
{
	Label l;
	
	exp20()
	{
		addMouseListener(this);
		l = new Label();
		l.setBounds(20,50,100,20);
		add(l);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	public void mouseClicked(MouseEvent e)
	{
		l.setText("MOUSE CLICKED");
	}
	public void mouseEntered(MouseEvent e)
	{
		l.setText("MOUSE ENTERED");
	}
	public void mouseExited(MouseEvent e)
	{
		l.setText("MOUSE EXITED");
	}
	public void mousePressed(MouseEvent e)
	{
		l.setText("MOUSE PRESSED");
	}
	public void mouseReleased(MouseEvent e)
	{
		l.setText("MOUSE RELEASED");
	}
	
	public static void main(String args[])
	{
		new exp20();
	}
} 