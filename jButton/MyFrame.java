package jButton;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;


public class MyFrame extends JFrame implements ActionListener{

	 JButton button;
	 JLabel label;
	 
	 
	 MyFrame() {
	   
		 button = new JButton();
		 button.setBounds(100, 100, 150, 100);
	     button.setText("Click Me");
	     button.addActionListener(this);
	     button.setFocusable(false);
	     button.setForeground(Color.DARK_GRAY);
	     button.setBackground(Color.white);
	     button.setFont(new Font("Comic Sans",Font.BOLD,20));
	     button.setHorizontalTextPosition(JButton.CENTER);
	     button.setVerticalTextPosition(JButton.BOTTOM);
	     button.setBorder(BorderFactory.createEtchedBorder());
	     
	     label = new JLabel();
	     label.setBounds(100, 250, 150, 150);
	     label.setVisible(false);
	     
	     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     this.setVisible(true);
	     this.setLayout(null);
	     this.setSize(250,250);
	     this.add(button);
	     this.add(label);	
	 }
	     
	     @Override 
	     public void actionPerformed(ActionEvent e) 
	     {
	    	 if(e.getSource()==button) {
	    		 System.out.println("You Clicked Me !!!");
	    		 //button.setEnabled(false);
	    		 label.setVisible(true);
	    	   }
	    	 
	      }
	     
	 
}
