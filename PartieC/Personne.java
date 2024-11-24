package PartieC;

public class Personne
{
    private String nom;
    private Date dateNaiss;

    public Personne(String nom)
    {
        // DateNaiss est initialisé implicitement à null
        this.nom=nom;
    }

    public Personne(String nom, Date naiss)
    {
        this(nom); // Appel du constructeur à 1 paramètre
        this.dateNaiss =  naiss;
    }

    public String toString()
    {
        String s = nom;
        if(dateNaiss!=null)
        {
            s = s + "né le " + dateNaiss;
        }
        return s;
    }
}