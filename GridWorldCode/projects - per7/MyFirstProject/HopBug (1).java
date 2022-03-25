
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
     * Tries to jump 3 spaces and if it cant it turns.
     */
    public void act() {
        Location loc = getLocation().getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection());
        if(getGrid().isValid(loc)){
            if(getGrid().get(loc) == null) {
                moveTo(loc);
            } else {
                turn();
            }
        } else {
            turn();
        }
    }
}
