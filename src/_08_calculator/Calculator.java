package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
public static void main(String[] args) {
	Calculator c = new Calculator();
	
}
	JFrame frame = new JFrame("Calculator");
	JPanel panel = new JPanel();
	
	JButton buttonA = new JButton("Add");
	JButton buttonS = new JButton("Subtract");
	JButton buttonM = new JButton("Multiply");
	JButton buttonD = new JButton("Divide");
	
	JTextField text = new JTextField(10);
	JTextField text2 = new JTextField(10);
	JLabel label = new JLabel();
	
	Calculator(){
		frame.add(panel);
		frame.setVisible(true);
		panel.add(text);
		panel.add(text2);
		panel.add(buttonA);
		panel.add(buttonS);
		panel.add(buttonM);
		panel.add(buttonD);
		panel.add(label);
		frame.pack();
		
		buttonA.addActionListener(this);	
		buttonS.addActionListener(this);
		buttonM.addActionListener(this);
		buttonD.addActionListener(this);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String n = text.getText();
		String n2 = text2.getText();
		
		int number = Integer.parseInt(n);
		int number2 = Integer.parseInt(n2);
		
		if(arg0.getSource() == buttonA){
			int a = number + number2;
			label.setText(a+"");
			frame.pack();
		}
		if(arg0.getSource() == buttonS){
			int a = number - number2;
			label.setText(a+"");
			frame.pack();
		}
		if(arg0.getSource() == buttonM){
			int a = number * number2;
			label.setText(a+"");
			frame.pack();
		}
		if(arg0.getSource() == buttonD){
			int a = number / number2;
			label.setText(a+"");
			frame.pack();
		}

		
	}
}
