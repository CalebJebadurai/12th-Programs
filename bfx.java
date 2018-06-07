import java.io.*;
import javax.imageio.*;


try {
image=ImageIO.read(new File("c:/image.jpg"));
} catch(Exception e) {
}


public void paint(Graphics g) {
g.drawImage(image,0,0,null);
}