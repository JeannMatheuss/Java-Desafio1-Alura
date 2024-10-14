import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nome = "Peter Parker";
        String tipoConta = "Corrente";
        double saldo = 2500;
        int opcao = 0;
        
        System.out.println("****************************************");
        System.out.println("\nDados Iniciais do Cliente: ");
        System.out.println("\nNome:               " + nome);
        System.out.println("Tipo de Conta:      " + tipoConta);
        System.out.println("Saldo da Conta:        " + saldo + "R$");
        System.out.println("\n****************************************");

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.println("Operações");
            System.out.println("1 - Consultar saldos");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");

            opcao = leitura.nextInt();
        }
        

        
    }
}
