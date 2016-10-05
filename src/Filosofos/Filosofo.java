/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filosofos;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Emiliano
 */
public class Filosofo extends Thread {
    
    Semaphore cuchillo;
    Semaphore tenedor;
    Semaphore mesa;
    int id;
    
    public Filosofo(Semaphore cuchillo, Semaphore tenedor, Semaphore mesa, int id)
    {
        this.cuchillo = cuchillo;
        this.tenedor = tenedor;
        this.mesa = mesa;
        this.id = id;
    }
    
    @Override
    public void run()
    {
        try {
            cuchillo.acquire();
            System.out.println("filosofo " + id + "obtuve el cuchillo");
            tenedor.acquire();
            System.out.println("filosofo " + id + "obtuve el tenedor");
            mesa.acquire();
            System.out.println("Soy el filosofo " + id + "y estoy sentado en la mesa");
            
            comer();
            
            tenedor.release();
            cuchillo.release();
            mesa.release();
        } catch (InterruptedException ex) {
            
            System.out.println("la excepcion " + ex.toString());
        }
      
    }   
    
    private void comer()
    {
        try{
        System.out.println("Soy el filosofo " + id + " y estoy comiendo");
        sleep((long) (Math.random()% 15000 + 15000));
            System.out.println("Soy el filosofo " + id + "y termine de comer");
        }catch(InterruptedException ex)
        {
            
        }
    }
}
