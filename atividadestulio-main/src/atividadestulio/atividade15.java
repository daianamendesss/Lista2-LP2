package Pacotedeatividades1Tulio;

import java.util.Scanner;

public class atividade15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite os numeros: ");
        int num = scan.nextInt();

        
        String numStr = Integer.toString(num);
        String numStrInvertido = "";

        for (int i = numStr.length() - 1; i >= 0; i--) {
            
            numStrInvertido += numStr.substring(i, i + 1);
    
  
            
        }

        if (numStr.equals(numStrInvertido)) {
            System.out.println(num + " é capicua.");
        } else {
            System.out.println(num + " não  capicua.");
        }
    }
}