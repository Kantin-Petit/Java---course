package PartieB;

public class Periode 
{
    private Date debut;
    private Date fin;
    private String nom;

    public Periode(Date deb, Date fin, String nom)
    {
        this.debut = deb;
        this.fin = fin;
        this.nom = nom;
    }

    public String toString()
    {
        return "["+ nom + " " + debut + " - " + fin + "]";
    }

    public static void test()
    {
        Date d1 = new Date(4, 9, 2018);
        Date d2 = new Date(19,9,2018);
        Periode p = new Periode(d1, d2, "Vacances");
        System.out.println(p.toString());
    }

    //Bdec30
    //changement de datepour la version 2

    public static void main(String[] args) 
    {
        test();    
    }
}
