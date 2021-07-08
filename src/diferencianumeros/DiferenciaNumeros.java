/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diferencianumeros;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author JUAN
 */
public class DiferenciaNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []arreglo = new int[10];
        
        String dato;
        int numero;
        int resultado=0;
        int suma=0;
        int num1 =0;
        int num2=0;
        
        
        for (int i=0; i<arreglo.length; i++){
            dato = JOptionPane.showInputDialog( "Ingrese dato Numero "+ ( i + 1 ) );
            
            numero = Integer.parseInt( dato );
            
            arreglo[ i ] = numero;  
        }
        
        for (int i=0; i<arreglo.length; i++)
        {
            
            num1 = arreglo[i];
            num2 = arreglo[i];
           
        }
        
        for(int i = 0; i<10; i++){
            suma =  num1 + num2;
        }
        
        for(int i = 0; i<10; i++){
            resultado =  num2 - num1;
        }
        
        System.out.println("La suma de los numeros es "+suma+" y la diferencia es "+resultado);
        
        
        
    }
    
}
