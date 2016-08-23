/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author Emiliano
 */
public class BoeingBuilder extends Builder {

    @Override
    void buildAlas() {
        
        Alas alas = new Alas();
        alas.setHiper(5);
        alas.setMarca("Windstore");
        alas.setNumSerie(123542);
        alas.setSpoiler(10);
        avion.setAlas(alas);
    }

    @Override
    void buildMotor() {
        
        Motor motor = new Motor();
        motor.setNumSerie(1234567);
        motor.setPotencia(1450);
        avion.setMotor(motor);
        
    }

    @Override
    void buildMarca() {
        
        avion.setMarca("Boeing");
        
    }

    @Override
    void buildnumSerie() {
        
        avion.setNumSerie(1234567);
        
    }

    @Override
    void buildModelo() {
        
        avion.setModelo("747");
      
    }
    
}
