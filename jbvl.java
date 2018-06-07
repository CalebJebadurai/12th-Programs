
public Frame()
{
JFrame frame=new JFrame();
frame.add(new JLabel(new ImageIcon("c:/image.jpg")));
frame.pack();
frame.setDefaultCloseOperation(
JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}