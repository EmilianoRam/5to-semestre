/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filosofos;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Emiliano
 */
public class Test {
    
    public static void main(String[] args)
    {
        Semaphore cuchillo;
        Semaphore tenedor;
        Semaphore mesa;
        
        cuchillo = new Semaphore(4);
        tenedor = new Semaphore(2);
        mesa = new Semaphore(4);
        
        Filosofo[] fs = new Filosofo[15];
        
        for(int i = 0; i < 15; i++)
        {
            fs[i] = new Filosofo(mesa, cuchillo, tenedor, i+1);
            fs[i].start();
        }
    }
     
    
}
