package stage5;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class Dragging extends JFrame{
	
	public Dragging() {
		this.setTitle("드래깅동안 Yellow");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(Color.GREEN);
		c.addMouseMotionListener(new MyMouseListener());
		
		
		this.setSize(300, 200);
		this.setVisible(true);
	}
	
	class MyMouseListener implements MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			Container contentpane = (Container)e.getSource();
			contentpane.setBackground(Color.YELLOW);
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			Container contentpane = (Container)e.getSource();
			contentpane.setBackground(Color.GREEN);
		}
		
	}
	
	public static void main(String[] args) {
		new Dragging();
	}
}
