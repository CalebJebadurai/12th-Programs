import javax.swing.*;
import java.awt.*;

public class Frame extends JPanel
{

public Frame()
{
JFrame frame=new JFrame();
frame.add(this);
frame.setSize(640, 480);
frame.setDefaultCloseOperation(
JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}

public void paint(Graphics g) {
Graphics2D g2=(Graphics2D)g;
g2.setColor(Color.WHITE);
g2.fillRect(0,0,getWidth(),getHeight());
g2.setColor(Color.BLACK);
g2.drawRect(100,100,200,200);
}
}