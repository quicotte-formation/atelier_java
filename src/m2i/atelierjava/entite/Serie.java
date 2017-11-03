/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

/**
 *
 * @author Administrateur
 */
public class Serie {
    
    private String titre;
    private int anneeSortie;
    private int nbSaisons;
    private String synopsis;

    public void initialise(String titre, String synopsis, int nbSaisons, int anneeSortie){
        
        this.titre = titre;
        this.synopsis = synopsis;
        this.nbSaisons = nbSaisons;
        this.anneeSortie = anneeSortie;
    }
    
    public void affiche(){
        
        System.out.println( this.titre + " " + anneeSortie + " " + synopsis + " " + nbSaisons );
    }
    
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAnneeSortie() {
        return anneeSortie;
    }

    public void setAnneeSortie(int anneeSortie) {
        this.anneeSortie = anneeSortie;
    }

    public int getNbSaisons() {
        return nbSaisons;
    }

    public void setNbSaisons(int nbSaisons) {
        this.nbSaisons = nbSaisons;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public void initialise(String dexter, int i, String blablabla, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
