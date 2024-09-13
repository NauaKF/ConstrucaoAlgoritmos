import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int escolha = 0;
        double primeiroValor = 0;
        double segundoValor = 0;
        double resultado = 0;

        System.out.println("Qual operação matemática deseja efetuar?: ");
        System.out.println("1 = Soma\n2 = Subtração\n3 = Divisão\n4 = Multiplicação: \n");
        escolha = scn.nextInt();

        if(escolha == 1){
            System.out.println("\nDigite o primeiro valor da Soma: ");
            primeiroValor = scn.nextDouble();
            System.out.println("Digite o segundo valor da Soma: ");
            segundoValor = scn.nextDouble();

            resultado = primeiroValor + segundoValor;

            System.out.println("A Soma de " + primeiroValor + " + " + segundoValor + " = " + resultado);
        } else if(escolha == 2){
            System.out.println("\nDigite o primeiro valor da Subtração: ");
            primeiroValor = scn.nextDouble();

            System.out.println("Digite o segundo valor da Subtração: ");
            segundoValor = scn.nextDouble();

            resultado = primeiroValor - segundoValor;

            System.out.println("A Subtração de " + primeiroValor + " - " + segundoValor + " = " + resultado);
        } else if(escolha == 3){
            System.out.println("\nDigite o primeiro valor da Divisão: ");
            primeiroValor = scn.nextDouble();

            System.out.println("Digite o segundo valor da Divisão: ");
            segundoValor = scn.nextDouble();

            resultado = primeiroValor / segundoValor;

            System.out.println("A Divisão de " + primeiroValor + " / " + segundoValor + " = " + resultado);
        } else if(escolha == 4){
            System.out.println("\nDigite o primeiro valor da Multiplicação: ");
            primeiroValor = scn.nextDouble();

            System.out.println("Digite o segundo valor da Multiplicação: ");
            segundoValor = scn.nextDouble();

            resultado = primeiroValor * segundoValor;

            System.out.println("A Multiplicação de " + primeiroValor + " * " + segundoValor + " = " + resultado);
        } else{
            System.out.println("Numero invalido, tente novamente!");
        }
    }
}