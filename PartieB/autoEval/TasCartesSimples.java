package PartieB.autoEval;

import java.util.ArrayList;
import java.util.Random;

public class TasCartesSimples 
{
    private ArrayList<CarteSimple> contenu;
    Random genRand = new Random();

    public int taille() {return contenu.size();}

    public CarteSimple retire()
    {
        int r = genRand.nextInt(taille());
        CarteSimple c = contenu.remove(r);
        return c;
    }
    

    TasCartesSimples()
    {
        contenu = new ArrayList<CarteSimple>();
        for(int i = 1; i<=4; i++)
            for(int j = 1;j<=10;j++)
                contenu.add(new CarteSimple(i, j));
    }

    public void affiche()
    {
        int nit = 0;
        for(CarteSimple c : contenu)
        {
            if(nit==5) {nit=0; System.out.println();}
            System.out.print("("+c.getEns()+","+c.getVal()+") ");
            nit++;
        }
    }

    TasCartesSimples(TasCartesSimples Tas1)
    {
        contenu = new ArrayList<CarteSimple>();
        for(CarteSimple c : Tas1.contenu)
        {
            contenu.add(new CarteSimple(c.getEns(), c.getVal()));
        }
    }

    public static void main(String args[])
    {
        TasCartesSimples Tas1 = new TasCartesSimples();
        for(int i = 0; i<38; i++)
            System.out.println(Tas1.retire());
        TasCartesSimples Tas2 = new TasCartesSimples(Tas1);
        CarteSimple c = new CarteSimple(0, 0);
        c = Tas2.retire();
        Tas1.affiche();
        System.out.println();
        Tas2.affiche();
        System.out.print(c);
    }
}
