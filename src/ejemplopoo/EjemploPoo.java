/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopoo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjemploPoo {

    private String nombre;
    private int edad;
    public void inicializar(){    
        Scanner lector= new Scanner(System.in);
        System.out.println("Digite Nombre: ");
        nombre=lector.next();
        System.out.println("Digite Edad: ");
        edad=lector.nextInt();
    }
    public void imprimir(){
        System.out.println("el nombre es: "+nombre);
        System.out.println("la edad es: "+edad);
    }
    public static void main(String[] args) {
        EjemploPoo persona= new EjemploPoo();
        persona.nombre="";
        persona.inicializar();
        persona.imprimir();
        
    }
    
}
