package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener {
	public static void main(String[] args) {
		TypingTutor n = new TypingTutor();
	}
	
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	
	char currentLetter;
	JFrame frame = new JFrame("Type or Die");
	JLabel label = new JLabel();
	
	TypingTutor(){
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		currentLetter = generateRandomLetter();
		frame.addKeyListener(this);
		
		label.setFont(label.getFont().deriveFont(100.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setOpaque(true);
		label.setText(currentLetter+"");
		
		frame.add(label);
		frame.pack();
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("you typed: " + arg0.getKeyChar());
		
		if(arg0.getKeyChar() == currentLetter){
			System.out.println("CORRECT");
			label.setBackground(Color.green);
		}
		else{
			System.out.println("INCORRECT");
			label.setBackground(Color.red);
		}
		
		currentLetter = generateRandomLetter();
		label.setText(currentLetter+"");
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
