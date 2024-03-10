package com.mycompany.figuras1;


public class figura {
    
    private double base;
    private double altura;
    private double lado;
    double resultado;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void resultado(){
        System.out.println(resultado);
    }
    
    public figura(){
        
    }
    
    public abstract void operar();
}
