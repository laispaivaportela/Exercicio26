/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio26;

/**
 *
 * @author laisp_omzy4s1
 */
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercicio26 {

   public static void main(String[] args) {
       //Scanner scanner = new Scanner(System.in);
       int[] numeros = new int[20];
       for (int i = 0; i < numeros.length; i++) {
            
          //  numeros[i] = scanner.nextInt();
              numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
   }
       
   
   for (int i = 1; i < numeros.length; i++) {
    for (int j = 0; j < i; j++) {
        if (numeros[i] < numeros[j]) {
            int temp = numeros[i];
            numeros[i] = numeros[j];
            numeros[j] = temp;
        }
    }
}

 for (int i = 0; i < numeros.length; i++) {
            
            JOptionPane.showMessageDialog(null, numeros[i]); 
      
   }
  
 
   

   }
    
}
