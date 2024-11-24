package PartieC.cons;

import java.util.Iterator;

public class BoolIntSet extends AintSet
{
   private boolean[] data;
  
   // Implémenter l'itérateur comme classe membre lui permet
   // l'accès à l'attribut privé data
   class IterIntSet implements Iterator<Integer>
   {
       private int cursor;

       public IterIntSet() {this.cursor = -1;}

       public boolean hasNext()
       {
           cursor++;
           while(cursor<data.length)
           {
               if(data[cursor]) return true;
               else cursor++;
           }
           return false;
       }

       public Integer next() {return cursor;}
   }
 
   public BoolIntSet() {this.data = new boolean[256];}
 
   public void add(int e) {this.data[e] = true;}
 
   public boolean isIn(int e){return this.data[e];}
 
   public Iterator<Integer> iterator(){return new IterIntSet();}
}