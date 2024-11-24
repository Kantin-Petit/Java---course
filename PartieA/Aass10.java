package PartieA;

public class Aass10 
{
    public static String StringAleatoire(int n)
    {
        String S = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Result = "";
        int x;
        for(int i=0;i<n;i++)
        {
            x = (int)(Math.random()*26);
            Result += S.charAt(x);
        }
        return Result;
    }

    public static void main(String[] args) 
    {
        System.out.println(StringAleatoire(7));
    }    
}
