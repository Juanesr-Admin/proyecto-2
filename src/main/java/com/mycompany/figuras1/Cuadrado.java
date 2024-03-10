
package com.mycompany.figuras1;

public class Cuadrado extends figuras {
    
   public Cuadrado(double lado){
       super(lado);
   }
   public void operar(){
       resultado = lado*lado;
   }
}
