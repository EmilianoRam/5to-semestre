/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

/**
 *
 * @author Emiliano
 */
public class AppBuilder extends Builder {

    @Override
    void buildJuegos() {
        Juegos juegos =  new Juegos();
        juegos.setNombre("GT");
        juegos.setVersion(4.1);
        juegos.setTipo("accion");
        app.setJuegos(juegos);
    }

    @Override
    void buildFitness() {
        Fitness fitness = new Fitness();
        fitness.setNombre("Gym");
        fitness.setVersion(5.0);
        fitness.setTipo("muscle");
        app.setFitness(fitness);
        
    }

    @Override
    void BuildIdiomas() {
        Idiomas idiomas = new Idiomas();
        idiomas.setNombre("app3");
        idiomas.setVersion(4.0);
        idiomas.setTipo("idiomas");
        app.setIdiomas(idiomas);
    }

    @Override
    void BuildMusica() {
        Musica musica = new Musica();
        musica.setNombre("app4");
        musica.setVersion(1.0);
        musica.setTipo("musica");
        app.setMusica(musica);
        
    }
    
}