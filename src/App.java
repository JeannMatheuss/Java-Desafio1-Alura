import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner opcao = new Scanner(System.in);
        
        System.out.println("****************************************");
        System.out.println("Dados Iniciais do Cliente: ");
        System.out.println("Nome:               Jean Matheus");
        System.out.println("Tipo de Conta:      Corrente");

        int saldo = 2500;

        System.out.println("Saldo da Conta:        " + saldo + "R$");
        System.out.println("****************************************");

        System.out.println("Operações");
        System.out.println("1 - Consultar saldos");
        System.out.println("2 - Receber valor");
        System.out.println("3 - Transferir valor");
        System.out.println("4 - Sair");

        System.out.println("Escolha uma opção: ");
        int escolha = opcao.nextInt();
    }
}
