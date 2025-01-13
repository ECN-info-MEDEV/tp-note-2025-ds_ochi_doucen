package fr.centrale.tp.note.ds_ochi_doucen;

/**
 * Classe représentant le jeu principal.
 * 
 * @author mathi & woota
 */
public class Jeu {

    // Attributs
    private Plateau plateau;
    private Joueur joueur1;
    private Joueur joueur2;

    // Constructeur
    public Jeu(String nomJoueur1, String nomJoueur2) {
        this.plateau = new Plateau();
        this.joueur1 = new Joueur(nomJoueur1, 0); 
        this.joueur2 = new Joueur(nomJoueur2, 1); 
    }

    // Méthodes

    /**
     * Démarre la partie et initialise les composants.
     */
    public void demarrerPartie() {
        System.out.println("La partie commence entre " + joueur1.getNom() + " (Noir) et " + joueur2.getNom() + " (Blanc).");
        plateau.afficherPlateau();
        joueur1.setTour(true); // Le joueur 1 commence
    }

    /**
     * Gère les tours des joueurs jusqu'à la fin de la partie.
     */
    public void tourDeJeu() {

        while (!estPartieTerminee()) {
            if (joueur1.isTour()) {
                System.out.println(joueur1.getNom() + ", à vous de jouer.");
                // Logique pour le tour du joueur 1
                joueur1.setTour(false);
                joueur2.setTour(true);
            } else {
                System.out.println(joueur2.getNom() + ", à vous de jouer.");
                // Logique pour le tour du joueur 2
                joueur1.setTour(true);
                joueur2.setTour(false);
            }

            plateau.afficherPlateau();
        }

        Joueur vainqueur = obtenirVainqueur();
        if (vainqueur != null) {
            System.out.println("Le vainqueur est : " + vainqueur.getNom());
        } else {
            System.out.println("Match nul !");
        }
    }

    /**
     * Vérifie si la partie est terminée.
     * @return true si la partie est terminée, sinon false
     */
    public boolean estPartieTerminee() {
    // Si toutes les cases sont remplies, la partie est terminée
    if (this.plateau.getNbCasesRemplies() >= 60 || this.plateau.mouvementPossibles().isEmpty()) return true;
   
    else return false;
}


    /**
     * Détermine le vainqueur de la partie.
     * @return le joueur gagnant ou null en cas de match nul
     */
    public Joueur obtenirVainqueur() {
        
        int scoreJoueur1 = plateau.getScore(joueur1);
        int scoreJoueur2 = plateau.getScore(joueur2);

        if (scoreJoueur1 > scoreJoueur2) {
            return joueur1;
        } else if (scoreJoueur2 > scoreJoueur1) {
            return joueur2;
        } else {
            return null; // Match nul
        }
      
    }
}

    