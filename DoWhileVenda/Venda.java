import java.util.Scanner;

public class Venda{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        double valor = 0.0, pagamento = 0.0, aux = 0.0, valorpago = 0.0;

        System.out.println("Digite o valor do produto: ");
        valor = scn.nextDouble();

        do{
            System.out.println("Digite o valor que deseja pagar: ");
            pagamento = scn.nextDouble();

            aux = pagamento;
            valorpago = valorpago + aux;
        }while(valor != valorpago);

        System.out.println("\nO valor foi pago por completo!");
    }
}