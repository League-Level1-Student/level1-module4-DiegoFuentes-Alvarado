package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Trick");
	JButton button2 = new JButton("Treat");
	
	NastySurprise(){
		button.addActionListener(this);
		button2.addActionListener(this);
	
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

private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}


@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	if(arg0.getSource()==button){
		showPictureFromTheInternet("https://cdn.royalcanin-weshare-online.io/pCJJPmYBaxEApS7LeAbn/v1/ed7h-how-to-buy-a-puppy-hero-dog");
	}
	if(arg0.getSource()==button2){
		showPictureFromTheInternet("https://www.tynker.com/projects/screenshot/5c82a87ff22e093b482857d1/scary-maze-game-1-1-1hi.png");
	}
}
}
