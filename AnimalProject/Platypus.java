
/**
 * Write a description of class Platypus here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Platypus extends Mammal
{
    public Platypus(){
        hasFur = true;
        laysEggs = true;
    }
    
    public void bite(){
        poisoned = true;
    }
    
    public String move(){
        return "test";
    }
    
    public String toString(){
        return "is platypus poisoned: "+poisoned;
    }
}
