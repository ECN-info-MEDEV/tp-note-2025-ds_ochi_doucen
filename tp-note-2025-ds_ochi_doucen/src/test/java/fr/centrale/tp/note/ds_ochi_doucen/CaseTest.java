package fr.centrale.tp.note.ds_ochi_doucen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaseTest {

    private Case testCase;

    @BeforeEach
    public void setUp() {
        testCase = new Case(1, 2, 0);
    }

    @Test
    public void testGetLigne() {
        assertEquals(1, testCase.getLigne(), "getLigne devrait retourner la ligne correcte");
    }

    @Test
    public void testSetLigne() {
        testCase.setLigne(3);
        assertEquals(3, testCase.getLigne(), "setLigne devrait mettre à jour la ligne");
    }

    @Test
    public void testGetColonne() {
        assertEquals(2, testCase.getColonne(), "getColonne devrait retourner la colonne correcte");
    }

    @Test
    public void testSetColonne() {
        testCase.setColonne(4);
        assertEquals(4, testCase.getColonne(), "setColonne devrait mettre à jour la colonne");
    }

    @Test
    public void testGetEtat() {
        assertEquals(0, testCase.getEtat(), "getEtat devrait retourner l'état correct");
    }

    @Test
    public void testSetEtat() {
        testCase.setEtat(1);
        assertEquals(1, testCase.getEtat(), "setEtat devrait mettre à jour l'état");
    }

    @Test
    public void testConstructor() {
        Case newCase = new Case(5, 6, 1);
        assertEquals(5, newCase.getLigne(), "Le constructeur devrait initialiser la ligne correctement");
        assertEquals(6, newCase.getColonne(), "Le constructeur devrait initialiser la colonne correctement");
        assertEquals(1, newCase.getEtat(), "Le constructeur devrait initialiser l'état correctement");
    }
}
