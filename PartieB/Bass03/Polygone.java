package PartieB.Bass03;

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

    public double perimetre()
    {
        double somme = 0;
        for(int i =0; i<sommets.size()-1; i++)
            somme += sommets.get(i).dist(sommets.get(i+1));
        somme += sommets.get(0).dist(sommets.get(sommets.size()-1));
        return somme;
    }

    public String toString()
    {
        return "il y as " + sommets.size() + " sommets, le perimetre est de " + this.perimetre();
    }
}
