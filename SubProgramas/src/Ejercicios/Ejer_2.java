/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Albani
 */
public class Ejer_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner (System.in);
        String respuesta = " " ;
        
        do {
        System.out.println("INGRESE NOMBRE Y EDAD");
        String nombre=leer.next();
        int edad=leer.nextInt();
        
        mayor(nombre,edad);
        
        System.out.println("¿DESEA INGRESAR OTRA PERSONA? Ingrese S para Si y N para No");
        respuesta = leer.next().toLowerCase();
         } while ("si".equals(respuesta)) ;
        
        
    }
    
    
    
    public static boolean mayor(String nombre,int edad) {
        boolean respuesta = true ;
        
        if (edad>=18) {
            System.out.println(nombre + " es mayor de edad");
        } else {
            System.out.println(nombre + " no es mayor de edad");
        }
        
        return respuesta;
    }
    
}
