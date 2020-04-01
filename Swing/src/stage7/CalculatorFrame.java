package stage7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorFrame extends JFrame{
	
	public CalculatorFrame() {
		this.setTitle("계산기 프레임");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.add(new NorthPanel(), BorderLayout.NORTH);
		c.add(new CenterPanel(), BorderLayout.CENTER);
		c.add(new SouthPanel(), BorderLayout.SOUTH);
		
		this.setSize(300, 200);
		this.setVisible(true);
	}
	
	class NorthPanel extends JPanel {
		public NorthPanel() {
			setBackground(Color.GRAY);
			JLabel text = new JLabel("수식입력");
			JTextField input = new JTextField(10);
			add(text);
			add(input);
		}
	}
	
	class CenterPanel extends JPanel {
		public CenterPanel() {
			setLayout(new GridLayout(4, 4));
			add(new JButton("0"));
			add(new JButton("1"));
			add(new JButton("2"));
			add(new JButton("3"));
			add(new JButton("4"));
			add(new JButton("5"));
			add(new JButton("6"));
			add(new JButton("7"));
			add(new JButton("8"));
			add(new JButton("9"));
			add(new JButton("CE"));
			add(new JButton("계산"));
			add(new JButton("+")).setBackground(Color.CYAN);
			add(new JButton("-")).setBackground(Color.CYAN);
			add(new JButton("*")).setBackground(Color.CYAN);
			add(new JButton("/")).setBackground(Color.CYAN);
		}
	}
	
	class SouthPanel extends JPanel {
		public SouthPanel() {
			setBackground(Color.YELLOW);
			add(new JLabel("계산 결과"));
			add(new JTextField(10));
		}
	}
	
	
	public static void main(String[] args) {
		new CalculatorFrame();
	}
}
