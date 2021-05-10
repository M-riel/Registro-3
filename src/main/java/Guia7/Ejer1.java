/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;

/**
 *
 * @author Mariela Q
 */
public class Ejer1 {
    
    //Creamos  un Log in para una universidad
    
    private String nombre;
    private String apellido;
    private float cif;
    private String carrera;
    private String password;

        public Ejer1(String nombre, String apellido, float cif, String carrera, String password) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.cif = cif;
            this.carrera = carrera;
            this.password = password;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public float getCif() {
            return cif;
        }

        public void setCif(float cif) {
            this.cif = cif;
        }

        public String getCarrera() {
            return carrera;
        }

        public void setCarrera(String carrera) {
            this.carrera = carrera;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    
    
    }

