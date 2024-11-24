package PartieB.Bass00;

public class Main 
{
    public static void main(String[] args) 
    {
        Compteur cmpt = new Compteur();
        cmpt.plusUn();
        cmpt.plusUn();
        cmpt.plusUn();
        System.out.println(cmpt.lecture());
        System.out.println();
    }    
}
