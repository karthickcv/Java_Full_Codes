package jSlider;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDemo implements ChangeListener {
	
	JFrame frame;
	JPanel panel;
	JSlider slider;
	JLabel label;
   
	SliderDemo(){
		
		
		panel = new JPanel();
		label = new JLabel();
		frame = new JFrame("Temperature Meter");
		slider = new JSlider(0,100,50);
		
		
		slider.setPreferredSize(new Dimension(400,200));
		
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25);
		slider.setPaintLabels(true);
		
		
		slider.setOrientation(SwingConstants.VERTICAL);
		label.setText("C = "+ slider.getValue());
		slider.addChangeListener(this);
		
		
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(500,500);
		frame.setVisible(true);
		
   }
	
	
	@Override
	public void stateChanged(ChangeEvent e) {
			
		 label.setText("C = "+ slider.getValue());
	}

}
