package stage4;

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerEx extends JFrame{
	
	public MouseListenerEx() {
		this.setTitle("마우스 올리기 내리기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("시작");
		c.add(label);
		label.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				JLabel g = (JLabel)e.getSource();
				g.setText("사랑해");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				JLabel g = (JLabel)e.getSource();
				g.setText("Love Java");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		this.setSize(200, 100);
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new MouseListenerEx();
	}
}
