/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zooapp.util;

import com.github.javafaker.Faker;
import zooapp.model.Djelatnik;
import zooapp.model.Prostorija;
import zooapp.model.Zivotinja;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Lorena
 */
public class PocetniInsert {
    
    private Faker faker;
    private List<Zivotinja> zivotinje;
    private List<Djelatnik> djelatnici;
    private List<Prostorija> prostorije;
    private Session session;
    
     public static void izvedi() {
            new PocetniInsert();
        }
    
    public PocetniInsert() {
        faker = new Faker();
        zivotinje = new ArrayList<>();
        djelatnici = new ArrayList<>();
        prostorije = new ArrayList<>();
        session = HibernateUtil.getSession();
        session.beginTransaction();
        kreirajDjelatnike();
        kreirajProstorije();
        kreirajZivotinje();
        
        session.getTransaction().commit();
    }

    private void kreirajDjelatnike() {
        Djelatnik d;
        for(int i=0;i<10;i++) {
            d = new Djelatnik();
            d.setIBAN(faker.finance().iban());
            d.setIme(faker.name().firstName());
            d.setPrezime(faker.name().lastName());
            session.persist(d);
            djelatnici.add(d);
        }
        
    }

    private void kreirajProstorije() {
        Prostorija p;
        for(int i=0;i<10;i++) {
            p = new Prostorija();
            p.setNaziv(faker.gameOfThrones().house());
            p.setSirina(faker.number().numberBetween(1, 2000));
            p.setVisina(faker.number().numberBetween(1, 3000));
            p.setDuzina(faker.number().numberBetween(1, 1000));
            session.persist(p);
            prostorije.add(p);
        }
    }

    private void kreirajZivotinje() {
        Zivotinja z;
        for(int i=0;i<10;i++) {
            z = new Zivotinja();
            z.setZivotinjskaVrsta(faker.leagueOfLegends().champion());
            z.setVrsta(faker.leagueOfLegends().rank());
            z.setIme(faker.animal().name());
            z.setDatumRodenja(faker.date().birthday());
            z.setDatumDolaska(faker.date().birthday());
            z.setDatumSmrti(faker.date().birthday());
            z.setMinimalnaKubikaza(faker.number().numberBetween(1, 10000));
            z.setMinimalnaKvadratura(faker.number().numberBetween(1, 10000));
            z.setDjelatnik(djelatnici.get(faker.number().numberBetween(0, 10-1)));
            z.setProstorija(prostorije.get(faker.number().numberBetween(0, 10-1)));
            session.persist(z);
            zivotinje.add(z);
        }
    }
    
    
    
    
    
    
    
}
