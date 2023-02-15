
package Pacotedeatividades1Tulio;

import java.util.Scanner;

public class Atividade5 {
        public static void main(String[] args) {
            
                Scanner input= new Scanner(System.in);
                
                System.out.println("Qual o seu sexo? Masculino: 'M' Feimenino: 'F' ");
                char sexo=input.next().charAt(0);
                
                System.out.println("Qual o seu peso? ");
                float peso= input.nextFloat();
                
                 System.out.println("Qual a sua altura? ");
                float altura=input.nextFloat();
                
                float IMC=peso/(altura*altura);
                
                if(sexo=='m'){
                    if(IMC<20.7f){
                        System.out.println("Abaixo do peso");
                    }
                    else if(IMC>=20.7f && IMC<=26.4f){
                        System.out.println("Peso ideal");
                    }
                    else{
                        System.out.println("Obeso");
                    }
                }else if(sexo=='f'){
                    if(IMC<19.1f){
                        System.out.println("Abaixo do peso");
                    }
                    else if(IMC>=19.1f && IMC<=25.8f){
                        System.out.println("Peso ideal");
                    }
                    else{
                        System.out.println("Obeso");
                    }
                }
                
                
                
        }
}
