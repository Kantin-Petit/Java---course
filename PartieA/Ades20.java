package PartieA;

public class Ades20
{
    public static void compte(int k)
    {
        int i = 0;
        while(i<k)
        {
            if(i<k-1)
                System.out.print(i + ", ");
            else
                System.out.print(i);
            i++;
        }
    }
    public static void main(String[] args) 
    {
        compte(10);
    }
}