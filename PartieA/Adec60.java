package PartieA;

public class Adec60 
{
    public static void main(String[] args)
    {
        if((args.length != 3) || !(args[1].equals("+") || args[1].equals("*")))
        {
            System.out.println("Arguments incorrects"); 
        }
        else
        {
            int a = Integer.parseInt(args[0]); 
            int b = Integer.parseInt(args[2]);
            if(args[1].equals("+"))
                System.out.println(a+b);
            else
                System.out.println(a*b); 
        }
    }
}
