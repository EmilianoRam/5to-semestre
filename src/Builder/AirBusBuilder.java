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
public class AirBusBuilder extends Builder {

    @Override
    void buildAlas() {
        
        Alas a = new Alas();
        a.setHiper(2);
        a.setMarca("WindsArmy");
        a.setNumSerie(6764);
        a.setSpoiler(4);
        avion.setAlas(a);
        
    }

    @Override
    void buildMotor() {
        
        Motor m = new Motor();
        m.setNumSerie(56789);
        m.setPotencia(1000);
        avion.setMotor(m);
        
    }

    @Override
    void buildMarca() {
        
        avion.setMarca("airbus");
        
    }

    @Override
    void buildnumSerie() {
        
        avion.setNumSerie(67890);
        
    }

    @Override
    void buildModelo() {
        
        avion.setModelo("A380");
    }
    
}
