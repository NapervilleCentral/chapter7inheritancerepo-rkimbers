import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Bug;


import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class DirBug extends Bug
{
    private int steps;
    private int sideLength;
    private Bug tag;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public DirBug(Bug bee)
    {
        tag = bee;
        setColor(Color.white);
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        //find a obj location
        Location tagL = tag.getLocation();
        //find the direction they are in relation to us
        int tagdir = this.getLocation().getDirectionToward(tagL);
        this.setDirection(tagdir);
        super.act();
    }
}




