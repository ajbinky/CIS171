package chapter2;

import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;

public class RobotTest {
	
	static Dimension screenSize;
	
	public static void main(String[] args) {
		
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		try {
			Robot bot = new Robot();
			for (int i = 0; i < screenSize.getHeight(); i+=3) {
				for (int j = 0; j < screenSize.getWidth(); j+=3) {
					bot.mouseMove(j, i);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
