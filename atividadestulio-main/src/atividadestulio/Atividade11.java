package atividadestulio;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        
     Scanner input = new Scanner(System.in);
     
    float valordia = 45.00f;
    float cortesia=60.00f;
    int quantidadeDias;
    
    System.out.println("digite quantos dias voce ficou com o carro");
    quantidadeDias=input.nextInt();
    
    System.out.println("digite quanto voce andou com o carro: ");
    float km=input.nextFloat();
    
    if(km<60.00f){
    System.out.println("o valor a pagar é: 45,00");
    }else{
        
     float kmRodado = (quantidadeDias*valordia)+((km-60)*0.50f); 
     System.out.println("o valor a pagar é R$: "+kmRodado);
            
        }
    }
}
