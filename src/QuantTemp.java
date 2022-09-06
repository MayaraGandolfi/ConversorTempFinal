import java.util.Scanner;

public class QuantTemp {

    public int quantidadeDeTemperatura(int tentativas) {
        if (tentativas > 2) {
            System.out.println("Ultrapassou a quantidade de tentativas incorretas. - Processo será finalizado!");
            return 0;
        }
        Scanner input = new Scanner(System.in);
        System.out.println("-Digite a quantidade de temperaturas que gostaria de converter:");


        try {
            int quantidade = input.nextInt();
            if (quantidade < 1){
                System.err.println("Quantidade Incorreta!");
                return quantidadeDeTemperatura(tentativas+1);
            }
            return quantidade;
        } catch (java.util.InputMismatchException e) {
            System.err.println("Quantidade Incorreta! - " + e.getMessage());
            return quantidadeDeTemperatura(tentativas+1);
        }
    }
}
