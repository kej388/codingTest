package stage5;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ColorFrame extends JFrame{
	
	public ColorFrame() {
		this.setTitle("4X4 Color Frame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 4));
		
		JLabel zero = new JLabel("0");
		zero.setOpaque(true);
		zero.setBackground(Color.red);
		JLabel one = new JLabel("1");
		one.setOpaque(true);
		one.setBackground(Color.orange);
		JLabel two = new JLabel("2");
		two.setOpaque(true);
		two.setBackground(Color.yellow);
		JLabel three = new JLabel("3");
		three.setOpaque(true);
		three.setBackground(Color.green);
		JLabel four = new JLabel("4");
		four.setOpaque(true);
		four.setBackground(Color.cyan);
		JLabel five = new JLabel("5");
		five.setOpaque(true);
		five.setBackground(Color.blue);
		JLabel six = new JLabel("6");
		six.setOpaque(true);
		six.setBackground(Color.MAGENTA);
		JLabel seven = new JLabel("7");
		seven.setOpaque(true);
		seven.setBackground(Color.GRAY);
		JLabel eigth = new JLabel("8");
		eigth.setOpaque(true);
		eigth.setBackground(Color.PINK);
		JLabel nine = new JLabel("9");
		nine.setOpaque(true);
		nine.setBackground(Color.LIGHT_GRAY);
		JLabel ten = new JLabel("10");
		ten.setOpaque(true);
		ten.setBackground(Color.WHITE);
		
		c.add(zero);
		c.add(one);
		c.add(two);
		c.add(three);
		c.add(four);
		c.add(five);
		c.add(six);
		c.add(seven);
		c.add(eigth);
		c.add(nine);
		c.add(ten);
		
		
		
		this.setSize(400, 200);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ColorFrame();
	}
}
