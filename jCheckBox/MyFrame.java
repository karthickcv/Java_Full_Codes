package jCheckBox;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;


public class MyFrame extends JFrame implements ActionListener{
	 JButton button;
	 //ImageIcon xicon;
	 //ImageIcon checkicon;
	 JCheckBox checkBox;
	 
	
	 MyFrame(){
		 
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setLayout(new FlowLayout());
		 
		// xicon = new ImageIcon("/home/hutson/Java/Java_Programs/src/jTextField/remove.png");
		 //checkicon = new ImageIcon("/home/hutson/Java/Java_Programs/src/jTextField/check.png");
		 
		 button = new JButton("Submit");
		 button.addActionListener(this);
		 
		 checkBox = new JCheckBox();
		 checkBox.setText("Im not a Robot");
		 checkBox.setFocusable(false);
		 //checkBox.setIcon(xicon);
		// checkBox.setSelectedIcon(checkicon);
		 checkBox.setFont(new Font("Consolas",Font.PLAIN,30));
		 
		 
		 this.add(button);
		 this.add(checkBox);
		 this.pack();
		 this.setVisible(true);
		 
      }
	 
	 @Override
	 public void actionPerformed(ActionEvent e) {
		 
		 if(e.getSource()==button)
		 {
			 System.out.println(checkBox.isSelected());
			 this.dispose();
			 if(checkBox.isSelected()==true) {
			 JOptionPane.showMessageDialog(null, "Verified","Verification",JOptionPane.INFORMATION_MESSAGE);
			 }
			 
			 if(checkBox.isSelected()==false) {
				 JOptionPane.showMessageDialog(null, "Verification failed","Need !!!",JOptionPane.ERROR_MESSAGE);
				 }
				 
		 }
	}
	    
}
