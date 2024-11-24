package PartieD;

public class Defaillance extends Exception
{
    private String id;

    public Defaillance(String ue)
    {
        //super();          //ligne A
        this.id = ue;
    }

    public String getID()
    {
        return id;
    }
}

