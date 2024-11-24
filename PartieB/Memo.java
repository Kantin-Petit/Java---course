package PartieB;

public class Memo 
{
    private Date[] tab;
    private int nDates;
    
    public Memo(int n)
    {
        tab = new Date[n];
        nDates = 0;
    }

    public void add(Date d)
    {
        if(nDates >= tab.length)
            System.out.println("Tableau plein !");
        else
        {
            tab[nDates] = d;
            nDates++;
        }
    }
    public void print()
    {
        for(int i = 0; i<nDates; i++)
            System.out.println(tab[i].toString());
    }
    //Bdec40
    public Date read(int i)
    {
        if(i < nDates)
            return this.tab[i];
        else 
            return null;
    }
    //Bdec41
    public Memo(Date d1, Date d2)
    {
        tab = new Date[2];
        nDates = 2;
        tab[0] = d1;
        tab[1] = d2;
    }
}
