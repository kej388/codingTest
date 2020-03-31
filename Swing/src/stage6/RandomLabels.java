package stage6;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class RandomLabels extends JFrame{
	
	public RandomLabels() {
		this.setTitle("Random Labels");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		for(int i = 0; i < 10; i++) {
			int x = (int)(Math.random() * 200) + 50;
			int y = (int)(Math.random() * 200) + 50;
			JLabel label = new JLabel();
			label.setLocation(x, y);
			label.setSize(10, 10);
			label.setOpaque(true);
			label.setBackground(Color.blue);
			c.add(label);
		}
		
		
		
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new RandomLabels();
	}
}
