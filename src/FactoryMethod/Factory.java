/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author Emiliano
 */
public abstract class Factory {
    
   protected abstract Computer factoryMethod(String tipoCompu);
   
   public Computer createCompu(String tipoCompu)
    {
       Computer c = factoryMethod(tipoCompu);
       c.configurar();
       c.ensamblar();
       c.instalarS();
       c.embalar();
       
       return c;
        
    }
   
   static Factory getInstance()
   {
       if(singleton == null)
       {
           singleton = new Factory()
           {
               @Override
               protected Computer factoryMethod
           }
       }
   }
    
}
