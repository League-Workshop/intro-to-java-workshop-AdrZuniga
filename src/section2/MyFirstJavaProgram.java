package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot james = new Robot();
		james.penDown();
		james.setPenColor(Color.RED);
		james.setSpeed(150);
		
		for (int i = 0; i < 4; i++) {
			james.move(100);
			james.turn(90);
		}
		
	}
}
