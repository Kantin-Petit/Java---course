package PartieC;

public class Document
{
    private String nom;
    private Personne[] auteurs;

    public Document(String n, Personne[] a)
    {
        this.nom=n; auteurs = a;
    }

    public int nbAuteurs()
    {
        return auteurs.length;
    }

    public String toString()
    {
        String da;
        if(nbAuteurs()==0) da="inconnu";
        else
        {
            da="";
            for (int i = 0; i < nbAuteurs(); i++)
                da = da + auteurs[i] + " ";
        }
        return nom + "\nAuteur(s) : "+da;
    }

}