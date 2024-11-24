package PartieA;

public class Adec42 
{

    public static void printTabInt(int[] t)
    {
        for(int i=0; i< t.length; i++)
        {
            System.out.print(t[i] + " ");
        }
        System.out.println();
    }
  
    public static int[] produitab(int a, int b)
    {
        int[] t = new int[b-a+1];
        for(int i=0; i< t.length; i++)
        {
            t[i] = a + i;
        }
        return t;
    }
  
    public static void main(String[] args)
    {
        printTabInt(produitab(3, 7));
    }    
}
