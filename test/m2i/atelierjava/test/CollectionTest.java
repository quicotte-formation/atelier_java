/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import m2i.atelierjava.entite.Film;
import org.junit.Test;

/**
 *
 * @author Administrateur
 */
public class CollectionTest {
    
    @Test
    public void testSommeListFranceBelgiquePlusListeEspItTotal4OK(){
        
        List<String> listeFrBe = new ArrayList<>();
        listeFrBe.add("France");
        listeFrBe.add("Belgique");
        
        List<String> listeEspIt = new ArrayList<>();
        listeEspIt.add("Espagne");
        listeEspIt.add("Italie");
        
        List<String> listeTotale = new ArrayList<>();
        listeTotale.addAll(listeFrBe);
        listeTotale.addAll(listeEspIt);
        
        int nbElem = listeTotale.size();
        Assert.assertEquals(4, nbElem);
        
    }
    
    @Test
    public void testList(){
        
        List<String> listeFilms = new ArrayList<>();
        
        listeFilms.add("Dracula");
        listeFilms.add("Matrix");
        listeFilms.add("Winnie l'ourson");
        
        List<String> nouveauxFilms = new ArrayList<>();
        nouveauxFilms.add("Matrix 2");
        nouveauxFilms.add("Dracula 2000");
       
        
        listeFilms.addAll(nouveauxFilms);
        listeFilms.add(2, "Razmoket");
        System.out.println( listeFilms.size() );
//        for (String film : listeFilms) {
//            
//            System.out.println( film );
//        }
    }
}
