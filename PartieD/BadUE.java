package PartieD;

public class BadUE extends Exception
{
    private String idUE;

    public BadUE(String id)
    {
        this.idUE = id;
    }

    public String getId()
    {
        return idUE;
    }
}