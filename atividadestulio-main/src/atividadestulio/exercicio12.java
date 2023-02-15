package Pacotedeatividades1Tulio;
import java.util.Scanner;

public class exercicio12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o valor da renda: ");
    double rendasalarial = sc.nextDouble();
    
    double irpf = 0;
    if (rendasalarial <= 10800) {
      System.out.println("Isento de pagamento");
    } else if (rendasalarial <= 21600) {
      irpf = (rendasalarial * 0.15) - 1620;
    } else {
      irpf = (rendasalarial * 0.275) - 4320;
    }
    
    if (irpf > 0) {
      System.out.println("O IRPF Simples a ser pago é de R$" + irpf);
    }
  }
}