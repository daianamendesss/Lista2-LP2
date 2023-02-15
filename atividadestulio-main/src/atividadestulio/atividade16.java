package Pacotedeatividades1Tulio;

import java.util.Scanner;

public class atividade16 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("digite uma palavra");
        
        String palavra = scan.next();
        int cont = 0;
        int i = 0;
        while(i < palavra.length()) {
                i++;               
        }
        
        if(palavra.substring(i, i-1).equals("a") ||
                palavra.substring(i, i-1).equals("A")){
            cont++;
        }        
        System.out.println(i);
    }
    
}
