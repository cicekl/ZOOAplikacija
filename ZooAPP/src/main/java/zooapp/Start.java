/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package zooapp;

import javax.swing.UIManager;
import zooapp.util.HibernateUtil;
import zooapp.util.PocetniInsert;
import zooapp.view.ProzorLogin;

/**
 *
 * @author Lorena
 */
public class Start {

    public static void main(String[] args) {
       
      //HibernateUtil.getSession();
       // PocetniInsert.izvedi();
       try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
       new ProzorLogin().setVisible(true);
    }
}

