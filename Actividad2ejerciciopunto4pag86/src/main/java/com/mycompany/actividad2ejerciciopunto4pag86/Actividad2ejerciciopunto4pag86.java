package com.mycompany.actividad2ejerciciopunto4pag86;
public class Actividad2ejerciciopunto4pag86 {

    public static void main(String[] args) {
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1,2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectacgulo figura4 = new TrianguloRectacgulo(3,5);
        Rombo figura5 = new Rombo(7,3);
        Trapecio figura6 = new Trapecio(10, 6, 4);
            System.out.println("El área del círculo es = " + figura1.calcularArea());
            System.out.println("El perímetro del círculo es = " + figura1.calcularPerímetro());
            System.out.println();
            System.out.println("El área del rectángulo es = " + figura2.calcularArea());
            System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerímetro());
            System.out.println();
            System.out.println("El área del cuadrado es = " + figura3.calcularArea());
            System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerímetro());
            System.out.println();
            System.out.println("El área del triángulo es = " + figura4.calcularArea());
            System.out.println("El perímetro del triángulo es = " + figura4.calcularPerímetro());
            figura4.determinarTipoTriángulo();
            System.out.println("El área del rombo es = "+ figura5.calcularArea());
            System.out.println("El Perimetro del rombo es = " + figura5.calcularPerimetro());
            System.out.println("El área del trapecio es = " + figura6.calcularArea());
            System.out.println("El perímetro del trapecio es = " + figura6.calcularPerimetro());
}
}
 

