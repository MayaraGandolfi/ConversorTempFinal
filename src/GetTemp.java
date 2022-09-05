import java.util.Scanner;

public class GetTemp {
    public double getTemp(int x) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a temperatura " + x + ": ");
        try {
            return input.nextDouble();
        } catch (java.util.InputMismatchException e) {   // tudo exceotion
            System.err.println("Entrada inválida! - " + e.getMessage());
            return getTemp(x);
        }
    }
}
