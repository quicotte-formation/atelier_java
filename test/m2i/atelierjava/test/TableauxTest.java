/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrateur
 */
public class TableauxTest {
    
    public static int carre(int n){
        return n*n;
    }
    
    @Test
    public void testTabCarre(){
        
        int[][] tab = new int[10][2];
        
        // Crée tab
        for (int i = 0; i < tab.length ; i ++) {
            
            tab[i][0] = i * 10;
            tab[i][1] = TableauxTest.carre(i*10);
        }
        
        // Affiche carré de chaque elem
        for (int[] ligneAct : tab) {
            
            System.out.println(ligneAct[0] + " " + ligneAct[1]);
        }
    }
    
//    @Test
    public void tests(){
        
        String[] tab = new String[] {"abc", "def", "ghi"};
        
        for(int i=2;i<tab.length - 2;i++){
            System.out.println( tab[i] );
        }
        
        tab = new String[] {"123", "456"};
        
        for (String s : tab) {
            System.out.println( s );
        }
    }
}
