package fr.centrale.tp.note.ds_ochi_doucen;

/**
 *
 * @author mathi & woota
 */
public class Joueur {
    
    //attributs
    private String nom;
    private int couleur;
    boolean tour;
    
    //méthodes

    public Joueur(String nom, int couleur){
       this.nom = nom;
       this.couleur = couleur;
    
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCouleur() {
        return couleur;
    }

    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }

    public boolean isTour() {
        return tour;
    }

    public void setTour(boolean tour) {
        this.tour = tour;
    }
    
}
