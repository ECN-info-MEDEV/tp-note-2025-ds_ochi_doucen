package fr.centrale.tp.note.ds_ochi_doucen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Classe représentant le jeu principal.
 *
 * @author mathiwoota
 */
public class Jeu {
    
    //attributs
    private Plateau plateau;
    private Joueur joueur1;
    private Joueur joueur2;
    
    //méthodes
    /**
     * Constructeur
     * @param nomJoueur1
     * @param nomJoueur2 
     */
    public Jeu(String nomJoueur1, String nomJoueur2) {
        this.plateau = new Plateau();
        this.joueur1 = new Joueur(nomJoueur1, 1); // 1: blanc
        this.joueur2 = new Joueur(nomJoueur2, 2); // 0: noir
        joueur1.setTour(true); // Le joueur 1 commence
        joueur2.setTour(false);
    }

    /**
     * Démarre la boucle de jeu jusqu'à ce qu'une condition de fin soit
     * remplie.
     */
    public void demarrerPartie() {
        System.out.println("Début de la partie !");
        while (!estPartieTerminee()) {
            tourDeJeu();
        }
        afficherResultat();
    }

    /**
     * Gère un tour de jeu pour le joueur actuel.
     */
    public void tourDeJeu() {
        Joueur joueurActuel = getJoueurActuel();
        Joueur joueurOppose = getJoueurOppose();

        System.out.println(joueurActuel.getNom() + ", à vous de jouer.");

        plateau.afficherPlateau();

        boolean mouvementValide = false;
        while (!mouvementValide) {
            int ligne = demanderEntree("Entrez la ligne : ");
            int colonne = demanderEntree("Entrez la colonne : ");

            if (!plateau.mouvementValide(ligne, colonne, joueurActuel.getCouleur(), joueurOppose.getCouleur())) {
                System.out.println("Mouvement invalide, essayez à nouveau.");
            }
        }

        changerTour();
    }

    /**
     * Vérifie si la partie est terminée.
     *
     * @return true si la partie est terminée, false sinon.
     */
    public boolean estPartieTerminee() {
        if (plateau.getNbCasesRemplies() >= 64) {
            return true;
        }

        boolean joueur1Mouvements = plateau.mouvementPossible(joueur1.getCouleur(), joueur2.getCouleur()).size() > 0;
        boolean joueur2Mouvements = plateau.mouvementPossible(joueur2.getCouleur(), joueur1.getCouleur()).size() > 0;

        if (!joueur1Mouvements && !joueur2Mouvements) {
            return true; 
        }
        
        return false;
    }

    /**
     * Affiche le résultat de la partie.
     */
    private void afficherResultat() {
        Joueur vainqueur = obtenirVainqueur();
        if (vainqueur != null) {
            System.out.println("Le vainqueur est : " + vainqueur.getNom());
        } else {
            System.out.println("Match nul !");
        }
    }

    /**
     * Obtient le joueur ayant le score le plus élevé.
     *
     * @return Le joueur vainqueur ou null en cas d'égalité.
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

    /**
     * Change le tour entre les deux joueurs.
     */
    public void changerTour() {
        joueur1.setTour(!joueur1.isTour());
        joueur2.setTour(!joueur2.isTour());
    }

    /**
     * Obtient le joueur dont c'est le tour.
     *
     * @return Le joueur actuel.
     */
    public Joueur getJoueurActuel() {
        return joueur1.isTour() ? joueur1 : joueur2;
    }
    
    /**
     * Obtient le joueur dont le tour est fini.
     * 
     * @return 
     */
    public Joueur getJoueurOppose() {
        return joueur1.isTour() ? joueur2 : joueur1;
    }

    /**
     * Demande une entrée utilisateur et retourne sa valeur.
     *
     * @param message Le message à afficher à l'utilisateur.
     * @return La valeur entrée par l'utilisateur.
     */
    public int demanderEntree(String message) {
        System.out.print(message);
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int choix = 0;
        try {
            choix = Integer.parseInt(br.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("Entree invalide.");
        }
        return choix;
    }

    // Getters et Setters
    /**
     * 
     * @return 
     */
    public Plateau getPlateau() {
        return plateau;
    }
    
    /**
     * 
     * @param plateau 
     */
    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }
    
    /**
     * 
     * @return 
     */
    public Joueur getJoueur1() {
        return joueur1;
    }
    
    /**
     * 
     * @param joueur1 
     */
    public void setJoueur1(Joueur joueur1) {
        this.joueur1 = joueur1;
    }
    
    /**
     * 
     * @return 
     */
    public Joueur getJoueur2() {
        return joueur2;
    }
    
    /**
     * 
     * @param joueur2 
     */
    public void setJoueur2(Joueur joueur2) {
        this.joueur2 = joueur2;
    }
}
