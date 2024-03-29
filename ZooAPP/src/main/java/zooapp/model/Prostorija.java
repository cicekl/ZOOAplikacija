/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zooapp.model;

import jakarta.persistence.Entity;

/**
 *
 * @author Lorena
 */
@Entity
public class Prostorija extends Entitet{
    
    private Integer sirina;
    private Integer visina;
    private Integer duzina;
    private String naziv;

   public Integer getSirina() {
    if (sirina == null) {
        return 0;
    }
    return sirina;
}

    public void setSirina(Integer sirina) {
        this.sirina = sirina;
    }

    public Integer getVisina() {
        if(visina ==null) {
            return 0;
        }
        return visina;
    }

    public void setVisina(Integer visina) {
        this.visina = visina;
    }

    public Integer getDuzina() {
        if(duzina == null) {
            return 0;
        }
        return duzina;
    }

    public void setDuzina(Integer duzina) {
        this.duzina = duzina;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Prostorija() {
        super();
    }

    public Prostorija(Integer sirina, Integer visina, Integer duzina, String naziv, int sifra) {
        super(sifra);
        this.sirina = sirina;
        this.visina = visina;
        this.duzina = duzina;
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return naziv;
    }
   
    
    
}
