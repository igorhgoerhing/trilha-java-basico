import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Variavel que recebe o numero da conta.
        System.out.println("Por favor, digite o numero da sua conta: ");
        int numeroConta = scanner.nextInt();
        
        // Variavel que recebe o numero da agencia.
        System.out.println("Por favor, digite o numero da sua agência: ");
        String numeroAgencia = scanner.next();

        // Variavel que recebe o nome do cliente.
        System.out.println("Por favor, digite seu nome : ");
        String nomeCliente = scanner.next();

        // Variavel que recebe o saldo do cliente.
        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

       
        System.out.println("Olá " + nomeCliente +  " , obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + " conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque ");
        
        
        


    }
}    