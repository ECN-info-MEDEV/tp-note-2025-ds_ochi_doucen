/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package fr.centrale.tp.note.ds_ochi_doucen;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author woota
 */
public class PlateauTest {

    public PlateauTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of placerPion method, of class Plateau.
     */
    @Test
    public void testPlacerPion() {
        System.out.println("placerPion");
        Joueur joueur = null;
        Jeu j = new Jeu("mathieu","tatsuya");
        j.demarrerPartie();
        int ligne = 0;
        int colonne = 0;
        Plateau instance = new Plateau();
        boolean expResult = false;
        boolean result = instance.placerPion(joueur, ligne, colonne);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of mouvementValide method, of class Plateau.
     */
    @Test
    public void testMouvementValide() {
        System.out.println("mouvementValide");
        int i = 0;
        int j = 0;
        int couleurCourante = 1;
        int couleurOpposee = 2;
        Plateau instance = new Plateau();
        boolean expResult = false;
        boolean result = instance.mouvementValide(i, j, couleurCourante, couleurOpposee);
        assertEquals(expResult, result);
    }

    /**
     * Test of mouvementPossible method, of class Plateau.
     */
    @Test
    public void testMouvementPossible() {
        System.out.println("mouvementPossible");
        int couleurCourante = 1;
        int couleurOpposee = 2;
        Plateau instance = new Plateau();
        ArrayList<Case> expResult = null;
        ArrayList<Case> result = instance.mouvementPossible(couleurCourante, couleurOpposee);
        assertEquals(expResult, result);

    }

    /**
     * Test of afficherPlateau method, of class Plateau.
     */
    @Test
    public void testAfficherPlateau() {
        System.out.println("afficherPlateau");
        Plateau instance = new Plateau();
        instance.afficherPlateau();
    }

    /**
     * Test of getScore method, of class Plateau.
     */
    @Test
    public void testGetScore() {
        System.out.println("getScore");
        Joueur joueur = null;
        Plateau instance = new Plateau();
        int expResult = 0;
        int result = instance.getScore(joueur);
        assertEquals(expResult, result);
       
    }


    /**
     * Test of setCases method, of class Plateau.
     */
    @Test
    public void testSetCases() {
        System.out.println("setCases");
        Case[][] cases = null;
        Plateau instance = new Plateau();
        instance.setCases(cases);
        
    }

    /**
     * Test of getNbCasesRemplies method, of class Plateau.
     */
    @Test
    public void testGetNbCasesRemplies() {
        System.out.println("getNbCasesRemplies");
        Plateau instance = new Plateau();
        int expResult = 4;
        int result = instance.getNbCasesRemplies();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNbCasesRemplies method, of class Plateau.
     */
    @Test
    public void testSetNbCasesRemplies() {
        System.out.println("setNbCasesRemplies");
        int nbCasesRemplies = 0;
        Plateau instance = new Plateau();
        instance.setNbCasesRemplies(nbCasesRemplies);
        
    }

}
