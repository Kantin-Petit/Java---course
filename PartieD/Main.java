package PartieD;

public class Main
{

    public static void main(String[] args)
    {
        SuiviEtu fiche = new SuiviEtu(1233);
        fiche.addUE("Java", 2.0);
        fiche.addUE("BD", 3.0);
        try
        {
            fiche.addNote("Java", 12.0);
            fiche.addNote("Java", 17.0);
            fiche.addNote("BD", 14.0);
            System.out.println(fiche.moyenne());
        }
        catch(Defaillance ue)
        {// Traitement des exceptions produites par fiche.moyenne()
            System.out.println("Défaillance à l'UE : " + ue.getID());
        }
        catch(BadUE ue)
        {// Traitement des exceptions produites par fiche.addNote(...)
            System.out.println("UE non référencée : " + ue.getId());
        }
    }

    public static void test()
{
    try
    {
        Date d = new Date(-2,13,1899);
        System.out.println(d);
    }
    catch(BadDate e)
    {
        System.out.println(e);
    }
}
}

