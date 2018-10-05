package chapter6;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 * 
 * @author Andrew Behncke
 *
 */
public class Exercise37 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		final int FRAME_WIDTH = 400;
		final int FRAME_HEIGHT = 400;
		
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new JComponent() {
			public void paintComponent(Graphics graph) {
				draw(graph);
			}
		});
		frame.setVisible(true);
	}
	
	public static void draw(Graphics g) {
		final int size = 50;
		g.setColor(Color.BLACK);
		
		int x = 0;
		int y = 0;
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; i < 8; i++) {
				g.fillRect(x, y, size, size);
				x = x + 2 * size;
			}
		}
	}

}
