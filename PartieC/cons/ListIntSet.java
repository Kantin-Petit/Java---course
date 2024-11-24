package PartieC.cons;

import java.util.ArrayList;
import java.util.Iterator;

public class ListIntSet extends AintSet
{
   private ArrayList<Integer> data;
  
   class IterIntSet implements Iterator<Integer>
   {
     private int cursor;
 
     public IterIntSet(){this.cursor = 0;}
 
     public boolean hasNext()
     {
       if(cursor<data.size()) return true;
       else return false;
     }
 
     public Integer next()
     {
       this.cursor++;
       return data.get(cursor-1);
     }
   }

    public ListIntSet() {this.data = new ArrayList<>();}
 
    public void add(int e) {this.data.add(e);}

    public Iterator<Integer> iterator(){return new IterIntSet();}

    @Override
    public boolean isIn(int e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isIn'");
    }
}
