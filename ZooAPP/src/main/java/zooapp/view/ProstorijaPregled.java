/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package zooapp.view;

import zooapp.controller.ObradaProstorija;
import zooapp.model.Prostorija;

/**
 *
 * @author Lorena
 */
public class ProstorijaPregled extends javax.swing.JFrame {

    private ObradaProstorija obradaP;
    private Prostorija p;
    
    /**
     * Creates new form ProstorijaPregled
     */
    public ProstorijaPregled() {
        initComponents();
        obradaP = new ObradaProstorija();
         setTitle("Pregled prostorija");
    }
    
    public ProstorijaPregled(String naziv, Integer sirina, Integer duzina, Integer visina) {
        initComponents();
        obradaP = new ObradaProstorija();
        setTitle("Pregled prostorija");
        napuniView(naziv,sirina,duzina,visina);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblNaziv = new javax.swing.JLabel();
        lblSirina = new javax.swing.JLabel();
        lblDuzina = new javax.swing.JLabel();
        lblVisina = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lorena\\Downloads\\prostorija-removebg-preview.png")); // NOI18N

        jLabel2.setText("NAZIV:");

        jLabel3.setText("ŠIRINA:");

        jLabel4.setText("VISINA:");

        jLabel5.setText("DUŽINA:");

        lblNaziv.setFont(new java.awt.Font("Sitka Display", 3, 14)); // NOI18N
        lblNaziv.setForeground(new java.awt.Color(51, 51, 255));

        lblSirina.setFont(new java.awt.Font("Sitka Display", 3, 14)); // NOI18N
        lblSirina.setForeground(new java.awt.Color(51, 51, 255));

        lblDuzina.setFont(new java.awt.Font("Sitka Display", 3, 14)); // NOI18N
        lblDuzina.setForeground(new java.awt.Color(51, 51, 255));

        lblVisina.setFont(new java.awt.Font("Sitka Display", 3, 14)); // NOI18N
        lblVisina.setForeground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSirina, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblVisina))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDuzina)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblNaziv))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblSirina))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblDuzina))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblVisina))))
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblDuzina;
    private javax.swing.JLabel lblNaziv;
    private javax.swing.JLabel lblSirina;
    private javax.swing.JLabel lblVisina;
    // End of variables declaration//GEN-END:variables

    private void napuniView(String naziv, Integer sirina, Integer duzina, Integer visina) {
        lblNaziv.setText(naziv.toUpperCase());
        lblSirina.setText(sirina.toString());
        lblDuzina.setText(duzina.toString());
        lblVisina.setText(visina.toString());
    }
    
    void prikazi() {
        setVisible(true);
    }
}