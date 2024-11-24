package PartieA;

public class Adec21 
{
    public static void compte(int a, int b)
    {
        int i = a;
        while(i<=b)
        {
            System.out.print(i + " ");
            i++;
        }
    }    

    public static void main(String[] args) 
    {
        compte(3, 6);
    }
}
