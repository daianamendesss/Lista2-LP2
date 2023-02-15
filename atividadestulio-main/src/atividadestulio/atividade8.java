package atividadestulio;
import java.util.Scanner;

public class atividade8 {
     public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);
         
         System.out.println("digite a altura da parede: ");
         int alturaParede=input.nextInt();
         System.out.println("digite a largura da parede: ");
         int larguraParede=input.nextInt();
            
         System.out.println("digite a altura do azulejo: ");
         int alturaAzulejo=input.nextInt();
         System.out.println("digite a largura do azulejo: ");
         int larguraAzulejo=input.nextInt();
  
          
         int  perimetroazulejo=(2*(alturaParede+larguraParede))/(2*(alturaAzulejo+larguraAzulejo));
         System.out.println("você utilizará "+perimetroazulejo+" m² de azulejo");
         
         int  quantideAzulejo=(alturaParede/alturaAzulejo)*(larguraParede/larguraAzulejo);
         
          System.out.println("você utilizará "+quantideAzulejo+" quantidades de azulejo");
         
         
     }
}
