package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Robot[] robots = new Robot[5];
		boolean isRacing =true;
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			robots[i].setX(500);
			robots[i].setY(500);
		
			
		}
	
		//2. create an array of 5 robots.

		//3. use a for loop to initialize the robots.
		Random r = new Random();
			while(isRacing==true) {
				for (int i = 0; i < robots.length; i++) {
					if(robots[i].getY()<0) {
						isRacing = false;
					}
				Thread t1 = new Thread(()->	robots[0].move(r.nextInt(50)));
				Thread t2 = new Thread(()-> robots[1].move(r.nextInt(50)));
				Thread t3 = new Thread(() -> robots[2].move(r.nextInt(50)));
			t1.start();
			t2.start();
			t3.start();
				}
			
			}
			//4. make each robot start at the bottom of the screen, side by side, facing up
	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
    	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	
}}
