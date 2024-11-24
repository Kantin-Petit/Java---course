package PartieB.Bass01;

import java.util.ArrayList;

public class Memo 
{
    private ArrayList<Date> tab;
    
    public Memo(int n)
    {
        tab = new ArrayList<>(n);
    }

    public void addDate(Date d)
    {
        tab.add(d);
    }

        public void print()
    {
        for(int i = 0; i<tab.size(); i++)
            System.out.println(tab.get(i));
    }
}
