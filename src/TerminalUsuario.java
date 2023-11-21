import java.util.Scanner;

public class TerminalUsuario {
    public static void main(String[] args) {
        ContaTerminal contaterminal = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência :");
        int numero = scanner.nextInt();

        System.out.println("Olá "+contaterminal.nome()+", obrigado por criar uma conta em nosso banco, sua agência é "+contaterminal.numeroAgencia()+", conta "+numero+" e seu saldo "+contaterminal.valorDeSaldo()+" já está disponível para saque.");
    }
}
