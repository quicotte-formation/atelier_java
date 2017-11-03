/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import m2i.atelierjava.entite.Serie;
import org.junit.Test;

/**
 *
 * @author Administrateur
 */
public class SerieTest {
    
    @Test
    public void afficheOK(){
        
        Serie s1 = new Serie();
        s1.initialise("Dexter", 2010, "blablabla", 8);
//        s1.setTitre("Dexter");
//        s1.setAnneeSortie(2010);
//        s1.setSynopsis("blabla");
//        s1.setNbSaisons(8);
        s1.affiche();
        
        Serie s2 = new Serie();
        s2.setTitre("Game of thrones");
        s2.setAnneeSortie(2012);
        s2.setSynopsis("blabla");
        s2.setNbSaisons(7);
        s2.affiche();
    }
}
