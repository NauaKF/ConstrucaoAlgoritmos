import java.util.Scanner;

public class Prova {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Vetores para armazenar os pesos e as notas
        Double[] vetorPeso = new Double[4];
        Double[] vetorNotas = new Double[4];

        char escolhaSaida = ' ';

        double mediafinal = 0.0, minimo = 0.0;

        // Leitura dos pesos
        for (int i = 0; i < vetorPeso.length; i++) {
            System.out.println("Digite o peso da nota " + (i + 1) + " [Exemplo: 0,15]:");
            vetorPeso[i] = scn.nextDouble();
        }

        // Leitura da média mínima para aprovação
        System.out.println("\nDigite a média mínima para a aprovação:");
        minimo = scn.nextDouble();

        //Verifica se a média mínima está entre 0 e 10
        if(minimo < 0 || minimo > 10){
            System.out.println("Media minima invalida! Digite novamente:");
            minimo = scn.nextDouble();
        }

        do {
            mediafinal = 0.0;  // Reinicia a média a cada nova operação

            System.out.println();

            // Leitura das notas
            for (int i = 0; i < vetorNotas.length; i++) {
                System.out.println("Digite a nota " + (i + 1) + ":");
                vetorNotas[i] = scn.nextDouble();

                //Verifica se as notas estão entre 0 e 10
                if(vetorNotas[i] < 0 || vetorNotas[i] > 10){
                    System.out.println("Nota invalida! Digite novamente:");
                    vetorNotas[i] = scn.nextDouble();
                }
            }

            // Cálculo da média final
            for (int i = 0; i < vetorNotas.length; i++) {
                mediafinal += vetorNotas[i] * vetorPeso[i];
            }

            // Verificação da média e resultado
            if (mediafinal >= 0 && mediafinal <= 10) {
                if (mediafinal >= minimo) {
                    System.out.println("\nAprovado! Sua média = " + mediafinal);
                } else {
                    System.out.println("\nReprovado! Sua média = " + mediafinal);
                }
            } else {
                System.out.println("\nErro! A média final calculada é inválida (fora do intervalo de 0 a 10).");
            }

            // Método de saída
            System.out.println("\nDeseja realizar outra operação? s - sim, qualquer tecla para sair.");
            escolhaSaida = scn.next().charAt(0);

        } while (escolhaSaida == 's' || escolhaSaida == 'S');

        scn.close(); 
    }
}