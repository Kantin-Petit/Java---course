package PartieC.autoEval;

import java.util.ArrayList;

public class Main
{
        public static void main(String[] args)
    {
        GenericRandGen g = new UniformGen();
        g.setMin(3.0);
        g.setMax(5.0);
        ArrayList<Double> tab = g.sample(10);

        for(double val : tab)
        {
            String aff = String.format("%.2f", val);
            System.out.print(aff + " ");
        }
        System.out.println();
    }
}

