
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da Agencia.");
        String numeroAgencia = sc.nextLine(); // Solicitando o número da agência
        System.out.println("Por favor, digite o numero da Conta.");
        int numeroConta = sc.nextInt(); // Solicitando o número da conta
        sc.nextLine(); // Consumindo a quebra de linha pendente
        System.out.println("Por favor, digite o seu nome.");
        String nomeCliente = sc.nextLine(); // Solicitando o nome do cliente
        System.out.println("Por favor, digite seu Saldo");
        double saldo = sc.nextDouble(); // Solicitando o saldo da conta

        // Exibindo as informações da conta
        System.out.printf("Ola %s obrigado por criar uma conta em nosso banco.\nSua agencia e %s, conta %d e seu saldo %.2f ja esta disponivel para saque.", nomeCliente, numeroAgencia, numeroConta, saldo);

    }

}
