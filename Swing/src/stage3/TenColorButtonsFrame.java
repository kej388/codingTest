package stage3;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TenColorButtonsFrame extends JFrame{
	
	public TenColorButtonsFrame() {
		this.setTitle("Ten Color Buttons Frame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 10));
		
		JButton zero = new JButton("0");
		JButton one = new JButton("1");
		c.add(zero);
		zero.setBackground(Color.RED);
		c.add(one);
		one.setBackground(Color.ORANGE);
		c.add(new JButton("2")).setBackground(Color.YELLOW);
		c.add(new JButton("3")).setBackground(Color.GREEN);
		c.add(new JButton("4")).setBackground(Color.CYAN);
		c.add(new JButton("5")).setBackground(Color.BLUE);
		c.add(new JButton("6")).setBackground(Color.MAGENTA);
		c.add(new JButton("7")).setBackground(Color.GRAY);
		c.add(new JButton("8")).setBackground(Color.PINK);
		c.add(new JButton("9")).setBackground(Color.lightGray);
		
		
		this.setSize(600, 200);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new TenColorButtonsFrame();
	}
}
