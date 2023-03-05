/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

/**
 *
 * @author Lorena
 */
@MappedSuperclass
public abstract class Entitet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sifra;

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public Entitet() {
    }

    public Entitet(int sifra) {
        this.sifra = sifra;
    }
    
    
    
}
