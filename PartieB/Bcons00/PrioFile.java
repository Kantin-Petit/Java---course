package PartieB.Bcons00;

public class PrioFile 
{
    Offre[] File;
    
    public PrioFile(int n)
    {
        File = new Offre[n];
    }

    public void soumission(int id, double montant)
    {
        int min = 0;
        for(int i = 0; i<File.length; i++)
        {
            if(File[i].getMontant() < File[min].getMontant())
                min = i; 
        }
        if(montant > File[min].getMontant())
        {
            File[min] = new Offre(id, montant);
        }
    }

    public String toString()
    {
        String s = "il y as " + File.length + "offre retenu : \n";
        for(int i = 0; i< File.length;i++)
        {
            s = s + "" + File.length + "€ \n";
        }
        return s;
    }
}
