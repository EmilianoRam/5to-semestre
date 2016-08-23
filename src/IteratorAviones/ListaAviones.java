/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IteratorAviones;

import Builder.Avion;
import Iterator.Aggregate;
import Iterator.Iterator;

/**
 *
 * @author Emiliano
 */
public class ListaAviones implements Aggregate {
    
    private Avion[] aviones;
    private int numAviones;
    private int size = 10;
    
    public ListaAviones()
    {
        aviones = new Avion[size];
    }
    
    public void add(Avion avions)
    {
        aviones[numAviones ++] = avions;
    }

    @Override
    public Iterator createIterator() {
        
        return new ConcreteIterator();
        
    }
    
    class ConcreteIterator implements Iterator
    {
        int index = 0;

        @Override
        public Object first() {
            
            return aviones[0];
        }

        @Override
        public Object next() {
            
            if(isDone())
            {
                return aviones[index++];
            }
            return null;
        }

        @Override
        public boolean isDone() {
            
            if(index >= numAviones)
            {
               return false;
            }
            
            return true;
           
        }

        @Override
        public Object currentItem() {
            
            return aviones[index];
        }
        
    }
    
}
