import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Screen {
 
 public JFrame f;
 public JPanel p;
 public JButton b;
 public JLabel l;

 public Screen()
 {
  gui();
  
 }
 public void gui()
 {
  f = new JFrame("Lab3");
  f.setVisible(true);
  f.setSize(600,400);
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  p = new JPanel();
  p.setBackground(Color.white);
  
  b = new JButton("Test");
  l = new JLabel("This is test Label");
  
  p.add(b);
  p.add(l);
  
  f.add(p);
 }
 public static void main(String[] Args){
   new Screen();
   
 }
 
}