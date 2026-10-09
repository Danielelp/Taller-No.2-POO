package com.mycompany.actividad2ejerciciopunto3pag66;

public class Actividad2ejerciciopunto3pag66 {

    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Ford", true, 2018, 3.0, TipoCom.DIESEL,
                TipoA.EJECUTIVO, 5, 6, 250, TipoColor.NEGRO);
        auto1.imprimir();
        auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        auto1.acelerar(20);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        auto1.desacelerar(50);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        auto1.frenar();
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        auto1.desacelerar(20);   
        auto1.setVelocidadActual(240);
        auto1.acelerar(20);    
        auto1.acelerar(30);      
        System.out.println("¿Tiene multas? = " + auto1.tieneMultas());
        System.out.println("Numero de multas = " + auto1.getNumeroMultas());
        System.out.println("Valor total de multas = " + auto1.calcularValorTotalMultas());
        System.out.println("Tiempo estimado para 150 km = " + auto1.calcularTiempoLlegada(150) + " h");
    }
}