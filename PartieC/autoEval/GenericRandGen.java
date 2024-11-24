package PartieC.autoEval;

import java.util.ArrayList;
import java.util.List;

public abstract class GenericRandGen implements RandGen
{
    private double min;
    private double max;

    public GenericRandGen()
    {
        this.min = 0.0; this.max = 1.0;
    }

    public void setMin(double min) {this.min = min;}
    public void setMax(double max) {this.max = max;}
    public double getMin() {return this.min;}
    public double getMax() {return this.max;}
    public abstract String getLaw();
    public abstract double draws();

    public String toString()
    {
        return "Générator " + getLaw() + " in [" + min + "," + max + "]";
    }

    public ArrayList<Double> sample(int n)
    {
        ArrayList<Double> tab;
        tab = new ArrayList<Double>(n);
        for(int i = 0; i<n; i++)
        {
            tab.add(draws());
        }
        return tab;
    }
}