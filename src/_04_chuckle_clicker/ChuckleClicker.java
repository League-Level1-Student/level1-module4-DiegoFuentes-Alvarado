package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	public static void main(String[] args) {
		ChuckleClicker c = new ChuckleClicker();	
	}
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Joke");
	JButton button2 = new JButton("Punchline");
	
	ChuckleClicker(){
		
		
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button.addActionListener(this);
		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == button){
			JOptionPane.showMessageDialog(null, "What do you call a sleeping bull?");
		}
		if(arg0.getSource() == button2){
			JOptionPane.showMessageDialog(null, "A bulldozer!");
		}
	}

}
