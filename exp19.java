//WRITE A JAVA PROGRAM TO DEMONSTRATE KEYBOARD EVENT

import java.awt.*;
import java.awt.event.*;

public class exp19 extends Frame implements KeyListener
{
	Label l;
	TextArea area;
	
	exp19()
	{
		l = new Label();
		l.setBounds(20,50,100,20);
		area = new TextArea();
		area.addKeyListener(this);
		add(l);
		add(area);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	public void keyPressed(KeyEvent e)
	{
		l.setText("KEY PRESSED");
	}
	public void keyReleased(KeyEvent e)
	{
		l.setText("KEY RELEASED");
	}
	public void keyTyped(KeyEvent e)
	{
		l.setText("KEY TYPED");
	}
	
	public static void main(String args[])
	{
		new exp19();
	}
}