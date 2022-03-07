
/**
 * Write a description of class Coba here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cobra extends Snake
{
    private boolean poison;
    
    public Cobra(){
        super(4);
        poison = true;
    }
    
    public void bite(Animal obj){
        obj.poisoned = true;
    }
    
    public String toString(){
        
        return super.toString() + "Cobras have venom";
    }
}
