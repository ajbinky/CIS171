package chapter4;

import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Lab14 {
	public static void draw(Graphics g) {
		
		final int pixels = 64;
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 4; j++) {
				g.drawOval(i*pixels, j*pixels, pixels, pixels);
			}
		}
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		final int FRAME_WIDTH = 400;
		final int FRAME_HEIGHT = 400;

		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		@SuppressWarnings("serial")
		JComponent component = new JComponent() {
			public void paintComponent(Graphics graph) {
				draw(graph);
			}
		};

		frame.add(component);
		frame.setVisible(true);
	}
}
