import java.util.Scanner;

public class GetUnityTemp {
    public UnityTemp getUnityTemp(String io) {
        Scanner input = new Scanner(System.in);
        System.out.println("*-----------------------------------------------------------------------*");
        System.out.println("           Menu de unidades de temperaturas de " + io + "                ");
        System.out.println("*-----------------------------------------------------------------------*");
        System.out.println("|   -CELSIUS                                                            |");
        System.out.println("|   -FAHRENHEIT                                                         |");
        System.out.println("|   -KELVIN                                                             |");
        System.out.println("*-----------------------------------------------------------------------*");
        System.out.println("\nEscreva a sua opção ou SAIR para sair do programa:");
        String typeString = input.next().toUpperCase();

        try {
            return UnityTemp.valueOf(typeString);
        } catch (IllegalArgumentException e) {
            if (typeString.equals("SAIR")) {
                return UnityTemp.ANULAR;
            }
            System.err.println("Unidade incorreta. " + e.getMessage());
            return getUnityTemp(io);
        }
    }
}
