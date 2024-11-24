package PartieB;

import java.util.ArrayList;

public class Document 
{
    private String nom;
    private ArrayList<Personne> auteurs;
    
    public Document (String n, Personne[] a)
    {
        this.nom = n;
        auteurs = new ArrayList<Personne>();
        for(int i=0; i<a.length; i++)
            auteurs.add(a[i]);
    }
    public int nbAuteurs()
    {
        return auteurs.size();
    }
    public String toString()
    {
        String da = "";
        for(int i=0; i < nbAuteurs(); i++)
            da = da + auteurs.get(i) + " ";
        return nom + "\nAuteur(s) : " + da;
    }
    //Bdec50
    public Document(String nom)
    {
        this.nom = nom;
        auteurs = new ArrayList<>();
    }
    //Bdec51
    public void addAuteur(Personne p)
    {
        this.auteurs.add(p);
    }
    //Bdec52
    public void addAuteur(String nom, String Prenom)
    {
        this.auteurs.add(new Personne(nom, Prenom));
    }

}
