package com.mycompany.actividad2ejerciciopunto5pag95;

public class Actividad2ejerciciopunto5pag95 {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Pedro", "Perez", 123456789, tipo.AHORROS, 2);
        cuenta.imprimir();
        System.out.println();
        cuenta.consultarSaldo();
        cuenta.consignar(100000);
        cuenta.aplicarInteresMensual();  
        cuenta.retirar(50000);    
        cuenta.retirar(500000);
        System.out.println();
        cuenta.consultarSaldo();
    }
}

