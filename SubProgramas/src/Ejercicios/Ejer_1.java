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
public class Ejer_1 {

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
        
        System.out.println("LA SUMA DE " + num1 + " Y " + num2 + " ES IGUAL A: " + sumar(num1,num2)) ;
        System.out.println("LA RESTA DE " + num1 + " Y " + num2 + " ES IGUAL A: " + restar(num1,num2)) ;
        System.out.println("LA MULTIPLICACION DE " + num1 + " Y " + num2 + " ES IGUAL A: " + multiplicar(num1,num2)) ;
        System.out.println("LA DIVISION DE " + num1 + " Y " + num2 + " ES IGUAL A: " + dividir(num1,num2)) ;
    }
    
    public static int sumar(int num1,int num2){
        int suma= (num1+num2) ; 
        
        return suma;
        
    }
    
    public static int restar(int num1,int num2){
        int resta= (num1-num2) ; 
        
        return resta;
        
    }
    
    public static int multiplicar(int num1,int num2){
        int multip= (num1*num2) ; 
        
        return multip;
        
    }
    
    public static double dividir(int num1,int num2){
        double division= (num1/num2) ; 
        
        return division;
        
    }
    
}

