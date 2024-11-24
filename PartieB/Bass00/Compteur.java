package PartieB.Bass00;

public class Compteur 
{
    private int cpt;
    public Compteur()
    {
        cpt = 0;
    }    
    public void plusUn()
    {
        this.cpt++;
    }
    public int lecture()
    {
        return cpt;
    }
}
