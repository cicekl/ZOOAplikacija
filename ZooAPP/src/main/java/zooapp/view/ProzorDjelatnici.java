/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package zooapp.view;

import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;
import zooapp.controller.ObradaDjelatnik;
import zooapp.model.Djelatnik;
import zooapp.model.Zivotinja;

/**
 *
 * @author Lorena
 */
public class ProzorDjelatnici extends javax.swing.JFrame {

    private ObradaDjelatnik obradaD;
    /**
     * Creates new form ProzorDjelatnici
     */
    public ProzorDjelatnici() {
        initComponents();
        obradaD = new ObradaDjelatnik();
       // zp = new ZivotinjaPregled();
        setTitle("Djelatnici");
        txtPretragaD.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPretragaD = new javax.swing.JTextField();
        btnPretragaD = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstListaD = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        btnPregledD = new javax.swing.JButton();
        btnIzmjenaD = new javax.swing.JButton();
        btnUnosD = new javax.swing.JButton();
        btnStatistikaD = new javax.swing.JButton();
        btnBrisanje = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtPretragaD.setBackground(new java.awt.Color(207, 214, 221));
        txtPretragaD.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPretragaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPretragaDActionPerformed(evt);
            }
        });
        txtPretragaD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPretragaDKeyPressed(evt);
            }
        });

        btnPretragaD.setBackground(new java.awt.Color(198, 225, 252));
        btnPretragaD.setText("Pretraga 🔍");
        btnPretragaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretragaDActionPerformed(evt);
            }
        });

        lstListaD.setBackground(new java.awt.Color(207, 214, 221));
        lstListaD.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstListaD.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lstListaD.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstListaDValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstListaD);

        jButton1.setBackground(new java.awt.Color(198, 225, 252));
        jButton1.setText("Povratak na izbornik");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnPregledD.setBackground(new java.awt.Color(198, 225, 252));
        btnPregledD.setText("Pregled");
        btnPregledD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPregledDActionPerformed(evt);
            }
        });

        btnIzmjenaD.setBackground(new java.awt.Color(198, 225, 252));
        btnIzmjenaD.setText("Izmjena ");

        btnUnosD.setBackground(new java.awt.Color(198, 225, 252));
        btnUnosD.setText("Unos");
        btnUnosD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnosDActionPerformed(evt);
            }
        });

        btnStatistikaD.setBackground(new java.awt.Color(198, 225, 252));
        btnStatistikaD.setText("Statistika");
        btnStatistikaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatistikaDActionPerformed(evt);
            }
        });

        btnBrisanje.setBackground(new java.awt.Color(198, 225, 252));
        btnBrisanje.setText("Brisanje");
        btnBrisanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrisanjeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPretragaD, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPretragaD)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPregledD, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnIzmjenaD, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(btnUnosD, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(btnStatistikaD, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btnBrisanje, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPretragaD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPretragaD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPregledD, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIzmjenaD, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUnosD, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStatistikaD, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrisanje, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPretragaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPretragaDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPretragaDActionPerformed

    private void txtPretragaDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPretragaDKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
            ucitajDjelatnike();
        }
    }//GEN-LAST:event_txtPretragaDKeyPressed

    private void btnPretragaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretragaDActionPerformed
        ucitajDjelatnike();
    }//GEN-LAST:event_btnPretragaDActionPerformed

    private void lstListaDValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstListaDValueChanged
        //       if(!evt.getValueIsAdjusting()) {
            //           obradaZ.setEntitet(lstLista.getSelectedValue());
            //           var s = obradaZ.getEntitet();
            //          // System.out.println(s.getIme());
            //           zp = new ZivotinjaPregled(s.getIme());
            //           zp.prikazi();
            //
            //       }
    }//GEN-LAST:event_lstListaDValueChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new ProzorIzbornik().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPregledDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPregledDActionPerformed
//        if(lstLista.getSelectedValue() == null || lstLista.getSelectedValue().equals(null)) {
//            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite željenu životinju!","Upozorenje",JOptionPane.INFORMATION_MESSAGE);
//            return;
//        }
//        obradaZ.setEntitet(lstLista.getSelectedValue());
//        var s = obradaZ.getEntitet();
//        // System.out.println(s.getIme());
//        LocalDate dR = s.getDatumRodenja().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//        LocalDate dD = s.getDatumDolaska().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//        LocalDate dS = s.getDatumSmrti().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//        zp = new ZivotinjaPregled(s.getIme(),s.getZivotinjskaVrsta(),s.getVrsta(),s.getDjelatnik(),s.getProstorija(),dR,dD,dS);
//        zp.prikazi();

    }//GEN-LAST:event_btnPregledDActionPerformed

    private void btnUnosDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnosDActionPerformed
      new DjelatnikUnos().setVisible(true);
    }//GEN-LAST:event_btnUnosDActionPerformed

    private void btnStatistikaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatistikaDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStatistikaDActionPerformed

    private void btnBrisanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrisanjeActionPerformed
//        if(lstLista.getSelectedValuesList()==null
//            || lstLista.getSelectedValuesList().isEmpty()){
//            JOptionPane.showMessageDialog(getRootPane(),
//                "Prvo odaberite životinju za brisanje!");
//            return;
//        }
//
//        if(JOptionPane.showConfirmDialog(
//            getRootPane(),
//            "Želite li sigurno obrisati " + obradaZ.getEntitet().getIme() + " " + "(" + obradaZ.getEntitet().getZivotinjskaVrsta() + ")"  + "?",
//            "Brisanje",
//            JOptionPane.YES_NO_OPTION,
//            JOptionPane.QUESTION_MESSAGE)==JOptionPane.NO_OPTION){
//        return;
//        }
//
//        try {
//            obradaZ.delete();
//            ucitaj();
//        } catch (ZooException ex) {
//            JOptionPane.showMessageDialog(
//                getRootPane(),
//                ex.getPoruka());
//        }

    }//GEN-LAST:event_btnBrisanjeActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrisanje;
    private javax.swing.JButton btnIzmjenaD;
    private javax.swing.JButton btnPregledD;
    private javax.swing.JButton btnPretragaD;
    private javax.swing.JButton btnStatistikaD;
    private javax.swing.JButton btnUnosD;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Djelatnik> lstListaD;
    private javax.swing.JTextField txtPretragaD;
    // End of variables declaration//GEN-END:variables

    private void ucitajDjelatnike() {
        
        DefaultListModel<Djelatnik> d = new DefaultListModel<>();
        d.addAll(obradaD.read(txtPretragaD.getText()));
        lstListaD.setModel(d);
        lstListaD.repaint();
        
    }
}
