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
    
    
}
