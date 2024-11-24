package PartieA.AutoEval;

public class A1 
{
    public static boolean element(boolean[] tab, int x)
    {
        int a = tab.length;
        for(int i =0; i<a; i++)
        {
            if(tab[i] && i == x)
                return true;
        }
        return false;
    }

    public static void main(String args[])
    {
      boolean[] e = {false, false, false, true, true, false, false, true};
      System.out.println(element(e,1));
      System.out.println(element(e,3));
      System.out.println(element(e,5));
      System.out.println(element(e,7));
      System.out.println(element(e,9));
    }  
}
