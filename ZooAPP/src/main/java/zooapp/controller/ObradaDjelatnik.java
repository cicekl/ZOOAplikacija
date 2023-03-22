/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zooapp.controller;

import zooapp.model.Djelatnik;
import zooapp.util.ZooException;
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
        kontrolaPrezime();
        kontrolaIBAN();
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
       
        if(entitet.getIme()==null || entitet.getIme().isEmpty()){
            throw new ZooException("Ime mora biti unešeno!");
        }
    }

    private void KontrolaImeBroj() throws ZooException {
         boolean broj = false;

        try {
            Double.parseDouble(entitet.getIme());
            
            broj = true;
        } catch (Exception e) {

        }
        if (broj) {
            throw new ZooException("Ime ne može biti broj!");
        }
    }

    private void kontrolaPrezime() throws ZooException {
        KontrolaPrezimeNull();
        KontrolaPrezimeBroj();
    }

    private void KontrolaPrezimeNull() throws ZooException {
         if(entitet.getPrezime()==null || entitet.getPrezime().isEmpty()){
            throw new ZooException("Prezime mora biti unešeno!");
        }
    }

    private void KontrolaPrezimeBroj() throws ZooException {
         boolean broj = false;

        try {
            Double.parseDouble(entitet.getPrezime());
            
            broj = true;
        } catch (Exception e) {

        }
        if (broj) {
            throw new ZooException("Prezime ne može biti broj!");
        }
    }

    private void kontrolaIBAN() throws ZooException{
        boolean provjera = false;
        String iban = entitet.getIBAN();
        if (iban.length() == 21) {
            if (Character.compare(iban.charAt(0), 'H') == 0) {
                if (Character.compare(iban.charAt(1), 'R') == 0) {

                    for (int i = 2; i < iban.length(); i++) {
                        if (Character.isDigit(iban.charAt(i))) {
                            provjera = true;
                        }
                    }
                }
            }
        }
        if (!provjera) {
            throw new ZooException("IBAN nije u dobrom formatu!");
        }
    }
    
    
    
}
