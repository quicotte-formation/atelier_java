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
public class VariablesTest {

//    @Test
    public void test4(){
        
        System.out.println( carre(9) );
    }
    
    @Test
    public void testConcatene(){
        
        String a = "maison";
        String b = "blanche";
        
        String c = concatene(a, b);
        
        System.out.println( c );
    }
    
    public String concatene( String a, String b ){
        
        String c = a + " " + b;
        
        return c;
    }
    
    public int carre(int nb){
        
        int res = nb * nb;
        
        return res;
    }
    
    public String concateneEtInverse(String a, String b){
        
        String res = b + " " + a;
        
        return res;
    }
    
//    @Test
    public void testEx3() {

        
        String a = "123";
    }
    
//    @Test
    public void testEx2() {

        
        int a = 123;
        String b = "coucou";
        String c = a + b;
        String d = b + a;
        
        System.out.println(c);
        System.out.println(d);
    }

//    @Test
    public void testConceneKingstonEtJamaique() {

        String a = "Jamaique";
        String b = "kingston";
        String c = b.toUpperCase() + ", " + a.toUpperCase();

        System.out.println(c);
    }

//    @Test
    public void testVariablesObjets() {

        int i;
        char a = 'a';

        String txt1 = new String("Rèpèter" + " après moi");

        System.out.println(txt1);
    }
}
