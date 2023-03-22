/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zooapp.controller;

import java.util.List;
import zooapp.model.Prostorija;
import zooapp.model.Zivotinja;
import zooapp.util.ZooException;

/**
 *
 * @author Lorena
 */
public class ObradaZivotinja extends Obrada<Zivotinja>{
    
    Prostorija p = new Prostorija();

    @Override
    public List<Zivotinja> read() {
        return session.createQuery("from Zivotinja order by vrsta, ime",Zivotinja.class).list();

    }
    
    public List<Zivotinja> read(String uvjet) {
        uvjet=uvjet.trim();
        uvjet = "%" + uvjet + "%";
        return session.createQuery("from Zivotinja where concat(vrsta,' ',ime,' ',zivotinjskaVrsta,vrsta) like :uvjet order by vrsta, ime ", Zivotinja.class).
                setParameter("uvjet", uvjet).setMaxResults(20).list();
    }

    @Override
    protected void kontrolaUnos() throws ZooException {
//        kontrolaMinimalnaKvadratura();
//        kontrolaMinimalnaKubikaza();
          kontrolaIme();
          kontrolaVrsta();
    }

    @Override
    protected void kontrolaPromjena() throws ZooException {
    }

    @Override
    protected void kontrolaBrisanje() throws ZooException {
    }

//    private void kontrolaMinimalnaKvadratura()throws ZooException {
//        if(entitet.getMinimalnaKvadratura()>(p.getSirina()*p.getDuzina())) {
//            throw new ZooException("Prostorija ne zadovoljava uvjete minimalne kvadrature za odabranu životinju!");
//        }
//        
//    }
//
//    private void kontrolaMinimalnaKubikaza() throws ZooException {
//        if(entitet.getMinimalnaKvadratura()>(p.getSirina()*p.getDuzina()*p.getVisina())) {
//            throw new ZooException("Prostorija ne zadovoljava uvjete minimalne kubikaže za odabranu životinju!");
//        }
//    }

    private void kontrolaIme() throws ZooException {
        kontrolaImeNull();
        kontrolaImeBroj();
    }

    private void kontrolaImeNull() throws ZooException {
        if(entitet.getIme()==null || entitet.getIme().isEmpty()){
            throw new ZooException("Ime mora biti unešeno!");
        }
    }

    private void kontrolaImeBroj() throws ZooException {
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

    private void kontrolaVrsta() throws ZooException {
        kontrolaNull();
        kontrolaBroj();
    }

    private void kontrolaNull() throws ZooException {
        if(entitet.getVrsta()==null || entitet.getVrsta().isEmpty()){
            throw new ZooException("Vrsta mora biti unešena!");
        }
    }

    private void kontrolaBroj() throws ZooException {
         boolean broj = false;

        try {
            Double.parseDouble(entitet.getVrsta());
            
            broj = true;
        } catch (Exception e) {

        }
        if (broj) {
            throw new ZooException("Vrsta ne može biti broj!");
        }
    }
    
}
