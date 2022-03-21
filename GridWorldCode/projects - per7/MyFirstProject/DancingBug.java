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
public class DancingBug extends Bug
{
    private int[] dance;
    private int count = 0;
    private int index;
    private int value;


    /**
     * @param len of side of box
     */
    public DancingBug(int[] arr){
        super(Color.black);
        dance = arr;
    }
    public void act(){
        value = dance[index];
        if(count < value){
            turn();
            count++;
        }
        else{
            move();
            index++;
            count = 0;
        }
        
    }
}
