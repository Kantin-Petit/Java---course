package PartieD;

public class TestRuntimeExceptions
{
    public static void main(String[] args)
    {
        try
        {
            int[] tab = new int[5];
            tab[5] = 12;
        }
        catch(RuntimeException e)
        {
            System.out.println("----- ERREUR D'EXECUTION -----");
        }
        finally
        {
            System.out.println("Execution terminée");
        }
    }
}