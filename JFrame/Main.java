package JFrame;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Main {

	public static void main(String[] args) {
		
     JFrame frame = new JFrame();
     
     frame.setVisible(true);
     frame.setSize(500,500);
    // frame.setResizable(false);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     ImageIcon image = new ImageIcon("logo.jpg");
     frame.setIconImage(image.getImage());
     frame.getContentPane().setBackground(new Color(124,50,245));
     
     
     

	}

}
