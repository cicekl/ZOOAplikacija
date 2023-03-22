/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package zooapp.view;

import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import zooapp.controller.ObradaZivotinja;
import zooapp.model.Zivotinja;

/**
 *
 * @author Lorena
 */
public class ProzorZivotinje extends javax.swing.JFrame {

    private ObradaZivotinja obradaZ;
    private ZivotinjaPregled zp;
    /**
     * Creates new form ProzorZivotinje
     */
    public ProzorZivotinje() {
        initComponents();
        obradaZ = new ObradaZivotinja();
       // zp = new ZivotinjaPregled();
        setTitle("Životinje");
        txtPretraga.requestFocus();
        
    }
    
     public ProzorZivotinje(ZivotinjaPregled zp) {
        initComponents();
        obradaZ = new ObradaZivotinja();
        this.zp = zp;
        setTitle("Životinje");
        txtPretraga.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jColorChooser1 = new javax.swing.JColorChooser();
        jButton1 = new javax.swing.JButton();
        txtPretraga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstLista = new javax.swing.JList<>();
        btnPretraga = new javax.swing.JButton();
        btnIzmjena = new javax.swing.JButton();
        btnPregled = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnUnos = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton1.setBackground(new java.awt.Color(198, 225, 252));
        jButton1.setText("Povratak na izbornik");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtPretraga.setBackground(new java.awt.Color(207, 214, 221));
        txtPretraga.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPretraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPretragaActionPerformed(evt);
            }
        });
        txtPretraga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPretragaKeyPressed(evt);
            }
        });

        lstLista.setBackground(new java.awt.Color(207, 214, 221));
        lstLista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstLista.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lstLista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstListaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstLista);

        btnPretraga.setBackground(new java.awt.Color(198, 225, 252));
        btnPretraga.setText("Pretraga 🔍");
        btnPretraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretragaActionPerformed(evt);
            }
        });

        btnIzmjena.setBackground(new java.awt.Color(198, 225, 252));
        btnIzmjena.setText("Izmjena ");

        btnPregled.setBackground(new java.awt.Color(198, 225, 252));
        btnPregled.setText("Pregled");
        btnPregled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPregledActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(198, 225, 252));
        jButton3.setText("Brisanje");

        btnUnos.setBackground(new java.awt.Color(198, 225, 252));
        btnUnos.setText("Unos nove");
        btnUnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnosActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(198, 225, 252));
        jButton5.setText("Opis");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPretraga, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPretraga)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnPregled, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(btnIzmjena, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(19, 19, 19))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUnos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPretraga, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPretraga, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUnos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPregled, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnIzmjena, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new ProzorIzbornik().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtPretragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPretragaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPretragaActionPerformed

    private void btnUnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnosActionPerformed
        new ZivotinjaUnos().setVisible(true);
    }//GEN-LAST:event_btnUnosActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnPretragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretragaActionPerformed
        ucitaj();
    }//GEN-LAST:event_btnPretragaActionPerformed

    private void txtPretragaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPretragaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
            ucitaj();
        }
    }//GEN-LAST:event_txtPretragaKeyPressed

    private void btnPregledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPregledActionPerformed
        if(lstLista.getSelectedValue() == null || lstLista.getSelectedValue().equals(null)) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite željenu životinju!","Upozorenje",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        obradaZ.setEntitet(lstLista.getSelectedValue());
           var s = obradaZ.getEntitet();
          // System.out.println(s.getIme());
           zp = new ZivotinjaPregled(s.getIme(),s.getZivotinjskaVrsta(),s.getVrsta());
           zp.prikazi();
     
    }//GEN-LAST:event_btnPregledActionPerformed

    private void lstListaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstListaValueChanged
//       if(!evt.getValueIsAdjusting()) {
//           obradaZ.setEntitet(lstLista.getSelectedValue());
//           var s = obradaZ.getEntitet();
//          // System.out.println(s.getIme());
//           zp = new ZivotinjaPregled(s.getIme());
//           zp.prikazi();
//           
//       }
    }//GEN-LAST:event_lstListaValueChanged

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIzmjena;
    private javax.swing.JButton btnPregled;
    private javax.swing.JButton btnPretraga;
    private javax.swing.JButton btnUnos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Zivotinja> lstLista;
    private javax.swing.JTextField txtPretraga;
    // End of variables declaration//GEN-END:variables

    private void ucitaj() {
        
        DefaultListModel<Zivotinja> z = new DefaultListModel<>();
        z.addAll(obradaZ.read(txtPretraga.getText()));
        lstLista.setModel(z);
        lstLista.repaint();
    }

    public JList<Zivotinja> getlstLista() {
        return lstLista;
    }

    public void setlstLista(JList<Zivotinja> lstLista) {
        this.lstLista = lstLista;
    }

   
    
}
