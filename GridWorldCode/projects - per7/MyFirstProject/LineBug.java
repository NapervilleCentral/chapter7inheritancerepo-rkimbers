import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Bug;
import java.awt.Color;

/**
 * Write a description of class LineBug here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LineBug extends Bug
{
    public LineBug(){
     super(Color.orange);   
        
    }
    
    public void act(){
        if(canMove()){
            move();
        }
        else{
            turn();
            turn();
            turn();
            //turn();
        }
    }
}
