package PartieA;

public class Atop00 
{
    public static int[] premiers(int n)
    {
        int[] t_temp = new int[n/2];
        t_temp[0] = 2;
        int x = 1;
        for(int i = 3; i < n ;i++)
        {
            int cmpt = 0;
            while(t_temp[cmpt] < (int)Math.sqrt(i) && i%t_temp[cmpt] != 0)
                cmpt ++;
            if(i%t_temp[cmpt] != 0)
            {
                t_temp[x] = i;
                x ++;
            }
        }
        int[] t = new int[x];
        for(int i = 0 ;i < x ;i++)
            t[i] = t_temp[i];
        return t;
    }
    public static void main(String[] args) 
    {
        int[] t = premiers(10);
        for(int i = 0; i<t.length;i++)
            System.out.print(t[i]+ ", ");
    }    
}
