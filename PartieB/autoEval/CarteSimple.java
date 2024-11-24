package PartieB.autoEval;

public class CarteSimple
{
    public static String[] nomEnseigne = 
        {"", "Coeur", "Carreau", "Pique", "Trefle"};
    private int enseigne;
    private int valeur;

    public int getVal() {return valeur;}
    public int getEns() {return enseigne;}
    
    CarteSimple(int couleur, int valeur)
    {
        this.valeur = valeur;
        this.enseigne = couleur; 
    }

    public String toString()
    {
        return "" + valeur + " de " + nomEnseigne[enseigne];
    }

    public static void main(String args[])
    {
      CarteSimple c1 = new CarteSimple(2,3);
      CarteSimple c2 = new CarteSimple(1,4);
      System.out.println(c1);
      System.out.println(c2);
    }
}
