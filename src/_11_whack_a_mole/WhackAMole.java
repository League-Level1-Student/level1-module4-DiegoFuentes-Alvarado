package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	public static void main(String[] args) {
		WhackAMole wam = new WhackAMole();
	}

	JFrame frame = new JFrame("Whack-A-Mole");
	JPanel panel = new JPanel();

	WhackAMole() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setVisible(true);
		makeButton(20);
		frame.setSize(300, 200);
		
		
	}

	void makeButton(int a) {
		Random random = new Random();
		//int n = 0;
		int r = random.nextInt(a);
		for (int i = 0; i < a; i++) {
			JButton button = new JButton("          ");
			button.addActionListener(this);
			if(r == i){
				button.setText("mole!");
			}
			//int r = random.nextInt(a+1);
			//if(r%a == 0 && n == 0){
			//	button.setText("mole!");
			//	n++;
			//}
			
			panel.add(button);
			
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
