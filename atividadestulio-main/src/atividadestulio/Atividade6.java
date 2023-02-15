
package Pacotedeatividades1Tulio;

import java.util.Scanner;

public class Atividade6 {
     public static void main(String[] args) {
         
        Scanner input= new Scanner(System.in);
           
        int b;
        int h;
         
        System.out.println("Somador de area e perimetros de um retangulo: ");
         
        System.out.println("Digite o valor da base do retangulo: ");
        b=input.nextInt();
         
        System.out.println("Digite o valor da altura do retangulo: ");
        h=input.nextInt();
        
        int area=b*h;
        
        System.out.println("A area do retangulo é: " + area);
        
        int perimetro=(2*b)+(2*h);
        
         System.out.println("o perimetro é: "+ perimetro);
            
     }
}
