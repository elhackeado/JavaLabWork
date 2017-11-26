// WRITE JAVA A PROGRAM FOR APPLET TO CONFIGURE APPLETS BY PASSING PARAMETERS

/* <applet code="exp18.class" height="400" width="400" >
</applet> */

import java.applet.Applet;
import java.awt.Graphics;

public class exp18 extends Applet
{
	public void paint(Graphics g)
	{
		String str = getParameter("Msg");
		g.drawString(str,50,50);
	}
}