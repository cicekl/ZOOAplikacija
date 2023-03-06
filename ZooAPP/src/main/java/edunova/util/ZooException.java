/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.util;

/**
 *
 * @author Lorena
 */
public class ZooException extends Exception {
    
    private String poruka;

    public String getPoruka() {
        return poruka;
    }

    public ZooException(String poruka) {
        super();
        this.poruka = poruka;
    }
    
    
    
}
