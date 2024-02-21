/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Cuenta;
import vista.Vista;
/**
 *
 * @author Usuario
 */
import vista.Vista;

public class Controlador {
       private Vista view;
       private Cuenta cuenta;
       private Cuenta cuentas[] = new Cuenta[10];
       private int i = 0;
       private int confir = 0;
       
    public Controlador(Vista view) {
        this.view = view;
    }
    
    public void Iniciar(){
        
        while(confir == 0){
        int opcion = view.MostarMenu();
        
        
        
            switch (opcion) {
                case 1:
                    cuentas[i] = view.InterCrearCuenta();
                    cuentas[i] = view.menuRealizarOp(cuentas[i].getCantidad(),cuentas[i].getNombreUsuario());
                    confir = view.Salir();
                    i++;
                    break;
                case 2:
                    if (cuentas[0] == null) {
                        System.out.println("----------------------");
                        System.out.println("No hay Cuentas creadas");
                        System.out.println("----------------------");
                        System.out.println("Cree una cuenta");
                    }else{
                        
                        System.out.println("Seleccione una cuenta:");
                        for (int i = 0; i < cuentas.length; i++) {
                            System.out.println((i+1)+". "+cuentas[i]);
                        }
                        
                        int op = view.ElejirCuenta();
                        cuentas[(op-1)] = view.menuRealizarOp(cuentas[(op-1)].getCantidad(),cuentas[(op-1)].getNombreUsuario());
                        
                        confir = view.Salir();
                        
                    }   break;
                case 3:
                    System.exit(0);
                default:
                    break;
            }
        }
            
        
        
        
    }
       
}
