package com.example.projet_jee.domain;

import javax.persistence.*;

@Entity
@Table(name="Chambre")
public class chambre {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "IDC")
    private int idC;

    @Column(name = "Dispo")
    private String dispo;

    @Column(name = "Nbr")
    private static int nbr;   // nbre de chambre à reservé

    @Column(name = "Prix")
    private static int prixNuité;     // prix de chambre par nuit

    public chambre() {
    }

    public chambre(String dispo,int nbr,int prixNuité) {
        this.dispo = dispo ;
        this.nbr = nbr;
        this.prixNuité=prixNuité;
    }



    // GETTEUR  SETTEUR
    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    public String getDispo() {
        return dispo;
    }

    public void setDispo(String dispo) {
        this.dispo = dispo;
    }

    public static int getNbr() {
        return nbr;
    }

    public void setNbr(int nbr) {
        this.nbr = nbr;
    }

    public static int getPrixNuité() {
        return prixNuité;
    }
    public void setPrixNuité(int prix) {
        this.prixNuité = prix;
    }
}
