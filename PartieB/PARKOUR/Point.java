package PartieB.PARKOUR;

public class Point 
{
    private double x;
    private double y;    

    public Point(double a, double b)
    {
        x =a;
        y = b;
    }

    //1.3 : aucune erreur, valeur null
    public static void main(String[] args)
    {
        Point[] tab = new Point[10];
        //1.4 :
        tab[5] = new Point(5.2, 3.7);
        System.out.println(tab[5]);
    }
}
