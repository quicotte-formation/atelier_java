/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import java.util.ArrayList;
import java.util.Scanner;
import org.junit.Test;

/**
 *
 * @author Administrateur
 */
public class StructuresDeControle {

    @Test
    public void testDoWhile(){
        
        int n=5;
        int resultat=n;
        do{
            resultat = resultat * (n-1);
            n--;
        }while(n>1);
        System.out.println( resultat );
    }
    
//    @Test
    public void testWhile(){
        
        boolean termine = false;
        while(termine==false){
            
            String choix = new Scanner( System.in ).nextLine();// Saisie clavier
            switch( choix ){
                case "A":
                    this.listerFilms();
                    break;
                case "B":
                    this.ajouterFilm();
                    break;
                case "Q":
                    termine = true;
                    break;
                default:
                    System.out.println("Commande invalide!");
                    break;
            }
        }
    }
    
//    @Test
    public void testFor(){
        
        for(int i=10;i<20;i++){
            
            int carre = i * i;
            
            System.out.println( String.format("%d²=%d", i, carre) );
        }
        
    }
    
//    @Test
    public void testForEach() {

        ArrayList<String> etats = new ArrayList<>();
        
        etats.add( "madagascar" );
        etats.add( "singapour" );
        etats.add( "jamaïque" );
        etats.add( "la barbade" );
        
        for (String etat : etats) {
            System.out.println( etat );
        }
                
    }

    private void listerFilms() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ajouterFilm() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
