/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semaforos;

import static java.lang.Thread.sleep;
import java.util.Random;

/**
 *
 * @author Emiliano
 */
public class Cajero {
    
    void depositar(int cantidad) throws InterruptedException
    {
        System.out.println("El único cajero esta depositando" + cantidad);
        sleep((long) (Math.random()%20000));
        System.out.println("Termie la operacion depositar");
    }
    
    void retirar(int cantidad) throws InterruptedException
    {
        System.out.println("El único cajero esra retirando" + cantidad);
        sleep((long) (Math.random()%20000));
        System.out.println("Termie la operacion retirar");
    }
    
    void getSaldo(int cuenta) throws InterruptedException
    {
        Random r = new Random();
        System.out.println("El saldo de la cuenta: " + cuenta + "es: " + r.nextInt() % 10000 + 1);
        sleep((long) (Math.random()%20000));
        System.out.println("Termie la operacion obtener saldo");
    }
    
    void pagar(int cuenta, int cantidad) throws InterruptedException
    {
        System.out.println("abonando" + cantidad + "a la cuenta" + cuenta);
        sleep((long) (Math.random()%20000));
        System.out.println("Termie la operacion pagar");
    }
}
