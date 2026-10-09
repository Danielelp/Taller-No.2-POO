package com.mycompany.actividad2ejerciciopunto4pag86;
public class Cuadrado {
    
    int lado; 
    
public Cuadrado(int lado) {
    this.lado = lado;
}

    double calcularArea() {
        return lado*lado;
}

    double calcularPerímetro() {
        return (4*lado);
    
    }
}
