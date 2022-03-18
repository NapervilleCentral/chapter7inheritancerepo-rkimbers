import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Bug;
import java.awt.Color;

/**
 * Write a description of class BoxBug here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ZBug extends Bug
{
    private int steps = 0;
    private int sideLength = 2;
    
    
    /**
     * @param len of side of box
     */
    public ZBug(int k){
        super(Color.yellow);
        sideLength = k-1;
    }
    public void act(){
        if (steps < sideLength && canMove()){
            move();
            //steps++;
        }
        else{
            turn();
            turn();
            turn();
            //steps = 0;
            //sideLength++;
        }
    }
}
