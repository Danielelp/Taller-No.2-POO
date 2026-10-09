package com.mycompany.actividad2ejerciciopunto5pag95;

public class CuentaBancaria {

    String nombresTitular;
    String apellidosTitular;
    long numeroCuenta;
    tipo tipoCuenta;
    double saldo = 0;
    double porcentajeInteresMensual = 0;

    public CuentaBancaria(String nombresTitular, String apellidosTitular, long numeroCuenta,
            tipo tipoCuenta, double porcentajeInteresMensual) {
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.porcentajeInteresMensual = porcentajeInteresMensual;
    }

    public void imprimir() {
        System.out.println("Nombres del titular = " + nombresTitular);
        System.out.println("Apellidos del titular = " + apellidosTitular);
        System.out.println("Número de cuenta = " + numeroCuenta);
        System.out.println("Tipo de cuenta = " + tipoCuenta);
        System.out.println("Saldo = $" + saldo);
        System.out.println("Porcentaje de interés mensual = " + porcentajeInteresMensual + "%");
    }

    public void consultarSaldo() {
        System.out.println("El saldo actual es = $" + saldo);
    }

   public void consignar(double valor) {
        saldo = saldo + valor;
        System.out.println("Se ha consignado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
    
        }
    

    public void retirar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Se ha retirado $" + valor + " de la cuenta. El nuevo saldo es $" + saldo);
        } else {
            System.out.println("No se puede realizar el retiro. El valor supera el saldo actual de la cuenta.");
        }
    }
    

    public void aplicarInteresMensual() {
        double interes = (saldo * porcentajeInteresMensual) / 100;
        saldo = saldo + interes;
        System.out.println("Se aplicó un interés del " + porcentajeInteresMensual
                + "% ($" + interes + "). Nuevo saldo: $" + saldo);
    }

}

