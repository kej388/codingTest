package stage7;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

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
			
		}
	}
	
	class CenterPanel extends JPanel {
		public CenterPanel() {
			
		}
	}
	
	class SouthPanel extends JPanel {
		public SouthPanel() {
			
		}
	}
	
	
	public static void main(String[] args) {
		new CalculatorFrame();
	}
}
