import java.applet.Applet;
import java.awt.Graphics;
	public class HelloApplet extends Applet{
		public void paint(Graphics g){
		g.drawString("Hello Java", 50, 50);
		String msg = getParameter("massage");  
		g.drawString(msg,80, 80);  
	}
}

