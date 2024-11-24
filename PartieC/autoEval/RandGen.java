package PartieC.autoEval;

public interface RandGen
{
    public void setMin(double min);
    public void setMax(double max);
    public double getMin();
    public double getMax();
    public String getLaw();
    public double draws();
}