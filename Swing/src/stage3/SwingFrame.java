package stage3;

import javax.swing.JFrame;

public class SwingFrame extends JFrame{
	
	public SwingFrame() {
		this.setTitle("Let's study Java");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(400, 200);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingFrame();
	}
}
