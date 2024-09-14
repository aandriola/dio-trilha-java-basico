import java.util.Scanner;
public class ContaBanco {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Olá Vamos iniciar a criação de sua conta!");
        
        System.out.print("Por favor, Informe o codigo da sua conta EX 1021 : ");
        int conta = lerInteiroPositivo(scanner);

        System.out.print("Agora Informe a agência EX 067-8 : ");
        String agencia = scanner.next();
        
        System.out.print("Qual Seu Nome? : ");
        String nome = scanner.next();

        System.out.print("Saldo Inicial : ");
        float saldo = scanner.nextFloat();

        scanner.close();

        System.out.println("Olá " + nome + " , obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$"+ saldo +" já está disponível para saque");

    }
        
        private static int lerInteiroPositivo(Scanner scanner) {
            int valor;
            do {
                while (!scanner.hasNextInt()) {
                    System.out.print("Valor inválido. Digite um número inteiro positivo: ");
                    scanner.next();
                }
                valor = scanner.nextInt();
            } while (valor <= 0);
            return valor;
        }

    
}
