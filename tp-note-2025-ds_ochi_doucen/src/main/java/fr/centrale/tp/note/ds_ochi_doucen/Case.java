/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.centrale.tp.note.ds_ochi_doucen;

/**
 *
 * @author mathi
 */
public class Case {
    
    //attributs
    int ligne;
    int colonne;
    int etat;
    
    //méthodes
    public Case(int l, int c, int e){
        ligne = l;
        colonne = c;
        etat = e;
    }
    
    public int getLigne() {
        return ligne;
    }

    public void setLigne(int ligne) {
        this.ligne = ligne;
    }

    public int getColonne() {
        return colonne;
    }

    public void setColonne(int colonne) {
        this.colonne = colonne;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }    
}
