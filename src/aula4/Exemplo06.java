package aula4;

import java.util.Scanner;

public class Exemplo06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("\n\nDigite um valor para exibir a tabuada: ");
        int valor = teclado.nextInt();
        System.out.println("\n");

        
        //inputs da repetição
        //valor inicial
        //condição de parada
        //incremento
        
        int i = 1;
        while(i <= 10){
            System.out.println(valor  + " X " + i + " = " + (i*valor));  
            i++;
        }
    }
    
}
