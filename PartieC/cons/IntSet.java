package PartieC.cons;

public interface IntSet extends Iterable<Integer>
{
    public void add(int e);
    public boolean isIn(int e);
    public boolean subsetOf(IntSet s);
}