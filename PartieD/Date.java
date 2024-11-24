package PartieD;

public class Date 
{
    final public static int MAXY = 2023;
    final public static int MINY = 1900;

    private int jour;
    private int mois;
    private int annee;
 
    public Date(int jour, int mois, int annee) throws BadDate
    {
      if((annee<MINY)||(annee>MAXY))
      {
        throw new BadDate("Année incorrecte");
      }
      else if (mois < 1 || mois > 12)
      {
        throw new BadDate("Mois incorrecte");
      }
      else if (jour < 1 || jour > 31)
      {
        throw new BadDate("Jour incorrecte");
      }
      else if (annee%4 == 0 && annee%100 != 0 && annee%400 == 0 && mois == 2 && jour > 29)
      {
        throw new BadDate("Jour incorrecte");
      }
      else if (mois % 2 == 0 && jour > 30)
      {
        throw new BadDate("Jour incorrecte");
      }
      else if (mois == 2)
      {
        throw new BadDate("Jour incorrecte");
      }

      this.annee=annee; this.jour=jour; this.mois=mois; 
    }
 
    public String toString()
    {
      return this.jour + "/" + this.mois + "/" + this.annee;
    }
}
