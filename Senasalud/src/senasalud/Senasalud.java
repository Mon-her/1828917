/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senasalud;

import javax.swing.JOptionPane;

/**
 *
 * @author sala
 */
public class Senasalud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        String color=JOptionPane.showInputDialog(null,"Ingrese su color favorito");
       
        JOptionPane.showMessageDialog(null,"Su color favorito es "+color);
        
        
        
    }
}
