import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Bug;


import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class NewBug extends Bug
{
    private int choice;
    private int sideLength;
    private Bug tag;
    private Color purple;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public NewBug()
    {
        //tag = bee;
        purple = new Color(186,52,235);
        setColor(purple);
    }

    /**
     * Moves to the next location of the square.
     * gen a random number 1-100
     * <45 moves()
     * <70 face RIGHT
     * <95 face LEFT
     * <100 face BACKWARDS
     */
    public void act()
    {
        choice = (int) (Math.random() * 100) + 1;
        
        if (canMove()){
                if (choice < 45){
                    move();
                }
                else if (choice < 70){
                    setDirection(90);
                }              
                else if (choice < 95){
                    setDirection(270);
                }
                else if (choice < 100){
                    setDirection(180);
                }
        }
    }
}





