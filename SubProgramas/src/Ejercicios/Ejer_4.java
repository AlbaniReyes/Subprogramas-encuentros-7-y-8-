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
public class Ejer_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner (System.in);   
        
        System.out.println("INGRESE UN NUMERO");
        int num=leer.nextInt();
        
        System.out.println(primo(num));
        
    }
    
    public static boolean primo(int num){
        
        boolean respuesta ;
        
        int cont = 0 ; 
        
        for (int i = 1; i <= num; i++) {
            
            if (num%i==0) {
                cont++;
            }
        } 
        
        if (cont==2) {
            System.out.println("¿ES UN NUMERO PRIMO?");
            respuesta = true;
        } else {
            System.out.println("¿ES UN NUMERO PRIMO?");
            respuesta = false;
        }

        return respuesta;
    }
    
}

