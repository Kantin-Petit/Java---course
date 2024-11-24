package PartieA;

public class Adec30 
{
    public static void Rempli0123(int[] t)
    {
        for(int i = 0; i<t.length; i++)
        {
            t[i] = i;
        }
    }    

    public static void printTabInt(int[] t)
    {
        for(int i=0; i<t.length; i++)
            System.out.print(t[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) 
    {
        int[] tab = new int[10];
        Rempli0123(tab);
        printTabInt(tab);
    }
}
