/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zooapp.controller;

import java.util.ArrayList;
import java.util.List;
import zooapp.model.Prostorija;
import zooapp.model.Zivotinja;
import zooapp.util.ZooException;

/**
 *
 * @author Lorena
 */
public class ObradaProstorija extends Obrada<Prostorija> {
    
    private List<Zivotinja> zivotinje;
    private ObradaZivotinja oz;

    @Override
    public List<Prostorija> read() {
                return session.createQuery("from Prostorija",Prostorija.class).list();
    }
    
     public List<Prostorija> read(String uvjet) {
        uvjet=uvjet.trim();
        uvjet = "%" + uvjet + "%";
        return session.createQuery("from Prostorija where concat(naziv,' ',duzina,' ',sirina,' ',visina,' ',naziv) like :uvjet order by naziv ", Prostorija.class).
                setParameter("uvjet", uvjet).setMaxResults(20).list();
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
        kontrolaNaziv();
        kontrolaSirina();
        kontrolaVisina();
        kontrolaDuzina();
    }

    @Override
    protected void kontrolaBrisanje() throws ZooException {
         zivotinje = new ArrayList<>();
        oz = new ObradaZivotinja();
        zivotinje = oz.read();
        for(Zivotinja z: zivotinje) {
            if(z.getProstorija()==entitet) {
            StringBuilder sb = new StringBuilder();
            sb.append("Odabrana ");
            sb.append("prostorija");
            sb.append(" se ne može obrisati jer se u njoj nalaze životinje!");
            sb.append("\n");
            
           throw new ZooException(sb.toString());
            }
        }
    }

    private void kontrolaNaziv() throws ZooException {
        KontrolaNazivNull();
    }

    private void KontrolaNazivNull() throws ZooException {
        if(entitet.getNaziv()==null || entitet.getNaziv().isEmpty()){
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
