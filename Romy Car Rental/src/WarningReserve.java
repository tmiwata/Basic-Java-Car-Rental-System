import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WarningReserve extends JFrame{

	private JPanel warningP;
	private JLabel textL, iconL;
	
	private Transaction aTrans = new Transaction(); //access my class Transaction as global declaration
	
	public WarningReserve(){
		
		Container pane = getContentPane();
		warningP = new JPanel(null);
		warningP.setBackground(Color.WHITE);
		
		ImageIcon warningImage = new ImageIcon("../images/warning_icon.GIF");
		iconL = new JLabel(warningImage);
		iconL.setBounds(20, 35, 50, 50);
		warningP.add(iconL);
		
		textL = new JLabel("");
		textL.setText("oops invalid");
		textL.setFont(new Font("Serif", Font.BOLD, 15));
		textL.setForeground(Color.RED);
		textL.setBounds(80, 48, 100, 20);
		warningP.add(textL);
		pane.add(warningP);
	}
}