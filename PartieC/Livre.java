package PartieC;

public class Livre extends Document
{
    private long isbn;
    private int annee;

    public Livre(String nom, Personne[] auteurs, long isbn, int apub)
    {
        super(nom, auteurs); // Appel du constructeur de Document
        this.isbn=isbn;
        annee=apub;
    }

    public long getIsbn()
    {
        return isbn;
    }

    public String toString()
    {
        String s = "Livre : "+super.toString(); // Appel toString de document
        return s+"\nISBN : "+isbn+" ("+annee+")";
    }
}