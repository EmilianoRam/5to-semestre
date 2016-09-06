/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

/**
 *
 * @author Emiliano
 */
public class Pair <K, V> {
    
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    private Pair() {
        
    }
    

    /**
     * @return the key
     */
    public K getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(K key) {
        this.key = key;
    }

    /**
     * @return the value
     */
    public V getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(V value) {
        this.value = value;
    }
    
    public static void main(String[] args) {
        
        Pair <Integer, String> par1 = new Pair(1, "Juan");
        Pair <Integer, String> par2 = new Pair(2, "Pedro");
        Pair <Integer, String> par3 = new Pair(3, "Aln");
        Pair <Integer, String> par4 = new Pair(4, "Jorge");
        Pair <String, Double> par5 = new Pair("hola", 316.4);
        
        System.out.println("Key: " + par1.getKey() + "value: " + par1.getValue());
    }
    
}
