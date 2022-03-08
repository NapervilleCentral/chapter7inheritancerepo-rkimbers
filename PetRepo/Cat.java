
/**
 * Write a description of class Cat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cat extends Pet
{
    public Cat(String catName){
        super(catName);
    }
    
    public String move(){
        return "step";
    }
    
    public String speak(){
        return "meow";
    }
    
    public String toString(){
        return super.toString()+", I AM A CAT";
    }
}
