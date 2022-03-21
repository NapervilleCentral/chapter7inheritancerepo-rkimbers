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
    private int z;


    /**
     * @param len of side of box
     */
    public ZBug(int k){
        super(Color.yellow);
        sideLength = k-1;
        z = 3;
        setDirection(90);
    }
    public void act(){
        if (steps < sideLength && canMove()){
            move();
            steps++;
        }
        else{
            if(z == 1){
                turn();
                turn();
            }
            turn();
            turn();
            turn();
            steps = 0;
            if(z <= 0){
                steps = sideLength+1;
            }
        }
    }
}
