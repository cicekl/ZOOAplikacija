/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import java.util.Date;

/**
 *
 * @author Lorena
 */
@Entity
public class Zivotinja extends Entitet{
    
    private int minimalnaKvadratura;
    private int minimalnaKubikaza;
    private String zivotinjskaVrsta;
    private String vrsta;
    private String ime;
    private Date datumRodenja;
    private Date datumDolaska;
    private Date datumSmrti;
    @ManyToOne
    private Djelatnik djelatnik;
    @ManyToOne
    private Prostorija prostorija;

    public int getMinimalnaKvadratura() {
        return minimalnaKvadratura;
    }

    public void setMinimalnaKvadratura(int minimalnaKvadratura) {
        this.minimalnaKvadratura = minimalnaKvadratura;
    }

    public int getMinimalnaKubikaza() {
        return minimalnaKubikaza;
    }

    public void setMinimalnaKubikaza(int minimalnaKubikaza) {
        this.minimalnaKubikaza = minimalnaKubikaza;
    }

    public String getZivotinjskaVrsta() {
        return zivotinjskaVrsta;
    }

    public void setZivotinjskaVrsta(String zivotinjskaVrsta) {
        this.zivotinjskaVrsta = zivotinjskaVrsta;
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public Date getDatumRodenja() {
        return datumRodenja;
    }

    public void setDatumRodenja(Date datumRodenja) {
        this.datumRodenja = datumRodenja;
    }

    public Date getDatumDolaska() {
        return datumDolaska;
    }

    public void setDatumDolaska(Date datumDolaska) {
        this.datumDolaska = datumDolaska;
    }

    public Date getDatumSmrti() {
        return datumSmrti;
    }

    public void setDatumSmrti(Date datumSmrti) {
        this.datumSmrti = datumSmrti;
    }

    public Djelatnik getDjelatnik() {
        return djelatnik;
    }

    public void setDjelatnik(Djelatnik djelatnik) {
        this.djelatnik = djelatnik;
    }

    public Prostorija getProstorija() {
        return prostorija;
    }

    public void setProstorija(Prostorija prostorija) {
        this.prostorija = prostorija;
    }

    public Zivotinja() {
        super();
    }

    public Zivotinja(int minimalnaKvadratura, int minimalnaKubikaza, String zivotinjskaVrsta, String vrsta, String ime, Date datumRodenja, Date datumDolaska, Date datumSmrti, Djelatnik djelatnik, Prostorija prostorija, int sifra) {
        super(sifra);
        this.minimalnaKvadratura = minimalnaKvadratura;
        this.minimalnaKubikaza = minimalnaKubikaza;
        this.zivotinjskaVrsta = zivotinjskaVrsta;
        this.vrsta = vrsta;
        this.ime = ime;
        this.datumRodenja = datumRodenja;
        this.datumDolaska = datumDolaska;
        this.datumSmrti = datumSmrti;
        this.djelatnik = djelatnik;
        this.prostorija = prostorija;
    }
    
    
}
