package PartieA;

public class Adec22 
{
    public static void couples(int a, int b)
    {
        for(int i = a; i <= b; i++)
        {
            for(int j = a; j <= b; j++)
            {
                System.out.println("(" + i + "," + j + ")");
            }
        }
    }
    public static void main(String[] args) 
    {
        couples(3,6);    
    }    
}
