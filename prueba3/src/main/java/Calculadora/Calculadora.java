/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import java.util.ArrayList;

/**
 *
 * @author samuelson
 */
public class Calculadora {
    public Calculadora(){
        
    }
    
    public int sumar(int primero, int segundo){
        return (primero+segundo);
    }
    public int multiplicar(int primero, int segundo){
        return (primero*segundo);
    }
    public int mayor(int primero, int segundo){
        if (primero > segundo) {
            return primero;
        }else{
            return segundo;
        }
    }
    public int potiencia(int primero, int segundo){
        return (int)Math.pow(primero, segundo);
    }
    
    public String binario(int numero){
   ArrayList<String> binario = new ArrayList<>();
   int residuo;
   String resultado = "";

   do{
      residuo = numero%2;
      numero = numero/2;
      binario.add(0, Integer.toString(residuo));
   }while(numero > 2);
   
   binario.add(0, Integer.toString(numero));
   for(int i = 0; i < binario.size(); i++){
       resultado += binario.get(i);
   }
   return resultado;
 }
}
