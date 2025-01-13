package fr.centrale.tp.note.ds_ochi_doucen;

/**
 * Classe qui représente un joueur
 * @author mathiwoota
 */
public class Joueur {
    
    //attributs
    private String nom;
    private int couleur;
    boolean tour;
    
    //méthodes
    /**
     * Constructeur
     * @param nom
     * @param couleur 
     */
    public Joueur(String nom, int couleur){
       this.nom = nom;
       this.couleur = couleur;
    }
    
    /**
     * 
     * @return 
     */
    public String getNom() {
        return nom;
    }
    
    /**
     * 
     * @param nom 
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    /**
     * 
     * @return 
     */
    public int getCouleur() {
        return couleur;
    }
    
    /**
     * 
     * @param couleur 
     */
    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }
    
    /**
     * 
     * @return 
     */
    public boolean isTour() {
        return tour;
    }
    
    /**
     * 
     * @param tour 
     */
    public void setTour(boolean tour) {
        this.tour = tour;
    }
    
}
