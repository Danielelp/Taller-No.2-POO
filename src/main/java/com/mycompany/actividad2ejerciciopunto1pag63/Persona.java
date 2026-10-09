
package com.mycompany.actividad2ejerciciopunto1pag63;
public class Persona {
    public String nombre;
    public String apellido;
    public String númeroDocumentoIdentidad;
    public char genero;
    public String paisNacimiento;
    int añoNacimiento;

    
    Persona(String nombre, String apellido, String númeroDocumentoIdentidad, int añoNacimiento, 
        char genero, String paisNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.númeroDocumentoIdentidad = númeroDocumentoIdentidad;
        this.añoNacimiento = añoNacimiento;
        this.genero = genero;
        this.paisNacimiento = paisNacimiento;
    }   
    public void imprimir() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellidos = " + apellido);
        System.out.println("Número de documento de identidad = " + númeroDocumentoIdentidad);
        System.out.println("Año de nacimiento = " + añoNacimiento);
        System.out.println("Genero = " + genero);
        System.out.println("Pais de Nacimiento = " + paisNacimiento);
    }
}
