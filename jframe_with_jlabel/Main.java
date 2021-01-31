package jframe_with_jlabel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;



public class Main {

	public static void main(String[] args) {
		
		ImageIcon icon = new ImageIcon("logo.png");
		Border border = BorderFactory.createLineBorder(Color.white,4);
		
		JLabel label = new JLabel();
		label.setText("Welcome to Java");
		label.setIcon(icon);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(Color.white);
		label.setFont(new Font("Times New Roman",Font.ITALIC,50));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.TOP);
		label.setBackground(Color.black);
        label.setOpaque(true);		
        label.setBorder(border);
		
		
		
		
		JFrame frame = new JFrame();
		frame.setSize(1000,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(label);
		//frame.pack();
		

	}

}
