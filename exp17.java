// WRITE A JAVA PROGRAM FOR APPLET TO DISPLAY A MESSAGE IN THE APPLET

/* <applet code="exp17.class" height="400" width="400" >
</applet> */
import java.applet.Applet;
import java.awt.Graphics;

public class exp17 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Hello World",50,50);
	}
}