import java.applet.Applet;
import java.awt.*;
	public class HelloApplet extends Applet{
      

		public void paint(Graphics g){
        // Color c =Color.RED;
        //Color c=new Color(255,0,0);
       // g.setColor(c);


        g.setColor(Color.red);  

        
		g.drawString("Hello Java", 200, 200);

		//String msg = getParameter("massage");  
		//g.drawString(msg,80, 80);
          
	}
}

