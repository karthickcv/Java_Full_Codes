package jColorChooser;
 import java.awt.*;
 import javax.swing.*;
 import java.awt.event.*;

public class Color_Chooser extends JFrame implements ActionListener {

	JButton button;
	 JLabel label;
	 
	 Color_Chooser(){
		 
		 
		 
		    button = new JButton("Pick Color");
		    button.addActionListener(this);
		    button.setBorder(BorderFactory.createEtchedBorder());
		    button.setBounds(0,20,170,60);
		    
		    label = new JLabel("This is some text");
		    label.setForeground(Color.black);
		    label.setFont(new Font("MV Boli",Font.PLAIN,45));
		    //label.setLayout(new FlowLayout());
		    
		    
		    
		    this.add(button);
		    this.add(label);
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    this.setLayout(null);
		   
		   // this.setSize(420,420);
		    
		    this.setLayout(new FlowLayout());
		    this.pack();
		    this.setVisible(true);
		  
		 
	 }
	
	
	
	
	
	
	public static void main(String[] args) {
	
		Color_Chooser color = new Color_Chooser();
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button) {
			
		
		JColorChooser chooser = new JColorChooser();
		
		 Color color = chooser.showDialog(null,"Select Color",Color.black);
		
		  label.setForeground(color);
		}
		
	}

}
