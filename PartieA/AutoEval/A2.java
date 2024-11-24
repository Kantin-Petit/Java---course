package PartieA.AutoEval;

public class A2 
{
    public static void afficheEnsemble(boolean[] e)
    {
        int a = e.length;
        System.out.print("{");
        for(int i = 0; i<a; i++)
        {
            if(e[i])
            {
                System.out.print(" "+i);
            }
        }
        System.out.print(" }");
    }

    public static void main(String args[])
  {
    boolean[] e = {false, false, false, true, true, false, false, true};
    afficheEnsemble(e);
  }
}
