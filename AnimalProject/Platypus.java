
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
    
    public void bite(Animal o){
        o.poisoned = true;
    }
    
    public String move(){
        return "paddle";
    }
    
    public String toString(){
        return super.toString() + " is platypus poisoned: "+poisoned;
    }
}
