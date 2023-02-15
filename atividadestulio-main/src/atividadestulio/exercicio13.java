package Pacotedeatividades1Tulio;


import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o os numeros populacionais: ");
        int populacao = scan.nextInt();
        System.out.println("Entre com os dias dias: ");
        int dia = scan.nextInt();
        
        if(populacao <=4){
            int valor1= 160;
            System.out.println(populacao * valor1 * dia);
        }
        if(populacao >= 5 && populacao <= 8) {
                int valor2 = 120;
                
            System.out.println(populacao * valor2 * dia);

        }
        if(populacao > 8) {
            int valor3 = 80;
            
            
            System.out.println(populacao * valor3 * dia);
        }

    }
    
}