
/**
 * Write a description of class HopBug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;

import java.util.Random;
import java.util.ArrayList;

import java.awt.Color;
public class JumpBug extends Bug
{
    public JumpBug() {
        super(new Color(250,102,27));
    }
    
    
    /**
     * 
     */
    public void act() {
        if(canMove()) {
            move();
            if(canMove()) {
                move();
            } else {
                turn();
            }
        } else {
            turn();
        }
    }
}
