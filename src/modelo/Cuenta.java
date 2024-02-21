/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Daniel 
 */
public class Cuenta {
    private int cantidad = 0;
    private String nombreUsuario = "";

    public Cuenta(int cantidad, String nombreUsuario) {
        this.cantidad = cantidad;
        this.nombreUsuario = nombreUsuario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
   
    public String toString(){
        return nombreUsuario + "  " + cantidad;
    }
   
}
