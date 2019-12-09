package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Trick");
	JButton button2 = new JButton("Treat");
	
	NastySurprise(){
		button.addActionListener(this);
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	frame.setVisible(true);
	frame.add(panel);
	panel.add(button);
	panel.add(button2);
	frame.pack();
	}
	
	

public static void main(String[] args) {
	NastySurprise ns = new NastySurprise();
}



@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	if(arg0.getSource()==button){
		showPictureFromTheInternet();
	}
	if(arg0.getSource()==button2){
		
	}
}
}
