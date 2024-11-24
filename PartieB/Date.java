package PartieB;

public class Date 
{
    private int jour;
    private int mois;
    private int annee;
 
    public Date()
    {
      this.jour=1; this.mois=1; this.annee=1900;
    }
 
    public Date(int jour, int mois, int annee)
    {
      this.jour=jour; this.mois=mois; this.annee=annee;
    }
 
    public String toString()
    {
      return this.jour + "/" + this.mois + "/" + this.annee;
    }
    
    //Bdec13
    public Date(int annee)
    {
        this.jour = 1;
        this.mois = 1;
        this.annee = annee;
    }


    //Partie B2
    int getJour()
    {
      return jour;
    }
    
    public int getAnnee()
    {
      return annee;
    }
    
    public int getMois()
    {
      return mois;
    }
    
    public void setAnnee(int annee)
    {
      this.annee = annee;
    }
    
    public void setMois(int mois)
    {
      this.mois = mois;
    }
    
    public void setJour(int jour)
    {
      this.jour = jour;
    }
    //Bdec20
    public void setDate(int jour, int mois, int annee)
    {
      setJour(jour);
      setMois(mois);
      setAnnee(annee);
    }

    public static void test() 
    {
      //Bdec21
      Date d = new Date(7,11,1999);
      d.setDate(12, 10, 2005);
      System.out.println(d.toString());  
    }

    public Date(Date d)
    {
      this.jour = d.jour;
      this.mois = d.mois;
      this.annee = d.annee;
    }
    public Date Clone()
    {
      return new Date(this.jour, this.mois, this.annee);
    }

    //Bdec60
    public Date plusUnAn()
    {
      Date cpy = new Date(this);
      cpy.setAnnee(getAnnee()+1);
      return cpy;
    }
    //Bdec61
    public Date plusUnAn2()
    {
      Date cpy = this.Clone();
      cpy.setAnnee(getAnnee()+1);
      return cpy;
    }
}
