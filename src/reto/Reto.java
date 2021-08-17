/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto;

import javax.swing.JFrame;
import VIstaGUi.frmVista;
/**
 *
 * @author jorge
 */
public class Reto extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        frmVista vista = new frmVista();
        vista.setVisible(true);
        vista.setDefaultCloseOperation(EXIT_ON_CLOSE);
        vista.setTitle("Misión Tic 2022: reto 5");
        
        
    }
    
}
