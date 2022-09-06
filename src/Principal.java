public class Principal {

    public static void main(String[] args) {
        Initialize initialize = new Initialize();
        initialize.initialize();

        int continuar = 1;

        while (continuar == 1) {

            QuantTemp quantTemp = new QuantTemp();
            int quantidade = quantTemp.quantidadeDeTemperatura(0);
            if (quantidade < 1) {
                break;
            }

            double[] tempInput = new double[quantidade];
            double[] tempOutput = new double[quantidade];

            GetUnityTemp getUnityTemp = new GetUnityTemp();
            UnityTemp unityInput = getUnityTemp.getUnityTemp("entrada");
            if (unityInput == UnityTemp.ANULAR) {
                break;
            }

            GetTemp getTemp = new GetTemp();
            for (int i = 0; i < quantidade; i++) {
                tempInput[i] = getTemp.getTemp(i + 1);
            }

            UnityTemp unityOutput = getUnityTemp.getUnityTemp("saída");
            if (unityOutput == UnityTemp.ANULAR) {
                break;
            }

            System.out.println("\n*-------------------- Resultado ----------------------------------------*\n");

            ToCelsius toCelsius = new ToCelsius();
            ToFahrenheit toFahrenheit = new ToFahrenheit();
            ToKelvin toKelvin = new ToKelvin();

            Graus consultaGraus = new Graus();
            String grausInput = consultaGraus.graus(unityInput);
            String grausOutput = consultaGraus.graus(unityOutput);

            double mediaInput = 0;
            double mediaOutput = 0;

            for (int i = 0; i < quantidade; i++) {
                switch (unityOutput) {
                    case CELSIUS:
                        tempOutput[i] = toCelsius.toCelsiusTransform(unityInput, tempInput[i]);
                        break;
                    case FAHRENHEIT:
                        tempOutput[i] = toFahrenheit.toFahrenheitTransform(unityInput, tempInput[i]);
                        break;
                    case KELVIN:
                        tempOutput[i] = toKelvin.toKelvinTransform(unityInput, tempInput[i]);
                        break;
                    default:
                        tempOutput[i] = 0;
                        break;
                }

                System.out.println(tempInput[i] + grausInput + unityInput + " equivalem a " + tempOutput[i] + grausOutput + unityOutput);

                mediaInput += tempInput[i];
                mediaOutput += tempOutput[i];
            }

            mediaInput /= quantidade;
            mediaOutput /= quantidade;

            System.out.println("\nA média das em temperaturas em " + unityInput + " é " + mediaInput + grausInput);
            System.out.println("A média das em temperaturas em " + unityOutput + " é " + mediaOutput + grausOutput);
            System.out.println("\n******************** Processo concluído! *******************************");

            ContinueOperation continueOperation = new ContinueOperation();
            continuar = continueOperation.continueOperation(0);

        }

        System.out.println("\nFim!");
    }
}