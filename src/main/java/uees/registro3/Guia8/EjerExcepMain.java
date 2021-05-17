/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uees.registro3.Guia8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Mariela Q
 */
public class EjerExcepMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner (System.in);
        float num;
        float resultado;
        float pi = (float) 3.14;
        
        try{
            System.out.print("Ingrese el radio (en metros) de un circulo, para encontrar su área: ");
            num = teclado.nextInt();
            resultado = pi * (num * num) ;
            System.out.print("El area de el circulo  es " + resultado + " metros al cuadrado");            
        
        } catch(InputMismatchException ex){
            System.out.println("Lo que ingresaste es incorrecto, por favor ingresa un número");
            teclado.next();
        
        }finally{
            System.out.println(" Fin del Programa");
        }
    
        
    }
    
}
