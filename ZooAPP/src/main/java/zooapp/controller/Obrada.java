/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zooapp.controller;

import zooapp.model.Entitet;
import zooapp.util.HibernateUtil;
import zooapp.util.ZooException;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Lorena
 */
public abstract class Obrada<T extends Entitet> {
    
    protected T entitet;
    protected Session session;
    
    public abstract List<T> read();
   
    protected abstract void kontrolaUnos() throws ZooException;
    protected abstract void kontrolaPromjena() throws ZooException;
    protected abstract void kontrolaBrisanje() throws ZooException;

    public Obrada() {
        this.session = HibernateUtil.getSession();
        
    }

    public T getEntitet() {
        return entitet;
    }

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }
    
     private void persist() {
        session.beginTransaction();
        session.persist(entitet);
        session.getTransaction().commit();
    }
     
      public void create() throws ZooException {
        if(entitet==null){
            throw new ZooException("Entitet ne postoji.");
        }
        kontrolaUnos();
        persist();
    }

    public void update() throws ZooException {
        kontrolaPromjena();
        persist();
    }

    public void delete() throws ZooException {
        kontrolaBrisanje();
        session.beginTransaction();
        session.remove(entitet);
        session.getTransaction().commit();
    }
    
    
    
    
}
