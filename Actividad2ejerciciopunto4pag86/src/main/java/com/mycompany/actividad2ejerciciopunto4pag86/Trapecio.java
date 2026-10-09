package com.mycompany.actividad2ejerciciopunto4pag86;
public class Trapecio {
    int baseMayor;
    int baseMenor;
    int altura;
    
    public Trapecio(int baseMayor, int baseMenor, int altura){
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
}
    
    public double calcularArea(){
        return ((baseMayor + baseMenor) * altura) / 2.0;
}
    
    public double calcularPerimetro(){
        double baseTriangulo = Math.abs(baseMayor - baseMenor) / 2.0;
        double lado = Math.sqrt(Math.pow(baseTriangulo, 2) + Math.pow(altura, 2));
            return baseMayor + baseMenor + (2 * lado);
}
}
