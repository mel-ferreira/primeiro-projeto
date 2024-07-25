import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {
        String nome = "Carmen Berzatto";
        String tipoConta = "Corrente";
        double saldo = 1800;
        int escolha = 0;

        System.out.println("##################");

        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo disponível: " + saldo);

        System.out.println("\n##################");

        String menu = """
                \n##Digite sua opção##
                1 - Consultar valor disponível
                2 - Transferir dinheiro
                3 - Receber/Depósito
                4 - Sair   
                \n""";

        Scanner leitura = new Scanner(System.in);

        while (escolha != 4) {
            System.out.println(menu);
            escolha = leitura.nextInt();

            if (escolha == 1) {
                System.out.println("\nO saldo atual é: " + saldo);
            } else if (escolha == 2) {
                System.out.println("\nQual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("\nNão há saldo para transferência");
                } else {
                    saldo -= valor;
                    System.out.println("\nNovo saldo: " + saldo);
                }
            } else if (escolha == 3) {
                System.out.println("\nQual o valor que deseja depositar?");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("\nNovo saldo: " + saldo);
            } else if (escolha != 4) {
                System.out.println("\nOpção inválida");
            }
        }

        leitura.close();
    }
}
