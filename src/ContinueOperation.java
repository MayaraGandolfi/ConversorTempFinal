import java.util.Scanner;

public class ContinueOperation {

    public int continueOperation() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nVocê deseja:");
        System.out.println("0 - Finalizar o sistema");
        System.out.println("1 - Fazer uma nova operação");
        System.out.println("Digite a opção numerica:");
        // return input.nextInt();
        try {
            int opcao = input.nextInt();
            if (opcao < 0 || opcao > 1) {
                System.out.println("Opção inválida. Sistema será finalizado!");
                opcao = 0;
            }
            return opcao;
        } catch (java.util.InputMismatchException e) {
            System.err.println("Opção Incorreta! - " + e.getMessage());
            System.out.println("Sistema será finaizado");
            return 0;
        }

    }

}
