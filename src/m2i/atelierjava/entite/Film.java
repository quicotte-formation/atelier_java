/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

import java.util.Date;

/**
 *
 * @author Administrateur
 */
public class Film {
    
    private String titre;
    private String synopsis;
    private int anneeDeProduction;
    private Date dateCreation;

    public void affiche(){
        
        System.out.println( String.format("Film: titre=%s synopsis=%s %d %s", this.titre, this.synopsis, this.anneeDeProduction, this.dateCreation) );
        // Equivalent de "Film: " + this.titre + " " + this.synopsis ...
    }
    
    public void initialise(String titre, String synop, int annee, Date dateCrea){
        
        this.titre = titre;
        this.synopsis = synop;
        this.anneeDeProduction = annee;
        this.dateCreation = dateCrea;
    }
    
    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAnneeDeProduction() {
        return anneeDeProduction;
    }

    public void setAnneeDeProduction(int anneeDeProduction) {
        this.anneeDeProduction = anneeDeProduction;
    }

    
}
