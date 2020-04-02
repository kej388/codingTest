package stage5;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LeftKeyChangeString extends JFrame{
	
	StringBuffer sb = new StringBuffer("Love Java");
	JLabel label = new JLabel(sb.toString());
	
	public LeftKeyChangeString() {
		this.setTitle("Left 키로 문자열 교체");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		
		c.addKeyListener(new LeftKeyListener());
		c.add(label);
		
		
		this.setSize(300, 200);
		this.setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class LeftKeyListener implements KeyListener {

		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == KeyEvent.VK_LEFT) {
				sb.reverse();
				label.setText(sb.toString());
			}
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static void main(String[] args) {
		new LeftKeyChangeString();
	}
}
