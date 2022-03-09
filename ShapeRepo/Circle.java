//Name
//Date
//program
//Program Description

import TurtleGraphics.Pen;

public class Circle extends Shape
{
    private double radius;

    
    public Circle(int x, int y, int r){
        super(x,y);
        radius = r;
    }
    
    
    public void move(double xLoc, double yLoc){
        
    }
    
    public void stretchby (double factor){
        
    }
        
        
    
    public void draw(Pen p)
    {
        double side = 2.0 * Math.PI * radius / 120.0;
        p.up();
        p.move (xPos + radius, yPos - side / 120.0);
        p.setDirection (90);
        p.down();
        for (int i = 0; i<120; i++)
        {
            p.move (side);
            p.turn(3);
        }

    }
    
    public double getArea(){
     return 1.1;   
    }

    public double getRadius()
    { return radius;   
    }

    public String toString()
    {
        return "hi";
    }






}//end of Circle