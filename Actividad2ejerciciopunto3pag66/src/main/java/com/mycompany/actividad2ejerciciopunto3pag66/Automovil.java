package com.mycompany.actividad2ejerciciopunto3pag66;
public class Automovil {
    static final int VALOR_MULTA = 200000;
    private String marca;
    private boolean automatico;
    private int numeroMultas = 0;
    private int modelo;
    private double motor;               
    private int velocidadActual = 0;
    private int númeroPuertas;
    private int cantidadAsientos;
    private int velocidadMáxima;
    private TipoColor color;
    private TipoCom tipoCombustible;
    private TipoA tipoAutomóvil;
    
    public Automovil(String marca, boolean automatico, int modelo, double motor,
            TipoCom tipoCombustible, TipoA tipoAutomóvil, int númeroPuertas,
            int cantidadAsientos, int velocidadMáxima, TipoColor color) {
        this.marca = marca;
        this.automatico = automatico;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomóvil = tipoAutomóvil;
        this.númeroPuertas = númeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMáxima = velocidadMáxima;
        this.color = color;
    }


    public String getMarca() { return marca; }
    public boolean getAutomatico() { return automatico; }
    public int getNumeroMultas() { return numeroMultas; }
    public int getModelo() { return modelo; }
    public double getMotor() { return motor; }
    public TipoCom getTipoCombustible() { return tipoCombustible; }
    public TipoA getTipoAutomóvil() { return tipoAutomóvil; }
    public int getNúmeroPuertas() { return númeroPuertas; }
    public int getCantidadAsientos() { return cantidadAsientos; }
    public int getVelocidadMáxima() { return velocidadMáxima; }
    public TipoColor getColor() { return color; }
    public int getVelocidadActual() { return velocidadActual; }

  
    public void setMarca(String marca) { this.marca = marca; }
    public void setAutomatico(boolean automatico) { this.automatico = automatico; }
    public void setNumeroMultas(int numeroMultas) { this.numeroMultas = numeroMultas; }
    public void setModelo(int modelo) { this.modelo = modelo; }
    public void setMotor(double motor) { this.motor = motor; }
    public void setTipoCombustible(TipoCom tipoCombustible) { this.tipoCombustible = tipoCombustible; }
    public void setTipoAutomóvil(TipoA tipoAutomóvil) { this.tipoAutomóvil = tipoAutomóvil; }
    public void setNúmeroPuertas(int númeroPuertas) { this.númeroPuertas = númeroPuertas; }
    public void setCantidadAsientos(int cantidadAsientos) { this.cantidadAsientos = cantidadAsientos; }
    public void setVelocidadMáxima(int velocidadMáxima) { this.velocidadMáxima = velocidadMáxima; }
    public void setColor(TipoColor color) { this.color = color; }
    public void setVelocidadActual(int velocidadActual) { this.velocidadActual = velocidadActual; }

 
    public void acelerar(int incrementoVelocidad) {
        if (velocidadActual + incrementoVelocidad <= velocidadMáxima) {
            velocidadActual = velocidadActual + incrementoVelocidad;
        } else {
            System.out.println("No se puede incrementar a una velocidad superior a la máxima del automóvil.");
            numeroMultas = numeroMultas + 1;   
        }
    }

    public void desacelerar(int decrementoVelocidad) {
        if (velocidadActual - decrementoVelocidad >= 0) {
            velocidadActual = velocidadActual - decrementoVelocidad;
        } else {
            System.out.println("No se puede decrementar a una velocidad negativa.");
        }
    }

    public void frenar() {
        velocidadActual = 0;
    }

    public double calcularTiempoLlegada(int distancia) {
        if (velocidadActual == 0) {
            System.out.println("No se puede calcular el tiempo: el automóvil está detenido.");
            return -1;
        }
        return (double) distancia / velocidadActual;
    }

    public boolean tieneMultas() {
        return numeroMultas > 0;
    }

    public int calcularValorTotalMultas() {
        return numeroMultas * VALOR_MULTA;
    }

    public void imprimir() {
        System.out.println("Marca = " + marca);
        System.out.println("Automático = " + automatico);
        System.out.println("Número de multas = " + numeroMultas);
        System.out.println("Modelo = " + modelo);
        System.out.println("Motor = " + motor + " L");
        System.out.println("Tipo de combustible = " + tipoCombustible);
        System.out.println("Tipo de automóvil = " + tipoAutomóvil);
        System.out.println("Número de puertas = " + númeroPuertas);
        System.out.println("Cantidad de asientos = " + cantidadAsientos);
        System.out.println("Velocidad máxima = " + velocidadMáxima + " km/h");
        System.out.println("Velocidad actual = " + velocidadActual + " km/h");
        System.out.println("Color = " + color);
    }
}
