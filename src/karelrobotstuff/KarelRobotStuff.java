/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karelrobotstuff;
import becker.robots.*;
import java.awt.Color; // we won't say 
/**
 *
 * @author michael.roy-diclemen
 */
public class KarelRobotStuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 City waterloo = new City();
      Wall w1 = new Wall(waterloo, 3, 1, Direction.WEST);
      Wall w2 = new Wall(waterloo, 3, 1, Direction.SOUTH);
      Wall w3 = new Wall(waterloo, 4, 2, Direction.EAST);
      Thing t1 = new Thing(waterloo, 2, 3);
      Thing t2 = new Thing(waterloo, 6, 1);
      Robot bob = new Robot(waterloo, 2, 4, Direction.EAST, 0);
      bob.setColor(Color.blue);
      bob.setLabel("Bob");
      bob.move();
      bob.turnLeft();
      bob.move();
      bob.move();
      bob.move();
      bob.turnLeft();
      bob.turnLeft();
      bob.move();      
    }
    
}
