/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import java.util.Date;
import m2i.atelierjava.entite.Film;
import org.junit.Test;



/**
 *
 * @author Administrateur
 */
public class FilmTest {
    
    @Test
    public void nouveauFilm(){
        
        Film f1 = new Film();
        Date date = new Date();
        f1.initialise("Dracula", "blabla", 2001, date);
        f1.affiche();
        
        Film f2 = new Film();
        f2.setTitre(  "kung fu panda" );
        f2.setAnneeDeProduction(2010);
        
        System.out.println( f1.getTitre() );
        System.out.println( f2.getTitre() );
        
        Date d = new Date();
    }
}
