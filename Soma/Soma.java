import java.util.Scanner;

public class Soma{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int primeiroValor = 0, segundoValor = 0, resultado = 0;

        System.out.println("Digite o primeiro valor da Soma: ");
        primeiroValor = scn.nextInt();

        System.out.println("Digite o segundo valor da Soma: ");
        segundoValor = scn.nextInt();

        resultado = primeiroValor + segundoValor;

        System.out.println("A soma de " + primeiroValor + " + " + segundoValor + " = " + resultado);        
    }
}