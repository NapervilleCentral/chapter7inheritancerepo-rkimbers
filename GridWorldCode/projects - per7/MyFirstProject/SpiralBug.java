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
public class SpiralBug extends Bug
{
    private int steps;
    private int sideLength = 2;
    
    
    /**
     * @param len of side of box
     */
    public SpiralBug(int k){
        super(Color.yellow);
        sideLength = k-1;
       
    }
    public void act(){
        if (steps < sideLength && canMove()){
            move();
            steps++;
        }
        else{
            turn();
            steps = 0;
        }
    }
}