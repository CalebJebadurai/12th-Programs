import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.*;

public class Ex6 extends JApplet implements ActionListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new Ex6();
        frame.getContentPane().add(applet);
        applet.init();
        applet.start();
        frame.setSize(600,400);
        frame.show();
    }
    
    JTextField text = new JTextField("Artan Potera");
    JTextArea ta = new JTextArea(20, 80);
    
    public void init() {
        ta.setFont(new Font("Monospaced", Font.PLAIN, 10));
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.add(text, BorderLayout.CENTER);
        JButton b = new JButton("Print");
        b.addActionListener(this);
        p.add(b, BorderLayout.EAST);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(p, BorderLayout.NORTH);
        this.getContentPane().add(ta, BorderLayout.CENTER);
    }
    
    public void actionPerformed(ActionEvent e) {
        String s = text.getText();
        if (s != null) {
            BufferedImage bi = new BufferedImage(80,20,BufferedImage.TYPE_INT_BGR);
            Graphics2D g2 = (Graphics2D)bi.getGraphics();
            g2.setFont(new Font("Serif", Font.BOLD, 20));
            g2.drawString(s, 0, 16);
            Raster ras = bi.getData();
            ta.setText("");
            for (int row = 0; row < 20; row++) {
                String line = "";
                for (int col = 0; col < 80; col++) {
                    if (ras.getSample(col,row,1) > 128) {
                        line += "*";
                    } else {
                        line += " ";
                    }
                }
                System.out.println(line);
                ta.append(line+"\n");
            }
        }
    }
}