package jProgressBar;

import java.awt.*;
import javax.swing.*;

public class JProgress {

	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar();
	
   JProgress() {
		
	    bar.setValue(0);
	    bar.setBounds(40,300,500,30);
	    bar.setForeground(Color.green);
	    bar.setStringPainted(true);
	    bar.setFont(new Font("Times New Roman",Font.BOLD,20));
	    
	    frame.add(bar);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //frame.pack();
	    frame.setSize(600,600);
	    frame.setLayout(null);
	    frame.setVisible(true);
	    
	    fill();
	}
	
   
    public void fill() {
    	
    	int count = 0;
    	
    	while(count<=100)
    	{
    		bar.setValue(count);
    		
    		try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    		count++;
    	}
    	bar.setString("Done");
    }
}
