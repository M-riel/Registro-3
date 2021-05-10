/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uees.registro3;

import java.util.Scanner;
import org.mindrot.jbcrypt.BCrypt;
/**
 *
 * @author Mariela Q
 */
public class MainTestBcrypt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre;
        String apellido;
        Float edad;
        String Departamento;
        String email;
        String id_usuario;
        String password;
        //se crea objeto para leer desde el teclado
        Scanner teclado = new Scanner(System.in);
        //se pide por consola los valores y de asigna a cada variable
        System.out.println("Ingresar el nombre del usuario:");
        nombre = teclado.nextLine();
        System.out.println("Ingresa el apellido del usuario: ");
        apellido = teclado.nextLine();
        System.out.println("Ingresar edad: ");
        edad = Float.parseFloat(teclado.nextLine());
        System.out.println("Ingresar el departamento: ");
        Departamento = teclado.nextLine();
        System.out.println("ingresar email: ");
        email = teclado.nextLine();
        System.out.println("Ingresa el id: ");
        id_usuario = teclado.nextLine();
        System.out.println("Ingresa el password: ");
        password = teclado.nextLine();
        
        //declaración de variable para guardar el password encriptado
        String pass_hash;
        
        //llamada a metodo para encriptar con funcionalidad de Bcrypt - mindrot - dependencia agregada
        pass_hash = encriptar(password);
        
        
        Login registro;
        registro = new Login(nombre, apellido, edad,  Departamento, email, id_usuario, pass_hash);
        
        System.out.println("Los datos de registro son: ");
        System.out.println("Nombre: "+ registro.getNombre());
        System.out.println("Apellidos: "+ registro.getApellido());
        System.out.println("Edad: "+ registro.getEdad());
        System.out.println("Departamento: "+ registro.getDepartamento());
        System.out.println("Email: " +registro.getEmail());
        System.out.println("Id: " +registro.getId_usuario());
        System.out.println("Password: " +registro.getPassword());
        
        //Verificación del password
        String password_check;
        System.out.println("Ingresa el password a verificar :");
        password_check = teclado.nextLine();
        if(BCrypt.checkpw(password_check, registro.getPassword())){
            System.out.println("El password es correcto");
        }
        else{
            System.out.println("El password es incorrecto");
        }
    }
        
        //Metodo de tipo static para encriptar, se hace llamado a metodo de Bcrypt dos parametros password y numero de salto
        public static String encriptar(String pass){
        
        return BCrypt.hashpw(pass,BCrypt.gensalt());
    }
    
}
