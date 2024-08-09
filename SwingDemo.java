
import java.awt.*;
//import java.awt.events.*;
import javax.swing.*;


public class SwingDemo {
         SwingDemo(){
         JFrame frame = new JFrame("Swing Demo");
         frame.setVisible(true);
         frame.setSize(400,400);
         frame.setDefaultCloseOperation(0);
         JLabel label =new JLabel("hello world!");
         frame.add(label,JLabel.CENTER);
         
}
	public static void main(String args[]) {
	SwingDemo app=new SwingDemo();
			
	}

}
