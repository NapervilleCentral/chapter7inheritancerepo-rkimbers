
/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog extends Pet
{
    public Dog(String dogName, int dogWeight){
        super(dogName);
        
        
    }
    
    public String move(){
        return "walk";
    }
    
    public String speak(){
        return "bark";
    }
    
    public String toString(){
        return "I am a dog, "+super.toString();
    }
}
