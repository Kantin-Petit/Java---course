package PartieC.autoEval;

public class TestRand extends GenericRandGen
{
    @Override
    public String getLaw()
    {
        return "TestRand";
    }

    @Override
    public double draws()
    {
        return (getMax() + getMin())/ 2.0;
    }
}