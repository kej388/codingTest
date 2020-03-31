package stage5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OpenChallenge extends JFrame{
	
	JPanel p = new JPanel();
	
	public OpenChallenge() {
		this.setTitle("Open Challenage9");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.add(new NorthPanel(), BorderLayout.NORTH);
		c.add(new CenterPanel(), BorderLayout.CENTER);
		
		this.setSize(500, 500);
		this.setVisible(true);
	}
	
	class NorthPanel extends JPanel {
		
		public NorthPanel() {
			setBackground(Color.LIGHT_GRAY);
			JButton open = new JButton("Open");
			JButton read = new JButton("Read");
			JButton close = new JButton("Close");
			setLayout(new FlowLayout());
			add(open);
			add(read);
			add(close);
		}
		
	}
	
	class CenterPanel extends JPanel {
		public CenterPanel() {
			setLayout(null);
			JLabel str1 = new JLabel("Hello");
			JLabel str2 = new JLabel("Java");
			JLabel str3 = new JLabel("Love");
			
			str1.setSize(50, 10);
			str1.setLocation(220, 45);
			
			str2.setSize(50, 10);
			str2.setLocation(150, 224);
			
			str3.setSize(50, 10);
			str3.setLocation(66, 90);
			
			add(str1);
			add(str2);
			add(str3);
		}
	}
	
	public static void main(String[] args) {
		new OpenChallenge();
	}
}
