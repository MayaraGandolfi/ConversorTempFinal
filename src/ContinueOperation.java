import java.util.Scanner;

public class ContinueOperation {

    public int continueOperation() {
        Scanner input = new Scanner(System.in);

        System.out.println("\n*-----------------------------------------------------------------------*");
        System.out.println("                Menu de opções");
        System.out.println("*-----------------------------------------------------------------------*");
        System.out.println("|   0 - Finalizar o sistema                                             |");
        System.out.println("|   1 - Fazer uma nova operação                                         |");
        System.out.println("*-----------------------------------------------------------------------*");
        System.out.println("\nDigite a opção NUMERICA:");
        try {
            int opcao = input.nextInt();
            if (opcao == 0 || opcao == 1) {
                return opcao;
            }
            System.out.println("Opção inválida. Sistema será finalizado!");
            opcao = 0;
            return opcao;
        } catch (java.util.InputMismatchException e) {
            System.err.println("Opção Incorreta! - " + e.getMessage());
            System.out.println("O sistema será finaizado!");
            return 0;
        }

    }

}
