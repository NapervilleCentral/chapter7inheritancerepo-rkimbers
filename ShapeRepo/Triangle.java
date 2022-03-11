import TurtleGraphics.Pen;

/**
 * Write a description of class Triangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Triangle extends Shape
{
    protected double scale;
    
    public Triangle(double x, double y,double scale){
        super(x,y);
        scale = scale;
        
    }
    
    public void draw(Pen p)
    {
        //double side = 2.0 * Math.PI * radius / 120.0;
       p.up();
        //p.move (xPos + radius, yPos - side / 120.0);
        p.setDirection (90);
        p.down();
        
        p.turn(315);
        p.move(scale);
        p.turn(315);
        p.move(scale);
        p.turn(315);
        p.move(scale);

    }
    public void move(double xLoc, double yLoc){
        
        
    }
    // increase the size by the factor
    public void stretchby (double factor){
        scale *= 2;
    }

    public double getArea(){
        return scale*scale/2;
    }
}
