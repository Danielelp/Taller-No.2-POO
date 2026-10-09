package com.mycompany.actividad2ejerciciopunto4pag86;
public class Rectangulo {
   
        int base; 
        int altura; 

    Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
}

    double calcularArea() {
        return base * altura;
}

    double calcularPerímetro() {
        return (2 * base) + (2 * altura);
        }

}

