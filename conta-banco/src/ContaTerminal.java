import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========Terminal Financeiro==========");
        System.out.print("Digite seu nome: ");
        String nomeCliente = scanner.next();
        System.out.print("Insira sua agência: ");
        String agencia = scanner.next();
        System.out.print("Insira o número da sua conta: ");
        int numero = scanner.nextInt();
        System.out.print("Insira seu saldo: ");
        double saldo = scanner.nextDouble();
         
        scanner.close();
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+"e seu saldo "+saldo+" já está disponível para saque");
    }
}
