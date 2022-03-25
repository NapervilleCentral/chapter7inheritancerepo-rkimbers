
/**
 * Write a description of class HopBug here.
 * 
 * @author Calvin Comstock-Fisher and Ryan Kimberly
 * @version (a version number or a date)
 */

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;

import java.util.Random;
import java.util.ArrayList;

import java.awt.Color;
public class HopBug extends Bug
{
    public HopBug() {
        super(new Color(20,166,27));
    }
    
    
    /**
     * Jumps twice if it can if not it jumps once and if not that it turns.
     */
    public void act() {
        if(getGrid().isValid(getLocation().getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection()))){
            move();
            move();
            move();
        } else {
            turn();
        }
    }
}
