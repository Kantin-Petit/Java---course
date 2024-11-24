package PartieB.Bass04;

public class Point 
{
    private double x;
    private double y;
    
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public String toString()
    {
        return "("+x+","+y+")";
    }

    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }

    public double dist(Point p)
    {
        double x1 = this.x;
        double x2 = p.getX();
        double y1 = this.y;
        double y2 = p.getY();

        return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
    }
}