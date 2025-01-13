package fr.centrale.tp.note.ds_ochi_doucen;

/**
 * Classe qui représente un plateau de jeu
 * @author mathi & woota
 */
public class Plateau {

    //attributs
    private Cases[][] cases;
    private int nbCasesRemplies;

    //méthodes
    /**
     * Constructeur par défaut
     */
    public Plateau() {
        cases = new Cases[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                cases[i][j].setEtat(0);
            }
        }
    }
    
    /**
     * Fonction pour placer un pion si la case est vide
     * @param joueur
     * @param ligne
     * @param colonne 
     */
    public void placerPion(Joueur joueur, int ligne, int colonne) {
        //si la case est vide, on place un pion
        if (cases[ligne][colonne].getEtat() == 0) {
            cases[ligne][colonne].setEtat(joueur.getCouleur());
            nbCasesRemplies++;
            joueur.setTour(false);
        } else {
            System.out.println("case déjà occupée!");
        }
    }
    
    public 
    
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
     * 
     * @return 
     */
    public int[][] getCases() {
        return cases;
    }
    
    /**
     * 
     * @param cases 
     */
    public void setCases(int[][] cases) {
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
