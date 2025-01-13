package fr.centrale.tp.note.ds_ochi_doucen;

import java.util.ArrayList;

/**
 * Classe qui représente un plateau de jeu
 * @author mathi & woota
 */
public class Plateau {

    //attributs
    private Case[][] cases;
    private int nbCasesRemplies;

    //méthodes
    /**
     * Constructeur par défaut
     */
    public Plateau() {
        cases = new Case[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                cases[i][j] = new Case(i,j,0);
            }
        }
        //cases du milieu
        cases[3][3] = new Case(3,3,1);
        cases[4][4] = new Case(4,4,1);
        cases[3][4] = new Case(3,4,2);
        cases[4][3] = new Case(4,3,2);        
    }
    
    
    /**
     * Fonction pour placer un pion si la case est vide
     * @param joueur
     * @param ligne
     * @param colonne 
     */
    public boolean placerPion(Joueur joueur, int ligne, int colonne) {
        //si la case est vide, on place un pion
        if (cases[ligne][colonne].getEtat() == 0) {
            cases[ligne][colonne].setEtat(joueur.getCouleur());
            nbCasesRemplies++;
            joueur.setTour(false);
            return true;
        } else {
            System.out.println("case déjà occupée!");
            return false;
        }
    }
    
    
    
    /**
     * Fonction pour verifier si un joueur peut jouer sur une case donnée
     * @param i
     * @param j
     * @param couleurCourante
     * @param couleurOpposee
     * @return 
     */
    public boolean mouvementValide(int i, int j, int couleurCourante, int couleurOpposee){
        int ligne;
        int colonne;
        boolean valide = false;
        
        //verif sud
        ligne = i;
        colonne = j;
        while ((ligne < 7) && (cases[ligne][colonne].getEtat() == couleurOpposee)){
            ligne ++;
        }
        if (cases[ligne][colonne].getEtat() == couleurCourante){
            valide = true;
        }
        
        //verif nord
        ligne = i;
        colonne = j;
        while ((ligne > 1) && (cases[ligne][colonne].getEtat() == couleurOpposee)){
            ligne --;
        }
        if (cases[ligne][colonne].getEtat() == couleurCourante){
            valide = true;
        }
        
        //verif est
        ligne = i;
        colonne = j;
        while ((colonne < 7) && (cases[ligne][colonne].getEtat() == couleurOpposee)){
            colonne ++;
        }
        if (cases[ligne][colonne].getEtat() == couleurCourante){
            valide = true;
        }
        
        //verif ouest
        ligne = i;
        colonne = j;
        while ((colonne > 1) && (cases[ligne][colonne].getEtat() == couleurOpposee)){
            colonne --;
        }
        if (cases[ligne][colonne].getEtat() == couleurCourante){
            valide = true;
        }
        return valide;
    }
    
    
    
    /**
     * Fonction qui renvoie la liste des mouvements possibles pour un joueur donné
     * @param couleurCourante
     * @param couleurOpposee
     * @return 
     */
    public ArrayList<Case> mouvementPossible(int couleurCourante, int couleurOpposee){
        ArrayList<Case> res = new ArrayList<>();
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if (mouvementValide(i,j,couleurCourante,couleurOpposee)){
                    res.add(cases[i][j]);
                }
            }
        }
        return res;
    }
    
    
    /**
     * Fonction pour afficher le plateau
     */
    public void afficherPlateau(){
        for (int i = 0; i < 8; i++) {
            System.out.print("-");
        }
        System.out.println("");
        for (int i = 0; i < 8; i++) {
            System.out.print("-");
            for (int j = 0; j < 8; j++){
                System.out.print(cases[i][j].getEtat());
            }
            System.out.print("-");
            System.out.println("");
        }
        for (int i = 0; i < 8; i++) {
            System.out.print("-");
        }
        System.out.println("");
    }
    
    /**
     * fonction qui calcule le score d'un joueur donné
     * @param joueur
     * @return 
     */
    public int getScore(Joueur joueur){
        return 0;
    }
    
    /**
     * 
     * @return 
     */
    public Case[][] getCases() {
        return cases;
    }
    
    /**
     * 
     * @param cases 
     */
    public void setCases(Case[][] cases) {
        this.cases = cases;
    }
    
    /**
     * 
     * @return 
     */
    public int getNbCasesRemplies() {
        return nbCasesRemplies;
    }
    
    /**
     * 
     * @param nbCasesRemplies 
     */
    public void setNbCasesRemplies(int nbCasesRemplies) {
        this.nbCasesRemplies = nbCasesRemplies;
    }
}
