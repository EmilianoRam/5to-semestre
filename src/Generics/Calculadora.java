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
public class Calculadora {
    
    public <T extends Number > T sum(T a, T b)
    {
        if( a.getClass().equals(Integer.class))
            return (T) new Integer(a.intValue() + b.intValue());
        
        if(a.getClass().equals(Double.class))
            return (T) new Double(a.doubleValue() + b.doubleValue());
        
        if(a.getClass().equals(Float.class))
            return (T) new Float(a.floatValue() + b.floatValue());
        
        return null;
    }
    
    public <T extends Number > T resta(T a, T b)
    {
        if( a.getClass().equals(Integer.class))
            return (T) new Integer(a.intValue() - b.intValue());
        
        if(a.getClass().equals(Double.class))
            return (T) new Double(a.doubleValue() - b.doubleValue());
        
        if(a.getClass().equals(Float.class))
            return (T) new Float(a.floatValue() - b.floatValue());
        
        return null;
    }
    
    public <T extends Number > T multiplicacion(T a, T b)
    {
        if( a.getClass().equals(Integer.class))
            return (T) new Integer(a.intValue() * b.intValue());
        
        if(a.getClass().equals(Double.class))
            return (T) new Double(a.doubleValue() * b.doubleValue());
        
        if(a.getClass().equals(Float.class))
            return (T) new Float(a.floatValue() * b.floatValue());
        
        return null;
    }
    
    
    public static void main(String[] args) {
        
        Calculadora c = new Calculadora();
        
        System.out.println("la suma es: " + c.sum(1.5, 55));
        System.out.println("la resta es: " + c.resta(24, 15));
        System.out.println("la multiplicación es: " + c.multiplicacion(65, 55));
    }
    
    
}
