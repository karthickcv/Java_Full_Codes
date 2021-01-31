package jOptionPane;
import javax.swing.JOptionPane;


public class JOptionpane {

	public static void main(String[] args) {
		
        //
		//JOptionPane.showMessageDialog(null,"Hello Buddy","Welcome Message",JOptionPane.INFORMATION_MESSAGE);
       // JOptionPane.showMessageDialog(null,"Hello Buddy you got Error","Boom!!!",JOptionPane.ERROR_MESSAGE);
        //JOptionPane.showMessageDialog(null,"Hello Buddy","Welcome Message",JOptionPane.PLAIN_MESSAGE);
       // JOptionPane.showMessageDialog(null,"Hello Buddy is that You ?","Verification",JOptionPane.QUESTION_MESSAGE);
       //while(true) { 
        //JOptionPane.showMessageDialog(null,"You Computer Got Virus","Alert!!!",JOptionPane.WARNING_MESSAGE));
      // }
		String[] opt = {"Really!!","I need to check","When I get this"};
	int ans = 	JOptionPane.showOptionDialog(null,
				                     "You Got Cash Price !!!",
				                     "Got Prize !!!",
				                     JOptionPane.YES_NO_CANCEL_OPTION,
				                     JOptionPane.INFORMATION_MESSAGE,
				                     null,
				                     opt,
				                     0);
		
		if(ans==0) {
			JOptionPane.showMessageDialog(null,"Yes Buddy !!!","INFO",JOptionPane.INFORMATION_MESSAGE);
			//System.out.println("Yes Buddy!!!\n");
		}
		
		if(ans==1) {
			JOptionPane.showMessageDialog(null,"Okay :-)","INFO",JOptionPane.INFORMATION_MESSAGE);
		 //	System.out.println("Okay :-)\n");
		}
		
		if(ans==2) {
			
			JOptionPane.showMessageDialog(null,"For More Details Call me @ 12345678","INFO",JOptionPane.INFORMATION_MESSAGE);
			
			//System.out.println("For More Details Call me @ 12345678");
		}
	}

}
