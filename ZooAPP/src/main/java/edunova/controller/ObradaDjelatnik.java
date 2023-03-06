/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.model.Djelatnik;
import edunova.util.ZooException;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Lorena
 */
public class ObradaDjelatnik extends Obrada<Djelatnik>{


    @Override
    public List<Djelatnik> read() {
        return session.createQuery("from Djelatnik",Djelatnik.class).list();
    }

    @Override
    protected void kontrolaUnos() throws ZooException {
        kontrolaIme();
    }

    @Override
    protected void kontrolaPromjena() throws ZooException {
    }

    @Override
    protected void kontrolaBrisanje() throws ZooException {
    }

    private void kontrolaIme() throws ZooException {
        KontrolaImeNull();
        KontrolaImeBroj();
    }

    private void KontrolaImeNull() throws ZooException {
       
        if(entitet.getIme()==null){
            throw new ZooException("Ime mora biti unešeno!");
        }
    }

    private void KontrolaImeBroj() {
        
    }
    
    
    
}
