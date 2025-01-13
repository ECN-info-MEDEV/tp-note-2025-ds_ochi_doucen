package fr.centrale.tp.note.ds_ochi_doucen;

/**
 *
 * @author mathi & woota
 */
public class Plateau {

    //attributs
    private int[][] cases;
    private int nbCasesRemplies;

    //méthodes
    /**
     * Constructeur par défaut
     */
    public Plateau() {
        cases = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                cases[i][j] = 0;
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
        if (cases[ligne][colonne] == 0) {
            cases[ligne][colonne] = joueur.couleur;
            nbCasesRemplies++;
            joueur.tour = false;
        } else {
            System.out.println("case déjà occupée!");
        }
    }
    
    /**
     * Fonction pour afficher le plateau
     */
    public void afficherPlateau(){
        for (int i = 0; i < 8; i++) {
            System.out.print("-");
        }
        for (int i = 0; i < 8; i++) {
            System.out.print("-");
            for (int j = 0; j < 8; j++){
                System.out.print(cases[i][j]);
            }
            System.out.print("-");
            System.out.println("");
        }
        for (int i = 0; i < 8; i++) {
            System.out.print("-");
        }
    }

}
