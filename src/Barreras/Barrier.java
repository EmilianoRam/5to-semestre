/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barreras;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Emiliano
 */
public class Barrier implements Runnable {
    int id;
    CyclicBarrier b1;
    CyclicBarrier b2;

    public Barrier(int id, CyclicBarrier b1, CyclicBarrier b2) {
        this.id = id;
        this.b1 = b1;
        this.b2 = b2;
    }

    @Override
    public void run() {
        
        try {
            Random r = new Random();
            System.out.println("soy el thread " + id + " estoy realizando mis acciones");
            Thread.sleep(r.nextInt(15000) + 15000);
            System.out.println("soy el thread " + id + ". Terminé y estoy esperando a la barrera uno");
            b1.await();
            System.out.println("thread " + id + "continuo con mis segundas acciones");
            Thread.sleep(r.nextInt(15000) + 15000);
            System.out.println("soy el thread " + id + ". Terminé y estoy esperando a la barrera dos");
            b2.await();
        } catch (InterruptedException ex) {
            
        } catch (BrokenBarrierException ex) {
            
        }
    }
    
}
