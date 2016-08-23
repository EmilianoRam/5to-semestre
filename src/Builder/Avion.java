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
public class Avion {
    
    private String marca;
    private String modelo;
    private int numSerie;
    private Motor motor;
    private Alas alas;

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the numSerie
     */
    public int getNumSerie() {
        return numSerie;
    }

    /**
     * @param numSerie the numSerie to set
     */
    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    /**
     * @return the motor
     */
    public Motor getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    /**
     * @return the alas
     */
    public Alas getAlas() {
        return alas;
    }

    /**
     * @param alas the alas to set
     */
    public void setAlas(Alas alas) {
        this.alas = alas;
    }
    
    
}
