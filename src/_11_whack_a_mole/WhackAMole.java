package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	public static void main(String[] args) {
		WhackAMole wam = new WhackAMole();
	}

	int MoleCount = 0;
	int Missed = 1;

	Date now;
	
	JFrame frame = new JFrame("Whack-A-Mole");
	JPanel panel = new JPanel();

	WhackAMole() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setVisible(true);
		makeButton(20);
		frame.setSize(300, 200);
		now = new Date();
	}

	void makeButton(int a) {
		panel.removeAll();
		Random random = new Random();
		int r = random.nextInt(a);
		for (int i = 0; i < a; i++) {
			JButton button = new JButton("          ");
			button.addActionListener(this);
			if (r == i) {
				button.setText("mole!");
			}
			panel.add(button);
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String text = ((JButton) arg0.getSource()).getText();
		if (!text.equals("mole!")) {
			System.out.println("You missed " + Missed + " times");
			Missed++;
		} else {
			frame.remove(panel);
			makeButton(20);
			frame.add(panel);
			frame.pack();
			frame.setSize(300, 200);
			MoleCount++;
			System.out.println(MoleCount);
		}

		if (Missed == 6) {
			frame.dispose();
			JOptionPane.showMessageDialog(null, "Congratulations, you lost");
		}
		if (MoleCount == 10) {
			frame.dispose();
			endGame(now, MoleCount);
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}
}
