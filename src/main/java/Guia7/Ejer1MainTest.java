/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;
import java.util.Scanner;
import org.mindrot.jbcrypt.BCrypt;
/**
 *
 * @author Mariela Q
 */
public class Ejer1MainTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String apellido;
        Float cif;
        String carrera;
        String password;
        
        //Esto nos permite ingresar datos desde el teclado
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresar el nombre del estudiante:");
        nombre = teclado.nextLine();
        
        System.out.println("Ingresa el apellido del estudiante: ");
        apellido = teclado.nextLine();
        
        System.out.println("Ingresar CIF: ");
        cif = Float.parseFloat(teclado.nextLine());
        
        System.out.println("Ingresar el nombre de la carrera: ");
        carrera = teclado.nextLine();
        
        System.out.println("Ingresa la contraseña: ");
        password = teclado.nextLine();
        
        //declaración la variabla de la contraseña a encriptar
        String Encrip;
        
        Encrip = encriptar1(password);
        
        Ejer1 Log;
        Log = new Ejer1(nombre, apellido, cif,  carrera, Encrip);
        
        System.out.println("Los datos de registro para la univesidad son: ");
        System.out.println("Nombre: "+ Log.getNombre());
        System.out.println("Apellidos: "+ Log.getApellido());
        System.out.println("CIF: "+ Log.getCif());
        System.out.println("Carrera: "+ Log.getCarrera());
        System.out.println("Contraseña: " +Log.getPassword());
        
          String password_check;
        System.out.println("Ingresa la contraseña a verificar :");
        password_check = teclado.nextLine();
        if(BCrypt.checkpw(password_check, Log.getPassword())){
            System.out.println("La contrasea es correcta");
        }
        else{
            System.out.println("La contraseña es incorrecta");
        }
    }
    
       public static String encriptar1(String pass){
        
        return BCrypt.hashpw(pass,BCrypt.gensalt());
    }
    
    
    
    
    
}
