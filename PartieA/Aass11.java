package PartieA;

public class Aass11 
{
    public static String effect(String s)
    {
        String result = "";
        for(int i=0;i<s.length();i++)
        {
            if(Math.random()>=(0.5))
                result = result + Character.toUpperCase(s.charAt(i));
            else
                result = result + s.charAt(i);
        }
        return result;
    }    
    public static void main(String[] args) 
    {
        System.out.print(effect("salut comment tu va ?"));    
    }
}
