/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestioncuenta;

import controlador.Controlador;
import vista.Vista;

/**
 *
 * @author Usuario
 */
public class GestionCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vista view = new Vista();
        Controlador cont = new Controlador(view);
        cont.Iniciar();
    }
    
}
