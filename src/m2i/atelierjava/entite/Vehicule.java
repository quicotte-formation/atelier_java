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
public class Vehicule {
    
    protected String marque;
    protected boolean utilitaire;
    protected String modele;
    protected String couleur;
    protected int nbPlaces;
    protected int x, y, z;
    protected int pas;
    
    public Vehicule(){
        
    }

    public Vehicule(String marque, boolean utilitaire, String modele, String couleur, int nbPlaces, int x, int y, int z, int vitesse) {
        this.marque = marque;
        this.utilitaire = utilitaire;
        this.modele = modele;
        this.couleur = couleur;
        this.nbPlaces = nbPlaces;
        this.x = x;
        this.y = y;
        this.z = z;
        this.pas = vitesse;
    }

    public int getPas() {
        return pas;
    }

    public void setPas(int pas) {
        this.pas = pas;
    }
    
    
    
    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public boolean isUtilitaire() {
        return utilitaire;
    }

    public void setUtilitaire(boolean utilitaire) {
        this.utilitaire = utilitaire;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    
    
    
    public void afficher(){
        
        String txt = String.format(
                "Véhicule: marque=%s utilitaire=%s modele=%s couleur=%s places=%d (%d,%d,%d,pas=%d) ", 
                this.marque, 
                this.utilitaire,
                this.modele,
                this.couleur,
                this.nbPlaces,
                this.x,
                this.y,
                this.z,
                this.pas);
        
        System.out.println(txt);
    }
    
    public void reculer(){
        
        z = z - pas;
    }
    
    public void avancer(){
        
        z = z + pas;
    }
}
