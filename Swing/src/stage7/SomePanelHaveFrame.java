package stage7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SomePanelHaveFrame extends JFrame{
	
	public SomePanelHaveFrame() {
		this.setTitle("여러 개의 패널을 가진 프레임");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.add(new NorthPanel(), BorderLayout.NORTH);
		c.add(new CenterPanel(), BorderLayout.CENTER);
		c.add(new SouthPanel(), BorderLayout.SOUTH);
		
		this.setSize(400, 400);
		this.setVisible(true);
	}
	
	class NorthPanel extends JPanel{
	
		public NorthPanel() {
			setBackground(Color.GRAY);
			add(new JButton("열기"));
			add(new JButton("닫기"));
			add(new JButton("나가기"));
		}
	}
	
	class CenterPanel extends JPanel {
		public CenterPanel() {
			setLayout(null);
			setBackground(Color.WHITE);
			
			for(int i = 0; i < 10; i++) {
				int x = (int)(Math.random() * 250);
				int y = (int)(Math.random() * 250);
				JLabel label = new JLabel("*");
				label.setSize(10, 10);
				label.setLocation(x, y);
				add(label);
			}
			
		}
	}
	
	class SouthPanel extends JPanel {
		public SouthPanel() {
			setBackground(Color.YELLOW);
			add(new JButton("Word Input"));
			add(new JTextField(10));
		}
	}
	
	public static void main(String[] args) {
		new SomePanelHaveFrame();
	}
}
