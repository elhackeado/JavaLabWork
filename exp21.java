// WRITE A JAVA PROGRAM TO USE GRAPHICS CLASS TO DRAW SHAPES

/* <applet code="exp21.class" height="400" width="400" >
</applet> */

import java.applet.*;
import java.awt.*;

public class exp21 extends Applet
{
	int x = 300, y = 100, r = 50;
	public void paint(Graphics g)
	{
		g.drawLine(30,30,200,10);
		g.drawOval(x-r,y-r,100,100);
		g.drawRect(400,50,200,100);
		g.fillOval(x-r,y-r,100,100);
		g.fillRect(400,50,200,100);
	}
}