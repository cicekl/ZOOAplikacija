/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package zooapp.view;

import com.github.lgooddatepicker.components.DatePickerSettings;
import java.awt.Frame;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import zooapp.controller.ObradaDjelatnik;
import zooapp.controller.ObradaProstorija;
import zooapp.controller.ObradaZivotinja;
import zooapp.model.Djelatnik;
import zooapp.model.Prostorija;
import zooapp.model.Zivotinja;
import zooapp.util.HibernateUtil;
import zooapp.util.ZooException;

/**
 *
 * @author Lorena
 */
public class ZivotinjaPromjena extends javax.swing.JFrame {

    private ObradaZivotinja obradaZ;
    private Zivotinja promjenaZ;
    private Integer sifra;
    private ObradaDjelatnik od;
    private ObradaProstorija op;

    /**
     * Creates new form ZivotinjaPromjena
     */
    public ZivotinjaPromjena() {
        initComponents();
       // obradaZ = new ObradaZivotinja();
        setTitle("Životinje");
//        ucitajDjelatnike();
//        ucitajProstorije();
    }
    

    public ZivotinjaPromjena(String ime, String zivotinjskaVrsta, String vrsta, Djelatnik djelatnik, Prostorija prostorija, LocalDate datumR, LocalDate datumD, LocalDate datumS, Integer minKv, Integer minKu, Zivotinja s,ObradaZivotinja oz) {
        initComponents();
        od = new ObradaDjelatnik();
        op = new ObradaProstorija();
        setTitle("Životinje");
        Date dateS = null;
        if (datumS != null) {
            dateS = Date.from(datumS.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        }
        napuniView(ime, zivotinjskaVrsta, vrsta, djelatnik, prostorija, Date.from(datumR.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()), Date.from(datumD.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()), dateS, minKv, minKu);
        //napuniView(ime, zivotinjskaVrsta, vrsta, djelatnik, prostorija, Date.from(datumR.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()), Date.from(datumD.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()), Date.from(datumS.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()), minKv, minKu);
        promjenaZ = s;
        obradaZ = oz;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtVrsta = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dpDD = new com.github.lgooddatepicker.components.DatePicker();
        jLabel5 = new javax.swing.JLabel();
        dpDR = new com.github.lgooddatepicker.components.DatePicker();
        jLabel6 = new javax.swing.JLabel();
        dpDS = new com.github.lgooddatepicker.components.DatePicker();
        jLabel7 = new javax.swing.JLabel();
        cmbDjelatnik = new javax.swing.JComboBox<>();
        txtMinKv = new javax.swing.JTextField();
        cmbProstorija = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIme = new javax.swing.JTextField();
        txtMinKu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnPromjena = new javax.swing.JButton();
        lblUspjeh = new javax.swing.JLabel();
        cmbZivotinjskeVrste = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Izmjena postojeće životinje");

        jLabel3.setText("Vrsta");

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lorena\\Downloads\\cute-panda-waving-paw-cartoon-icon-illustration-vector-removebg-preview.png")); // NOI18N

        jLabel4.setText("Datum dolaska");

        jLabel5.setText("Datum rođenja");

        jLabel6.setText("Datum smrti");

        jLabel7.setText("Minimalna kvadratura");

        cmbDjelatnik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDjelatnikActionPerformed(evt);
            }
        });

        cmbProstorija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProstorijaActionPerformed(evt);
            }
        });

        jLabel1.setText("Ime");

        jLabel8.setText("Minimalna kubikaža");

        txtIme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImeActionPerformed(evt);
            }
        });

        jLabel2.setText("Životinjska vrsta");

        jLabel9.setText("Djelatnik");

        jLabel10.setText("Prostorija");

        btnPromjena.setText("Promjena");
        btnPromjena.setBackground(new java.awt.Color(198, 225, 252));
        btnPromjena.setToolTipText("");
        btnPromjena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjenaActionPerformed(evt);
            }
        });

        lblUspjeh.setFont(new java.awt.Font("Sitka Display", 3, 14)); // NOI18N

        cmbZivotinjskeVrste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbZivotinjskeVrsteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblUspjeh)
                        .addGap(31, 31, 31)
                        .addComponent(btnPromjena))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dpDD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9)
                                .addComponent(cmbDjelatnik, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtMinKv, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(dpDR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(txtMinKu)
                            .addComponent(cmbProstorija, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(cmbZivotinjskeVrste, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel6)
                            .addComponent(dpDS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVrsta, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbZivotinjskeVrste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dpDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMinKv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMinKu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbDjelatnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbProstorija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dpDR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtVrsta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dpDS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPromjena)
                    .addComponent(lblUspjeh))
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbDjelatnikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDjelatnikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDjelatnikActionPerformed

    private void txtImeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImeActionPerformed

    private void btnPromjenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjenaActionPerformed
        napuniModel();
//        try {
//            obradaZ.update();
//            //model.setElementAt(obradaZ.getEntitet(),lista.getSelectedIndex());
//            lblUspjeh.setText("Životinja uspješno promijenjena!");
//        } catch (ZooException ex) {
//            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
//        }
    }//GEN-LAST:event_btnPromjenaActionPerformed

    private void cmbZivotinjskeVrsteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbZivotinjskeVrsteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbZivotinjskeVrsteActionPerformed

    private void cmbProstorijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProstorijaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbProstorijaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPromjena;
    private javax.swing.JComboBox<Djelatnik> cmbDjelatnik;
    private javax.swing.JComboBox<Prostorija> cmbProstorija;
    private javax.swing.JComboBox<String> cmbZivotinjskeVrste;
    private com.github.lgooddatepicker.components.DatePicker dpDD;
    private com.github.lgooddatepicker.components.DatePicker dpDR;
    private com.github.lgooddatepicker.components.DatePicker dpDS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblUspjeh;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtMinKu;
    private javax.swing.JTextField txtMinKv;
    private javax.swing.JTextField txtVrsta;
    // End of variables declaration//GEN-END:variables

    private void napuniView(String ime, String zivotinjskaVrsta, String vrsta, Djelatnik djelatnik, Prostorija prostorija, Date datumR, Date datumD, Date datumS, Integer minKv, Integer minKu) {
        txtIme.setText(ime);
        DefaultComboBoxModel<String> z
                = new DefaultComboBoxModel<>();
        //    Zivotinja ziv = new Zivotinja();
        z.addElement(zivotinjskaVrsta);
        if (zivotinjskaVrsta.compareTo("Sisavci") != 0) {
            z.addElement("Sisavci");
        }
        if (zivotinjskaVrsta.compareTo("Ptice") != 0) {
            z.addElement("Ptice");
        }
        if (zivotinjskaVrsta.compareTo("Gmazovi") != 0) {
            z.addElement("Gmazovi");
        }
        if (zivotinjskaVrsta.compareTo("Vodozemci") != 0) {
            z.addElement("Vodozemci");
        }
        if (zivotinjskaVrsta.compareTo("Ribe") != 0) {
            z.addElement("Ribe");
        }
        if (zivotinjskaVrsta.compareTo("Rakovi") != 0) {
            z.addElement("Rakovi");
        }
        if (zivotinjskaVrsta.compareTo("Mekušci") != 0) {
            z.addElement("Mekušci");
        }
        if (zivotinjskaVrsta.compareTo("Paučnjaci") != 0) {
            z.addElement("Paučnjaci");
        }
        if (zivotinjskaVrsta.compareTo("Kukci") != 0) {
            z.addElement("Kukci");
        }
        cmbZivotinjskeVrste.setModel(z);
        cmbZivotinjskeVrste.repaint();
        txtVrsta.setText(vrsta);
        DatePickerSettings dpDolazak
                = new DatePickerSettings(new Locale("hr", "HR"));
        dpDolazak.setFormatForDatesCommonEra("dd. MM. YYYY.");
        dpDolazak.setTranslationClear("Očisti");
        dpDolazak.setTranslationToday("Danas");
        DatePickerSettings dpRodenje
                = new DatePickerSettings(new Locale("hr", "HR"));
        dpRodenje.setFormatForDatesCommonEra("dd. MM. YYYY.");
        dpRodenje.setTranslationClear("Očisti");
        dpRodenje.setTranslationToday("Danas");
        DatePickerSettings dpSmrt
                = new DatePickerSettings(new Locale("hr", "HR"));
        dpSmrt.setFormatForDatesCommonEra("dd. MM. YYYY.");
        dpSmrt.setTranslationClear("Očisti");
        dpSmrt.setTranslationToday("Danas");
        dpDD.setSettings(dpDolazak);
        dpDR.setSettings(dpRodenje);
        dpDS.setSettings(dpSmrt);
        txtMinKv.setText(minKv.toString());
        txtMinKu.setText(minKu.toString());
        dpDR.setDate(datumR.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        dpDD.setDate(datumD.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        if (datumS != null) {
            dpDS.setDate(datumS.toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDate());
        } else {
            dpDS.setDate(null);
        }
        DefaultComboBoxModel<Djelatnik> d
                = new DefaultComboBoxModel<>();
        Djelatnik dj = new Djelatnik();
        dj.setSifra(0);
        dj.setIme(djelatnik.getIme());
        dj.setPrezime(djelatnik.getPrezime());
        d.addElement(dj);
        List<Djelatnik> djelatnici = new ObradaDjelatnik().read();
        for (int i = 0; i < djelatnici.size(); i++) {
            if (!djelatnici.get(i).getIme().equals(dj.getIme()) && !djelatnici.get(i).getPrezime().equals(dj.getPrezime())) {
                Djelatnik person = new Djelatnik();
                person.setSifra(i);
                person.setIme(djelatnici.get(i).getIme());
                person.setPrezime(djelatnici.get(i).getPrezime());
                d.addElement(person);
            }
        }
        cmbDjelatnik.setModel(d);
        cmbDjelatnik.repaint();
        DefaultComboBoxModel<Prostorija> p
                = new DefaultComboBoxModel<>();
        Prostorija pr = new Prostorija();
        pr.setSifra(0);
        pr.setNaziv(prostorija.getNaziv());
        pr.setSirina(prostorija.getSirina());
        pr.setDuzina(prostorija.getDuzina());
        pr.setVisina(prostorija.getVisina());
        p.addElement(pr);
        // p.addAll(new ObradaProstorija().read());
        List<Prostorija> prostorije = new ObradaProstorija().read();
        for (int i = 0; i < prostorije.size(); i++) {
            if (!prostorije.get(i).getNaziv().equals(prostorija.getNaziv())) {
                Prostorija room = new Prostorija();
                room.setSifra(i);
                room.setNaziv(prostorije.get(i).getNaziv());
                room.setSirina(prostorije.get(i).getSirina());
                room.setDuzina(prostorije.get(i).getDuzina());
                room.setVisina(prostorije.get(i).getVisina());
                p.addElement(room);
            }
        }
        cmbProstorija.setModel(p);
        cmbProstorija.repaint();
    }

    public void prikazi() {
        setVisible(true);
    }

    private void napuniModel() {
        obradaZ.setEntitet(promjenaZ);
        var s = obradaZ.getEntitet();
        s.setIme(txtIme.getText());
        s.setZivotinjskaVrsta((String) cmbZivotinjskeVrste.getSelectedItem());
        s.setVrsta(txtVrsta.getText());
        DatePickerSettings dpDolazak
                = new DatePickerSettings(new Locale("hr", "HR"));
        dpDolazak.setFormatForDatesCommonEra("dd. MM. YYYY.");
        dpDolazak.setTranslationClear("Očisti");
        dpDolazak.setTranslationToday("Danas");
        DatePickerSettings dpRodenje
                = new DatePickerSettings(new Locale("hr", "HR"));
        dpRodenje.setFormatForDatesCommonEra("dd. MM. YYYY.");
        dpRodenje.setTranslationClear("Očisti");
        dpRodenje.setTranslationToday("Danas");
        DatePickerSettings dpSmrt
                = new DatePickerSettings(new Locale("hr", "HR"));
        dpSmrt.setFormatForDatesCommonEra("dd. MM. YYYY.");
        dpSmrt.setTranslationClear("Očisti");
        dpSmrt.setTranslationToday("Danas");
        dpDD.setSettings(dpDolazak);
        dpDR.setSettings(dpRodenje);
        dpDS.setSettings(dpSmrt);
        s.setDatumRodenja(dpDR.getDate() != null
                ? Date.from(dpDR.getDate()
                        .atStartOfDay()
                        .atZone(ZoneId.systemDefault())
                        .toInstant())
                : null);
        s.setDatumDolaska(dpDD.getDate() != null
                ? Date.from(dpDD.getDate()
                        .atStartOfDay()
                        .atZone(ZoneId.systemDefault())
                        .toInstant())
                : null);
        s.setDatumSmrti(dpDS.getDate() != null
                ? Date.from(dpDS.getDate()
                        .atStartOfDay()
                        .atZone(ZoneId.systemDefault())
                        .toInstant())
                : null);
        s.setMinimalnaKvadratura(Integer.parseInt(txtMinKv.getText()));
        s.setMinimalnaKubikaza(Integer.parseInt(txtMinKu.getText()));
        s.setDjelatnik((Djelatnik) cmbDjelatnik.getSelectedItem());
        s.setProstorija((Prostorija) cmbProstorija.getSelectedItem());
       
        
        try {
            obradaZ.update();
            lblUspjeh.setText("Životinja uspješno promijenjena!");
        } catch (ZooException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
    }

}
