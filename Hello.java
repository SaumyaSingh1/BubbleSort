 import java.applet.*;
 import java.awt.*;

/*
<applet code="Hello.class" CodeBase="" width=300 height=400></applet>
*/

public class Hello extends Applet
 {
      
    
        public void paint(Graphics g)
        {
        	g.drawString("HelloWorld", 25, 50);
        }
 }