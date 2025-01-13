/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.centrale.tp.note.ds_ochi_doucen;

/**
 *
 * @author woota
 */
public class Jeu {
    
    private Plateau plateau;
    private Joueur joueurCourant;
    
    public Jeu(){
    
        this.plateau  = new Plateau();
        this.plateau  = new Joueur();
           
    }
    
    public void demarrerPartie(){
    
        
    
    }
    
    
    public boolean estPartieTerminee(){
    
    
    } 
    
    
    public Joueur obtenirVainquer(){
    
    
    }
    
   
    

    public Plateau getPlateau() {
        return plateau;
    }

    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }

    public Joueur getJoueurCourant() {
        return joueurCourant;
    }

    public void setJoueurCourant(Joueur joueurCourant) {
        this.joueurCourant = joueurCourant;
    }
    
       
    
}
