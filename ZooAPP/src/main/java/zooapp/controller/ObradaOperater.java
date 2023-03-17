/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zooapp.controller;

import java.util.List;
import org.mindrot.jbcrypt.BCrypt;
import zooapp.model.Operater;
import zooapp.util.Alati;
import zooapp.util.ZooException;

/**
 *
 * @author Lorena
 */
public class ObradaOperater extends Obrada<Operater>{

    @Override
    public List<Operater> read() {
       return session.createQuery("from Operater", Operater.class).list();
    }

    @Override
    protected void kontrolaUnos() throws ZooException {
        kontrolaOib();
    }

    @Override
    protected void kontrolaPromjena() throws ZooException {
        
    }

    @Override
    protected void kontrolaBrisanje() throws ZooException {
       
    }

    private void kontrolaOib() throws ZooException {
       if(!Alati.kontrolaOIB(entitet.getOib())) {
           throw new ZooException("OIB nije u dobrom formatu!");
       }
    }
    
    public void unosAdminOperatera(){
        Operater o = new Operater();
        o.setIme("Admin");
        o.setPrezime("Operater");
        o.setEmail("admin@zoo.hr");
        o.setOib("08872767447");
        o.setLozinka(BCrypt.hashpw("zooloskiAdmin", BCrypt.gensalt()).toCharArray());
        
        setEntitet(o);
        
        entitet=o;
        try {
            create();
        } catch (ZooException ex) {
            System.out.println(ex.getPoruka());
        }
    }
    
    public Operater autoriziraj(String email, char[] lozinka){
        Operater o;
        try {
            o = session.createQuery("from Operater o where o.email=:email",
                    Operater.class).setParameter("email", email)
                    .getSingleResult();
        } catch (Exception e) {
            return null;
        }
        
        if(BCrypt.checkpw(new String(lozinka), new String(o.getLozinka()))) {
            return o;
        }
        
        return null;
    }
    
}
