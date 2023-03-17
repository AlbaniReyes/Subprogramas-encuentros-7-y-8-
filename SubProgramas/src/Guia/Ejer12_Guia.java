/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia;

import java.util.Scanner;

/**
 *
 * @author Albani
 */
public class Ejer12_Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int num1;
        int num2;
                
        
	System.out.println("INGRESE 2 NUMEROS");
	num1=leer.nextInt();
        num2=leer.nextInt();
        
        EsMultiplo(num1,num2);     
        
    }
    
    public static int EsMultiplo(int num1,int num2){
        int multip = 0;
        
        if (multip==num1%num2) {
            System.out.println(num1 + " ES MULTIPLO DE " + num2);
            
            
        } else {
            System.out.println(num1 + " NO ES MULTIPLO DE " + num2);
            
            
        }
        
        return multip;
        
    }
}

