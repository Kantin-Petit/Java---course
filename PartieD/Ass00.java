package PartieD;

import java.util.Scanner;

public class Ass00 
{
    public static int lireInt()
    {
        while(true)
        {
            try
            {
            return new Scanner(System.in).nextInt();
            }
            catch(Exception e)
            {
                System.out.println("essaie encore : ");
            }
        }
    }    
}
