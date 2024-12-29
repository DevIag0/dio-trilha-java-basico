import java.util.Scanner;

public class ContaTerminal {
   public ContaTerminal() {
   }

   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      System.out.println("Por favor, digite o n\u00famero da ag\u00eancia:");
      String agencia = scanner.nextLine();
      
      System.out.println("Por favor, digite o n\u00famero da conta:");
      int numero = scanner.nextInt();
      
      scanner.nextLine();
      
      System.out.println("Por favor, digite o nome do cliente");
      String nomeCliente = scanner.nextLine();
      
      System.out.println("Por favor, digite o saldo do cliente:");
      double saldo = scanner.nextDouble();
      
      System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco sua ag\u00eancia \u00e9 " + agencia + ", conta " + numero + " e seu saldo " + saldo + " ja esta disponivel.");
      
      scanner.close();
   }
}
