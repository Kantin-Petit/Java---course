package PartieA;

public class Aass00 
{
    public static boolean premier(int x)
    {
        for(int i = 2; i<=(int)Math.sqrt(x); i++)
            if(x%i == 0)
                return false;
        return true;
    }    

    public static void main(String[] args) 
    {
        System.out.print(premier(2));
    }
}
