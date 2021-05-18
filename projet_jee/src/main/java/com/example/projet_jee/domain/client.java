package com.example.projet_jee.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name ="Client")

public class client {

    @Id    //indiquant clÃ© primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY)    //il s'agit d'un auto increment
    @Column(name = "CIN")   //nom de la colonne
    private int cin;

    @Column(name = "Nom")
    private String nom;

    @Column(name = "Prénom")
    private String prenom;

    @Column(name = "Email")
    private String email;

    @Column(name = "Adresse")
    private String adresse;

    @Column(name = "Num_tel")
    private long num_tel;

    @Column(name = "Date_naiss")
    private LocalDate date_naiss;

    public client(){}

    public client(String nom, String prenom, String email, String adresse, long num, LocalDate date) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.adresse = adresse;
        num_tel = num;
        date_naiss = date;
    }
    // GETTEUR et SETTEUR
    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public LocalDate getDate_naiss() {
        return date_naiss;
    }

    public void setDate_naiss(LocalDate date_naiss) {
        this.date_naiss = date_naiss;
    }

    public long getNum_tel() {
        return num_tel;
    }

    public void setNum_tel(long num_tel) {
        this.num_tel = num_tel;
    }

    @Override
    public String toString() {
        return "Client [CIN = " + cin + ", NOM = " + nom + ", PRENOM= " + prenom + ", email= " + email +", date de naissance: "
                + date_naiss +", Adresse: " + adresse + ", Num telephone: " + num_tel + "]";
    }



}


