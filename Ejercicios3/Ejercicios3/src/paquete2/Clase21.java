/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Clase21 {
    
    public static void main(String[] args) {
        
        boolean bandera;
        int valor1 = 1;
        int valor2 = 10;
        
        bandera = valor1 < valor2;
        
        // resultado de bandera con comparativo
        System.out.printf("El resultado de bandera es: %s\n", bandera);
        
        bandera = (valor1 < valor2) & (valor1 > valor2); // Producto lógico – \AND (binario)
        
        // resultado de bandera con AND
        System.out.printf("El resultado de bandera es: %s\n", bandera);
        
        // resultado de bandera con OR
        bandera = (valor1 < valor2) | (valor1 > valor2);
        
        System.out.printf("El resultado de bandera es: %s\n", bandera);
        
        // Resultado de bandera con OR pero utilizando negación (!)
        bandera = !((valor1 < valor2) | (valor1 > valor2)); // Negación - NOT (unario)
        
        System.out.printf("El resultado de bandera es: %s\n", bandera);
    }
    
}
