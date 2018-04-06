import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		//1. Create a robot
		Robot r2d2 = new Robot();
		//2. Set the speed to 100
		r2d2.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "", "What is your favorite color?", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Green", "Blue"}, 0);
		
		//3. Set the pen color of the robot according to the value of the colorChoise variable
		if(colorChoice == 0) {
			r2d2.setPenColor(255, 0, 0);
		}
		if(colorChoice == 1) {
			r2d2.setPenColor(0, 255, 0);
		}
		if(colorChoice == 2) {
			r2d2.setPenColor(0, 0, 255);
		}
		//4. Ask the use how many polygons they want to be drawn.
		int p = JOptionPane.showOptionDialog(null, "", "How many polygons do you want to be drawn?", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"1","2", "3"}, 0);
		//5. Use the robot to draw the number of polygons the user requested.
		if(p == 0) {
			r2d2.penDown();
			r2d2.setSpeed(25);
			r2d2.move(100);
			r2d2.turn(90);
			r2d2.move(100);
			r2d2.turn(90);
			r2d2.move(100);
			r2d2.turn(90);
			r2d2.move(100);
			r2d2.turn(90);
		}
		if(p == 1) {
			r2d2.penDown();
			r2d2.setSpeed(25);
			r2d2.move(100);
			r2d2.turn(90);
			r2d2.move(100);
			r2d2.turn(90);
			r2d2.move(100);
			r2d2.turn(90);
			r2d2.move(100);
			r2d2.turn(90);
			r2d2.move(200);
			r2d2.turn(90);
			r2d2.move(100);
			r2d2.turn(90);
			r2d2.move(100);
			r2d2.turn(90);
			r2d2.move(100);
			r2d2.turn(90);
			
		}
		if(p == 2) {
			r2d2.penDown();
			r2d2.setSpeed(25);
			r2d2.move(100);
			r2d2.turn(90);
			r2d2.move(100);
			r2d2.turn(90);
			r2d2.move(100);
			r2d2.turn(90);
			r2d2.move(100);
			r2d2.turn(90);
			r2d2.move(200);
			r2d2.turn(90);
			r2d2.move(100);
			r2d2.turn(90);
			r2d2.move(100);
			r2d2.turn(90);
			r2d2.move(300);
			r2d2.turn(90);
			r2d2.move(100);
			r2d2.turn(90);
			r2d2.move(100);
			r2d2.turn(90);
			r2d2.move(100);
			r2d2.turn(90);
			r2d2.move(100);
			r2d2.turn(90);
		}
		
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

