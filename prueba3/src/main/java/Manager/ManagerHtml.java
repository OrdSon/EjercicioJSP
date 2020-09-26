/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Calculadora.Calculadora;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletRequest;

/**
 *
 * @author samuelson
 */
public class ManagerHtml {

    public ManagerHtml() {
        
    }

    public LinkedList<String> calcular(ServletRequest request) {
        LinkedList<String> resultados = new LinkedList<>();
        try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(ManagerHtml.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (request.getParameter("texto1") != null && request.getParameter("texto2") != null){
            String valor1 = request.getParameter("texto1");
            String valor2 = request.getParameter("texto2");
            if (valor1.isBlank()) {
                valor1 = "0";
            }
            if (valor2.isBlank()) {
                valor2 = "0";
            }
            int first = Integer.parseInt(valor1);
            int second = Integer.parseInt(valor2);
            Calculadora calculadora = new Calculadora();
            
            if (request.getParameter("check1") != null) {
                resultados.add("Suma: "+calculadora.sumar(first, second)+"");
            }
            if (request.getParameter("check2") != null) {
                resultados.add("Multiplicacion: "+ calculadora.multiplicar(first, second)+"");
            }
            if (request.getParameter("check3") != null) {
                resultados.add("Mayor "+calculadora.mayor(first, second)+"");
            }
            if (request.getParameter("check4") != null) {
                resultados.add("Potencia: "+calculadora.potiencia(first, second)+"");
            }
            if (request.getParameter("check5") != null) {
                resultados.add("Binario1: "+calculadora.binario(first));
                resultados.add("Binario2: "+calculadora.binario(second));
            }
        }
        if (resultados.isEmpty()) {
            resultados.add("Sin selección");
        }
        return resultados;
    }
    
     
}
