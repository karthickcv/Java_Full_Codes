package jMouseEvent;

import javax.swing.JFrame;
import java.awt.event.MouseListener;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.MouseEvent;

public class Mouse_event extends JFrame implements MouseListener {

	 
	
	JLabel label;
	  
	  Mouse_event(){
		  
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  
		  
		  label = new JLabel();
		  label.setBounds(40,40,430,400);
		  label.setBackground(Color.red);
		  label.setOpaque(true);
		  label.addMouseListener(this);
		  
		  this.add(label);
		  //this.pack();
		  this.setSize(500,500);
		  this.setLayout(null);
		  this.setLocationRelativeTo(null);
		  this.setVisible(true);
		  
	  }
	
	
	
	
	public static void main(String[] args) {
		
    Mouse_event event = new Mouse_event();
    

	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		
		label.setBackground(Color.green);
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		label.setBackground(Color.blue);
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
	label.setBackground(Color.blue);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		label.setBackground(Color.red);
	}




	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}




	
}
