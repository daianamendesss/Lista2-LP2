package Pacotedeatividades1Tulio;
import java.util.Scanner;

public class Atividade4 {
    
    
   public static void main(String[] args) {
       
    System.out.println("Digite um valor em dolar: ");
    Scanner input = new Scanner(System.in);
        
       float dolar= input.nextFloat();
       
       float reais= (dolar*5.10f);
       
    
       	System.out.printf("O valor em em reais é %.2f\n",reais);
   }
}
