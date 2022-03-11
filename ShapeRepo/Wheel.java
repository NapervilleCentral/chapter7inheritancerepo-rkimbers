import TurtleGraphics.Pen;
/**
 * Write a description of class Wheel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wheel extends Circle
{
    private double spokes;
    
    public Wheel(double x, double y, double r, double s){
        super(x,y,r);
        spokes = s;
        
        
    }
    
    public void draw(Pen p){
        double increment = (double)360/spokes;
        double i2 = increment;
        double side = 2.0 * Math.PI * radius / 120.0;
        p.up();
        p.move (xPos + radius, yPos - side / 120.0);
        p.setDirection (90);
        p.down();
        for (int i = 0; i<120; i++)
        {
            p.move(side);
            p.turn(3);
            
            if(Math.abs(increment - i) < 1){
                p.turn(90);
                p.move(radius);
                p.turn(180);
                p.move(radius);
                p.move(90);
                
                increment += i2;
            }
        }
        }

        
   }

