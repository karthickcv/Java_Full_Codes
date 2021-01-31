package jFilechooser;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

public class Chooser extends JFrame implements ActionListener{

	  JButton button;
	  
	  Chooser(){
		  
		  button = new JButton("select File");
		  button.addActionListener(this);
		  
		  this.add(button);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  this.setLayout(new FlowLayout());
		  this.pack();
		  this.setVisible(true);
		  
		  
	  }

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button)
		{
			JFileChooser filechooser = new JFileChooser();
			filechooser.setCurrentDirectory(new File("/home/hutson/Desktop"));
			
			//int response = filechooser.showOpenDialog(null);
			int response = filechooser.showSaveDialog(null);
			
			if(response == JFileChooser.APPROVE_OPTION)
			{
				File file = new File(filechooser.getSelectedFile().getAbsolutePath());
				
				System.out.println(file);
				
			}
		}
	}
             	  
	  
}
