/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zooapp.controller;

import java.util.List;
import zooapp.model.Prostorija;
import zooapp.util.ZooException;

/**
 *
 * @author Lorena
 */
public class ObradaProstorija extends Obrada<Prostorija> {

    @Override
    public List<Prostorija> read() {
                return session.createQuery("from Prostorija",Prostorija.class).list();
    }

    @Override
    protected void kontrolaUnos() throws ZooException {
        kontrolaNaziv();
        kontrolaSirina();
        kontrolaVisina();
        kontrolaDuzina();
    }

    @Override
    protected void kontrolaPromjena() throws ZooException {
    }

    @Override
    protected void kontrolaBrisanje() throws ZooException {
    }

    private void kontrolaNaziv() throws ZooException {
        KontrolaNazivNull();
    }

    private void KontrolaNazivNull() throws ZooException {
        if(entitet.getNaziv()==null){
            throw new ZooException("Naziv mora biti unešen!");
        }
    }

    private void kontrolaSirina() throws ZooException {
        kontrolaSirinaNull();
    }

    private void kontrolaVisina() throws ZooException {
        kontrolaVisinaNull();
    }

    private void kontrolaDuzina() throws ZooException {
        kontrolaDuzinaNull();
    }

    private void kontrolaSirinaNull() throws ZooException {
        if(entitet.getSirina()==null){
            throw new ZooException("Širina prostorije mora biti postavljena!");
        }
    }

    private void kontrolaVisinaNull() throws ZooException {
        if(entitet.getVisina()==null){
            throw new ZooException("Visina prostorije mora biti postavljena!");
        }
    }

    private void kontrolaDuzinaNull() throws ZooException {
        if(entitet.getDuzina()==null){
            throw new ZooException("Dužina prostorije mora biti postavljena!");
        }
    }
    
    
    
}
