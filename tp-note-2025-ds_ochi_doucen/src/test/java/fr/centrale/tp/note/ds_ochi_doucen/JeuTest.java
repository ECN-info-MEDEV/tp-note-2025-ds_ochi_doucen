package fr.centrale.tp.note.ds_ochi_doucen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Jeu.
 */
public class JeuTest {

    private Jeu jeu;
    private Joueur joueur1;
    private Joueur joueur2;
    private Plateau plateau;

    @BeforeEach
    public void setUp() {
        jeu = new Jeu("Alice", "Bob");
        joueur1 = jeu.getJoueur1();
        joueur2 = jeu.getJoueur2();
        plateau = jeu.getPlateau();
    }

    @Test
    public void testInitialisation() {
        assertEquals("Alice", joueur1.getNom(), "Le nom du joueur1 devrait être Alice");
        assertEquals("Bob", joueur2.getNom(), "Le nom du joueur2 devrait être Bob");
        assertEquals(1, joueur1.getCouleur(), "La couleur du joueur1 devrait être 1 (blanc)");
        assertEquals(2, joueur2.getCouleur(), "La couleur du joueur2 devrait être 2 (noir)");
        assertTrue(joueur1.isTour(), "Le joueur1 devrait commencer la partie");
        assertFalse(joueur2.isTour(), "Le joueur2 ne devrait pas commencer la partie");
    }

    @Test
    public void testChangerTour() {
        assertTrue(joueur1.isTour(), "Le joueur1 devrait avoir le tour initialement");
        assertFalse(joueur2.isTour(), "Le joueur2 ne devrait pas avoir le tour initialement");

        jeu.changerTour();

        assertFalse(joueur1.isTour(), "Après changerTour, le joueur1 ne devrait plus avoir le tour");
        assertTrue(joueur2.isTour(), "Après changerTour, le joueur2 devrait avoir le tour");
    }

    @Test
    public void testGetJoueurActuel() {
        assertEquals(joueur1, jeu.getJoueurActuel(), "Le joueur actuel devrait être le joueur1");
        jeu.changerTour();
        assertEquals(joueur2, jeu.getJoueurActuel(), "Après changerTour, le joueur actuel devrait être le joueur2");
    }

    @Test
    public void testGetJoueurOppose() {
        assertEquals(joueur2, jeu.getJoueurOppose(), "Le joueur opposé devrait être le joueur2 lorsque le joueur1 a le tour");
        jeu.changerTour();
        assertEquals(joueur1, jeu.getJoueurOppose(), "Le joueur opposé devrait être le joueur1 lorsque le joueur2 a le tour");
    }

    @Test
    public void testEstPartieTerminee() {
        // Initialement, la partie ne devrait pas être terminée
        assertFalse(jeu.estPartieTerminee(), "La partie ne devrait pas être terminée initialement");

        // Remplir le plateau
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                plateau.placerPion(joueur1, i, j);
            }
        }
        assertTrue(jeu.estPartieTerminee(), "La partie devrait être terminée lorsque le plateau est rempli");
    }

    @Test
    public void testObtenirVainqueur() {
        // Placer des pions : joueur1 a 3, joueur2 a 2
        plateau.placerPion(joueur1, 0, 0);
        plateau.placerPion(joueur1, 0, 1);
        plateau.placerPion(joueur1, 0, 2);
        plateau.placerPion(joueur2, 1, 0);
        plateau.placerPion(joueur2, 1, 1);

        Joueur vainqueur = jeu.obtenirVainqueur();
        assertEquals(joueur1, vainqueur, "Le joueur1 devrait être le vainqueur");

    }
}
