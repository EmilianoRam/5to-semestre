/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IteratorAviones;

import Builder.Avion;
import Builder.BoeingBuilder;
import Builder.Director;
import Iterator.Iterator;

/**
 *
 * @author Emiliano
 */
public class Test {
    
    public static void main(String[] args) {
        
        ListaAviones lista = new ListaAviones();
        Director d = new Director();
        d.setBuilder(new BoeingBuilder());
        d.buildAvion();
        Avion miAvionBoeing = d.getAvion();
        
    
}
}
