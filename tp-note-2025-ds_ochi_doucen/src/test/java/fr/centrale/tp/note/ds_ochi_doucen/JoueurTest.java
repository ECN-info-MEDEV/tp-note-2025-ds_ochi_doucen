package fr.centrale.tp.note.ds_ochi_doucen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JoueurTest {

    private Joueur joueur;

    @BeforeEach
    public void setUp() {
        joueur = new Joueur("Alice", 1);
    }

    @Test
    public void testGetNom() {
        assertEquals("Alice", joueur.getNom(), "getNom devrait retourner le nom correct");
    }

    @Test
    public void testSetNom() {
        joueur.setNom("Bob");
        assertEquals("Bob", joueur.getNom(), "setNom devrait mettre à jour le nom");
    }

    @Test
    public void testGetCouleur() {
        assertEquals(1, joueur.getCouleur(), "getCouleur devrait retourner la couleur correcte");
    }

    @Test
    public void testSetCouleur() {
        joueur.setCouleur(0);
        assertEquals(0, joueur.getCouleur(), "setCouleur devrait mettre à jour la couleur");
    }

    @Test
    public void testIsTour() {
        joueur.setTour(true);
        assertTrue(joueur.isTour(), "isTour devrait retourner true lorsque tour est défini à true");
        joueur.setTour(false);
        assertFalse(joueur.isTour(), "isTour devrait retourner false lorsque tour est défini à false");
    }

    @Test
    public void testSetTour() {
        joueur.setTour(true);
        assertTrue(joueur.isTour(), "setTour devrait définir tour à true");
    }

    @Test
    public void testConstructor() {
        Joueur newJoueur = new Joueur("Charlie", 0);
        assertEquals("Charlie", newJoueur.getNom(), "Le constructeur devrait initialiser le nom correctement");
        assertEquals(0, newJoueur.getCouleur(), "Le constructeur devrait initialiser la couleur correctement");
        assertFalse(newJoueur.isTour(), "Le constructeur devrait initialiser tour à false par défaut");
    }
}
