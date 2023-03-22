/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package zooapp.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Lorena
 */
public class ProzorIzbornik extends javax.swing.JFrame {

    /**
     * Creates new form ProzorIzbornik
     */
    public ProzorIzbornik() {
        initComponents();
        setTitle("Glavni izbornik");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnZivotinje = new javax.swing.JButton();
        btnDjelatnici = new javax.swing.JButton();
        btnProstorije = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnOpisAplikacije = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lorena\\Downloads\\logo.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Sitka Text", 2, 36)); // NOI18N
        jLabel2.setText("Dobrodošli u ZOO aplikaciju!");

        btnZivotinje.setBackground(new java.awt.Color(198, 225, 252));
        btnZivotinje.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        btnZivotinje.setText("Životinje");
        btnZivotinje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZivotinjeActionPerformed(evt);
            }
        });

        btnDjelatnici.setBackground(new java.awt.Color(198, 225, 252));
        btnDjelatnici.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        btnDjelatnici.setText("Djelatnici");
        btnDjelatnici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDjelatniciActionPerformed(evt);
            }
        });

        btnProstorije.setBackground(new java.awt.Color(198, 225, 252));
        btnProstorije.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        btnProstorije.setText("Prostorije");

        jButton4.setBackground(new java.awt.Color(198, 225, 252));
        jButton4.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jButton4.setText("Izlaz iz programa");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnOpisAplikacije.setBackground(new java.awt.Color(198, 225, 252));
        btnOpisAplikacije.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        btnOpisAplikacije.setText("O aplikaciji");
        btnOpisAplikacije.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpisAplikacijeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnZivotinje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDjelatnici, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProstorije, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOpisAplikacije)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnZivotinje, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDjelatnici, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnProstorije, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(btnOpisAplikacije))
                        .addContainerGap(21, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnZivotinjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZivotinjeActionPerformed
       new ProzorZivotinje().setVisible(true);
       dispose();
    }//GEN-LAST:event_btnZivotinjeActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnDjelatniciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDjelatniciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDjelatniciActionPerformed

    private void btnOpisAplikacijeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpisAplikacijeActionPerformed
        JOptionPane.showMessageDialog(getRootPane(), "Aplikacija za zoološki vrt koja sadrži opis životinja te opis njihovih djelatnika i okruženja u kojima se nalaze.","Opis aplikacije",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnOpisAplikacijeActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDjelatnici;
    private javax.swing.JButton btnOpisAplikacije;
    private javax.swing.JButton btnProstorije;
    private javax.swing.JButton btnZivotinje;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    // End of variables declaration//GEN-END:variables
}
