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
public class Ejer_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("INGRESE UNA CIFRA EN EUROS (€)");
        double euros = leer.nextDouble();
        System.out.println("INGRESE UNA OPCION SEGUN LA MONEDA A LA CUAL QUIERA HACER LA CONVERSION");
        System.out.println("1) LIBRAS ESTERLINAS (£)");
        System.out.println("2) DOLARES ($)");
        System.out.println("3) YENES (¥)");
        int moneda = leer.nextInt();
        
        
        cambio(moneda,euros);
        
        
    }
    
    public static double cambio(int moneda, double euros) {
        double cambio = 0;
        
        switch (moneda) {
            case 1:
                cambio=(euros*0.86);
                System.out.println(euros + " EUROS EQUIVALE A " + cambio + " LIBRAS ESTERLINAS (£)");
                break;
            case 2:
                cambio=(euros*1.28611);
                System.out.println(euros + " EUROS EQUIVALE A " + cambio + " DOLARES ($)");
                break;    
            case 3:
                cambio=(euros*129.852);
                System.out.println(euros + " EUROS EQUIVALE A " + cambio + " YENES (¥)");
                break;  
            default:
                System.out.println("INGRESO UNA OPCION INVALIDA");
                
                break;    
    }
        
        return cambio;
    }
    
    
}
