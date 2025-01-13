package fr.centrale.tp.note.ds_ochi_doucen;

/**
 * Classe qui représente une case du plateau de jeu
 * @author mathiwoota
 */
public class Case {
    
    //attributs
    int ligne;
    int colonne;
    int etat;
    
    //méthodes
    /**
     * Constructeur défaut
     * @param l
     * @param c
     * @param e 
     */
    public Case(int l, int c, int e){
        ligne = l;
        colonne = c;
        etat = e;
    }
    
    /**
     * 
     * @return 
     */
    public int getLigne() {
        return ligne;
    }
    
    /**
     * 
     * @param ligne 
     */
    public void setLigne(int ligne) {
        this.ligne = ligne;
    }
    
    /**
     * 
     * @return 
     */
    public int getColonne() {
        return colonne;
    }
    
    /**
     * 
     * @param colonne 
     */
    public void setColonne(int colonne) {
        this.colonne = colonne;
    }
    
    /**
     * 
     * @return 
     */
    public int getEtat() {
        return etat;
    }
    
    /**
     * 
     * @param etat 
     */
    public void setEtat(int etat) {
        this.etat = etat;
    }    
}
