package PartieA;

public class Atop01 
{
    public static boolean[] premiers(int n)
    {
        boolean[] t = new boolean[n];

        //initialisation tab
        for(int i = 0; i<n; i++)
            t[i] = false;
        t[0] = true;
        t[1] = true;

        //crible
        for(int i = 2; i<n; i++)
            if(!t[i])
                for(int j = i*2; j<n; j = j + i)
                    t[j] = true;
        
        return t;
    }   
    
    public static void main(String[] args) 
    {
        boolean[] t = premiers(100);
        for(int i = 2; i<100; i++)
            if(!t[i])
                System.out.print(i + ", ");
    }
}
