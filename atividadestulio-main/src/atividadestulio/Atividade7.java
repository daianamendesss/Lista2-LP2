
package Pacotedeatividades1Tulio;

import java.util.Scanner;


public class Atividade7 {
    public static void main(String[] args) {
         
        Scanner input= new Scanner(System.in);
        
        float nota1,nota2,nota3,nota4;
        System.out.println("Digite o valor da 1 nota: ");
        nota1=input.nextFloat();
        System.out.println("Digite o valor da 2 nota: ");
        nota2=input.nextFloat();
        System.out.println("Digite o valor da 3 nota: ");
        nota3=input.nextFloat();
        System.out.println("Digite o valor da 4 nota: ");
        nota4=input.nextFloat();
        
        float media=(nota1+nota2+nota3+nota4)/4;
    
        if(media<=3.49f){
            System.out.println("Reprovado");
        }else if(media>=3.5f && media<=6.49f){
            System.out.println("Recuperação");
        }else if(media>6.5f){
            System.out.println("Aprovado!");
        }
    
    }
}
