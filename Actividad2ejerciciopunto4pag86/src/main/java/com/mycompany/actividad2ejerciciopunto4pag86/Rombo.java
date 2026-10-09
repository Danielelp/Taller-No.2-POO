package com.mycompany.actividad2ejerciciopunto4pag86;

public class Rombo {
    
    int diagonal1;
    int diagonal2;
    
    public Rombo(int diagonal1, int diagonal2){
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
}
    
    public double calcularArea(){
       return (diagonal1 * diagonal2) / 2.0;
}
    
    public double calcularPerimetro(){
        double mitadD1 = diagonal1 / 2.0;
        double mitadD2 = diagonal2 / 2.0;
        double lado = Math.sqrt(Math.pow(mitadD1, 2) + Math.pow(mitadD2, 2));
        return 4 * lado; 
        
}           
}
