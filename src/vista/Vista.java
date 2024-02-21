/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Vista {
    private Scanner leer = new Scanner(System.in);
    private int valor = 0;
    private String nombre = "";
    
   public int MostarMenu(){
       
       System.out.println("-------Bienvenido a BancoAmigo-----");
       System.out.println("Escoge una opcion: ");
       System.out.println("1. Crear cuenta ");
       System.out.println("2. Ya tengo cuenta");
       System.out.println("3.Salir");
       System.out.println("------------------------------------");
       int eleccion = leer.nextInt();
       leer.nextLine();
       

       return eleccion;
       
   }
   public Cuenta InterCrearCuenta(){
       System.out.println("------------------------------------");
       System.out.println("-------Crea tu cuenta---------------");
       System.out.println("Ingresa tu Nombre Completo: ");
       this.nombre = leer.nextLine();
       
       System.out.println("Digite la cantidad de dinero que quiere ingresar:");
       this.valor = leer.nextInt();
       leer.nextLine();
       
       System.out.println("Su cuenta fue creada Exitosamente");
       
       
       
       return new Cuenta(this.valor,this.nombre);
   }
  
   public int IngresarDinero(){
       System.out.println("-------------------------------------------------");
       System.out.println("Digite la cantidad de dinero que quiere ingresar:");
       this.valor = this.valor + leer.nextInt();
       
       
        
       return valor;
   }
   public int RetirarDinero(){
       System.out.println("-------------------------------------------------");
       System.out.println("Digite la cantidad de dinero que quiere retirar:");
       this.valor = this.valor - leer.nextInt();
       return valor;
   }
   
   public int ElejirCuenta(){
       int op = leer.nextInt();

       return op;
   }

   public Cuenta menuRealizarOp(int valor,String nombreUsuario){
       int op = 0;
       this.valor = valor;
       this.nombre = nombreUsuario;
       System.out.println("------------------------------------");
       System.out.println("Cuenta: "+ this.nombre +" cantidad: "+this.valor);
       System.out.println("Escoge una opcion: ");
       System.out.println("1.Realizar un retiro ");
       System.out.println("2.Realizar un deposito");
       System.out.println("3.Salir");
       
       op = leer.nextInt();
       
        switch (op) {
            case 1:
                this.RetirarDinero();
                break;
            case 2:
                this.IngresarDinero();
                break;
            case 3:
                System.exit(0);
            default:
                break;
        }
       
       System.out.println("Cuenta: "+ this.nombre +" cantidad: "+this.valor);
       
       
       return new Cuenta(this.valor,this.nombre);
   }
   public int Salir(){
       int salir = 0;
       System.out.println("¿Desea Salir del programa?");
       System.out.println("0. No");
       System.out.println("1. Si");
       salir = leer.nextInt();
       
       return salir;
   }

  
} 



