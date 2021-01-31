package jTextField;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class MyFrame extends JFrame implements ActionListener {
                
	JButton button;
	JTextField textField;
	
	MyFrame(){
		
		   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   this.setLayout(new FlowLayout());
		   
		   button = new JButton();
		   button.setText("Submit");
		   button.setPreferredSize(new Dimension(100,30));
		   button.setBorder(BorderFactory.createEtchedBorder());
		   button.addActionListener(this);
		   
		   textField = new JTextField();
		   textField.setForeground(Color.white);
		   textField.setText("Username");
		   textField.setBackground(Color.black);
		   textField.setPreferredSize(new Dimension(150,40));
		   textField.setCaretColor(Color.green);
		   
		   this.add(button);
		   this.add(textField);
		   this.pack();
		   this.setVisible(true);
		
	}
		   @Override
		   public void actionPerformed(ActionEvent e) {
			   
			   if(e.getSource()==button) {
				   System.out.println("welcome "+textField.getText());
				   button.setEnabled(false);
				   textField.setEditable(false);
			   }
			   
		   
	}
	
}
