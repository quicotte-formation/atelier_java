/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import org.junit.Test;

/**
 *
 * @author Administrateur
 */
public class StructuresDeControle {

    @Test
    public void test() {

        String a = "madagascar";
        String b = "singapour";
        String c = "jamaïque";
        String d ="la barbade";
        
        if( (a.equals(b) && a.equals(c)) ||
            (b.equals(c) && c.equals(d))  ){
            // Au moins 2 objets ont la même valeur
        }
                
    }
}
