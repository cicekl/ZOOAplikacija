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
        kontrolaMinimalnaKvadratura();
        kontrolaMinimalnaKubikaza();
    }

    @Override
    protected void kontrolaPromjena() throws ZooException {
    }

    @Override
    protected void kontrolaBrisanje() throws ZooException {
    }

    private void kontrolaMinimalnaKvadratura()throws ZooException {
        if(entitet.getMinimalnaKvadratura()>(p.getSirina()*p.getDuzina())) {
            throw new ZooException("Prostorija ne zadovoljava uvjete minimalne kvadrature za odabranu životinju!");
        }
        
    }

    private void kontrolaMinimalnaKubikaza() throws ZooException {
        if(entitet.getMinimalnaKvadratura()>(p.getSirina()*p.getDuzina()*p.getVisina())) {
            throw new ZooException("Prostorija ne zadovoljava uvjete minimalne kubikaže za odabranu životinju!");
        }
    }
    
}
