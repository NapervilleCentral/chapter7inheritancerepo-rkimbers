import TurtleGraphics.Pen;

public abstract class Shape
{
    protected double xPos, yPos;

    public Shape (double x, double y)
    {
        this.xPos = x;
        this.yPos = y;
    }

    // you must write these methods here
    public double getXpos()
    { return xPos;
    }
    
    public double getYpos()
    { return yPos;
    }
    
    public abstract void move(double xLoc, double yLoc);
    // increase the size by the factor
    public abstract void stretchby (double factor);

    public abstract double getArea();

    public abstract void draw (Pen p);

    //toString should display xpos, ypos
    public String toString()
    {   
        return "xPos "+xPos+" yPos"+yPos;
    }

}//end of Shape