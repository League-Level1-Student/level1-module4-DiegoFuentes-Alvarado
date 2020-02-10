package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin implements ActionListener {
	public static void main(String[] args) {
		PigLatin pig = new PigLatin();
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text = new JTextField(10);
	JTextField text2 = new JTextField(10);
	JButton button = new JButton("translate");

	PigLatin() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(text);
		panel.add(button);
		panel.add(text2);
		frame.setVisible(true);
		frame.pack();
		button.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		PigLatinTranslator plt = new PigLatinTranslator();
		text2.setText(plt.translate(text.getText()));
	}

}
