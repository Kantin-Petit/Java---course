package PartieC.autoEval;

public class UniformGen extends GenericRandGen
{
    @Override
    public String getLaw()
    {
        return "UniformGen";
    }

    @Override
    public double draws()
    {
        return Math.random()*2 + 3;
    }
}