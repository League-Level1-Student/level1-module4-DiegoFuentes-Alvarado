package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Slots implements ActionListener {
	public static void main(String[] args) {
		Slots s = new Slots();
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("SPIN");
	JLabel label;
	JLabel label2;
	JLabel label3;
	Random random = new Random();
	String one = "Seven.jpeg";
	String two = "Seven.jpeg";
	String three = "Seven.jpeg";

	Slots() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setVisible(true);

		try {
			label = createLabelImage(one);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			label2 = createLabelImage(two);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			label3 = createLabelImage(three);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		panel.add(label);
		panel.add(label2);
		panel.add(label3);
		panel.add(button);

		button.addActionListener(this);

		frame.pack();

	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		int a = random.nextInt(3);
		System.out.println(a);
		if (a == 0) {
			one = "Cherry.jpeg";
		}
		if (a == 1) {
			one = "Orange.jpeg";
		} else {
			one = "Seven.jpeg";
		}
		
		try {
			label = createLabelImage(one);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int b = random.nextInt(2);

		int c = random.nextInt(2);

	}

}
