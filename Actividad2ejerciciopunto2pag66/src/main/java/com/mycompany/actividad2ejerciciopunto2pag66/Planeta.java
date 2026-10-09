package com.mycompany.actividad2ejerciciopunto2pag66;
public class Planeta {    
    String nombre = null;
    int cantidadSatélites = 0;
    double masa = 0;
    double volumen = 0;
    int diámetro = 0;
    int distanciaSol = 0;
    boolean esObservable = false;
    tipoPlaneta tipo; 
    double periodoOrbital =0;
    double periodoRotacion =0;
    
    Planeta(String nombre, int cantidadSatélites, double masa, double volumen, int diámetro, 
            int distanciaSol, tipoPlaneta tipo,
            boolean esObservable, double periodoRotacion, double periodoOrbital ) {
        this.nombre = nombre;
        this.cantidadSatélites = cantidadSatélites;
        this.masa = masa;
        this.volumen = volumen;
        this.diámetro = diámetro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.esObservable = esObservable;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;      
    }
    public void imprimir() {
        System.out.println("Nombre del planeta = " + nombre);
        System.out.println("Cantidad de satélites = " + cantidadSatélites);
        System.out.println("Masa del planeta = " + masa);
        System.out.println("Volumen del planeta = " + volumen);
        System.out.println("Diámetro del planeta = " + diámetro);
        System.out.println("Distancia al sol = " + distanciaSol);
        System.out.println("Tipo de planeta = " + tipo);
        System.out.println("Es observable = " + esObservable);
        System.out.println("Periodo orbital = " + periodoOrbital + " años");
        System.out.println("Periodo de rotacion = " + periodoRotacion + " dias");
    }
    public double calcularDensidad() {
        return masa / volumen;
    }
    public boolean esPlanetaExterior() {
        float límite = (float) (149597870 * 3.4);
        if (distanciaSol > límite) {
            return true;
        } else {
            return false;
        }
    }
}
 