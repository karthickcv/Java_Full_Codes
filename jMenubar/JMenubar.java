package jMenubar;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenubar extends JFrame implements ActionListener  {

	//Menubar instance declaration
	JMenuBar menuBar;
	
	//Menu's creation within a bar
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	
	//Menu items creation within Menu
	
     JMenuItem loadSubMenu;
     JMenuItem saveSubMenu;
     JMenuItem exitSubMenu;
     
     //Jthis this;
	
     //Constructor 
	  JMenubar(){
		
		  //Created Menubar instance
		 menuBar = new JMenuBar();
		 
		 //Menu's additions
		 fileMenu = new JMenu("File");
		 editMenu = new JMenu("Edit");
		 helpMenu = new JMenu("Help");
		 
		 //Creation of subMenus
		 loadSubMenu = new JMenuItem("Load");
		 saveSubMenu = new JMenuItem("Save");
		 exitSubMenu = new JMenuItem("Exit");
		 
		 fileMenu.add(loadSubMenu);
		 fileMenu.add(saveSubMenu);
		 fileMenu.add(exitSubMenu);
		 
		 //Adding Keyboard shortcut accessing using MNemonic
		 loadSubMenu.setMnemonic(KeyEvent.VK_L);
		 saveSubMenu.setMnemonic(KeyEvent.VK_S);
		 exitSubMenu.setMnemonic(KeyEvent.VK_E);
		 
		 fileMenu.setMnemonic(KeyEvent.VK_F);
		 editMenu.setMnemonic(KeyEvent.VK_E);
		 helpMenu.setMnemonic(KeyEvent.VK_H);
		 
		 
		 //Adding menu's inside of menuBar
		 menuBar.add(fileMenu);
		 menuBar.add(editMenu);
		 menuBar.add(helpMenu);
		 
		 //ActionListener for 3 Sub Menu's
		 loadSubMenu.addActionListener(this);
		 saveSubMenu.addActionListener(this);
		 exitSubMenu.addActionListener(this);
		 
		 
		 //frame properties
		 this.setJMenuBar(menuBar);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setSize(600,600);
		 this.setLayout(new FlowLayout());
		 this.setVisible(true);
		 
		 
		
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		if(e.getSource()==loadSubMenu)
		{
            JOptionPane.showMessageDialog(null, "Loaded Successfully","Info",JOptionPane.INFORMATION_MESSAGE);
            
			
		}
		
		else if (e.getSource()==saveSubMenu) {
			JOptionPane.showMessageDialog(null, "Saved Successfully","Info",JOptionPane.INFORMATION_MESSAGE);
		}
		
		else if(e.getSource()==exitSubMenu) {
			
			//this.dispose();
			JOptionPane.showMessageDialog(null, "Thank You","Info",JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
}
