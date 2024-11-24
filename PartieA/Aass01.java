package PartieA;

public class Aass01 
{
    public static boolean premier(int x)
    {
        for(int i = 2; i<=(int)Math.sqrt(x); i++)
            if(x%i == 0)
                return false;
        return true;
    }    

    public static int[] premiers(int x)
    {
        int[] tab_temp = new int[(int)(x/2)];
        int cmpt = 0;
        for(int i = 2; i <= x;i++)
            if(premier(i))
            {
                tab_temp[cmpt] = i;
                cmpt ++;
            }
        int[] tab = new int[cmpt];
        for(int i = 0; i<cmpt; i++)
            tab[i] = tab_temp[i];
        return tab;
    }

    public static void main(String[] args) 
    {
        int[] t = premiers(10);
        for(int i = 0; i<t.length;i++)
            System.out.print(t[i]+ ", ");
    }
}
