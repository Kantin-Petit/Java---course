package PartieB.Bass04;

import java.util.ArrayList;

public class Polygone 
{
    private ArrayList<Point> sommets;

    public Polygone(Point a, Point b, Point c)
    {
        sommets = new ArrayList<>();
        this.sommets.add(a);
        this.sommets.add(b);
        this.sommets.add(c);
    }

    public Polygone(Point a, Point b, Point c, Point d)
    {
        sommets = new ArrayList<>();
        this.sommets.add(a);
        this.sommets.add(b);
        this.sommets.add(c);
        this.sommets.add(d);
    }

    public static Polygone triangle(double x1, double y1, double x2, double y2, double x3, double y3)
    {
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        Point c = new Point(x3, y3);
        return new Polygone(a, b, c);
    } 

    public double perimetre()
    {
        double somme = 0;
        for(int i =1; i<sommets.size(); i++)
            somme += sommets.get(i-1).dist(sommets.get(i));
        somme += sommets.get(0).dist(sommets.get(sommets.size()-1));
        return somme;
    }

    public String toString()
    {
        return "il y as " + sommets.size() + " sommets, le perimetre est de " + this.perimetre();
    }

    public static void main(String[] args) 
    {
        Polygone trianglPolygone = Polygone.triangle(0, 1, 2, 3, 4, 5);
        System.out.println(trianglPolygone.toString());    
    }
}
