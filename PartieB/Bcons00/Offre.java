package PartieB.Bcons00;

public class Offre 
{
    public int id;
    public double montant;
    
    public Offre(int id, double montant)
    {
        this.id = id; this.montant = montant;
    }

    public int getId() {return id;}

    public double getMontant() {return montant;}

    public String toString()
    {
        return "["+id+" : "+montant+"]";
    }
}
