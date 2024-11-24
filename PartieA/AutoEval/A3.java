package PartieA.AutoEval;

public class A3 
{
    public static int retireElement(boolean[] e)
    {
        int a = e.length;
        for(int i = 0; i<a; i++)
        {
            if(e[i])
            {
                e[i] = false;
                return i;
            }
        }
        return -1;
    }  
    public static void main(String args[])
    {
      boolean[] e = {false, false, false, true, true, false, false, true};     
      boolean nonVide = true;
        
      while(nonVide)
      {
          int x = retireElement(e);
          if(x == -1)
            nonVide = false;
          else
            System.out.print(x + " ");
      }
      A2.afficheEnsemble(e);
    }  
}
