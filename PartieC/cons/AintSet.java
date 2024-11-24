package PartieC.cons;

import java.util.Iterator;

public abstract class AintSet implements IntSet
{
   public boolean subsetOf(IntSet s)
   {
       Iterator<Integer> iter = iterator();
       while(iter.hasNext())
       {
         int e = iter.next();
         if(!s.isIn(e))
         {
             return false;
         }
       }
       return true;
   }

   public static void main(String[] args) 
   {
   }
}
