/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package zooapp;

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
       new ProzorLogin().setVisible(true);
    }
}

