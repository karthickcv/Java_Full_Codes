package JFrame;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class layout_manager {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(3,3,5,5));
        
        frame.add(new JButton("One"));
        frame.add(new JButton("Two"));
        frame.add(new JButton("Three"));
        frame.add(new JButton("Four"));
        frame.add(new JButton("Five"));
        frame.add(new JButton("Six"));
        frame.add(new JButton("Seven"));
        frame.add(new JButton("Eight"));
        frame.add(new JButton("Nine"));

        
        
	}

}
