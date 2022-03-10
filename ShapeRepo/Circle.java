//Name
//Date
//program
//Program Description

import TurtleGraphics.Pen;

public class Circle extends Shape
{
    protected double radius;

    
    public Circle(double x, double y, double r){
        super(x,y);
        radius = r;
    }
    
    
    public void move(double xLoc, double yLoc){
        xPos+=xLoc;
        yPos+=yLoc;
    }
    
    public void stretchby (double factor){
        xPos*=factor;
        yPos*=factor;
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
     return Math.PI*Math.pow(radius,2);   
    }

    public double getRadius()
    { return radius;   
    }
    
    public double getDiameter()
    { return radius*2;   
    }

    public String toString()
    {
        return "Area: "+getArea()+" Radius"+getRadius();
    }






}//end of Circle