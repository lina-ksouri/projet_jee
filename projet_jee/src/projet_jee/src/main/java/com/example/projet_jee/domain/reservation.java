package com.example.projet_jee.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name = "Reservation")
public class reservation {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "IDR")
    private int idr;

    @Column(name="dateDebut")
    private LocalDate dateDebut;

    @Column(name="dateFin")
    private LocalDate dateFin;

    @Transient
    private float montantPaye;
    public reservation() {
    }

    public reservation( LocalDate dateDebut, LocalDate dateFin) {
        this.dateDebut = dateDebut ;
        this.dateFin = dateFin;
    }
    // GETTEUR  SETTEUR
    public int getIdr() {
        return idr;
    }

    public void setIdr(int idr) {
        this.idr = idr;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public float getMontantPaye() {
        return (chambre.getNbr()*(Period.between(this.dateDebut,this.dateFin).getDays())*chambre.getPrixNuité());
    }

    public void setMontantPaye(float montantPaye) {
        this.montantPaye = montantPaye;
    }

}
