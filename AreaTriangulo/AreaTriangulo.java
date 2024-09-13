import java.util.Scanner;

public class AreaTriangulo{
    public static void main(String[] args) {

        int base = 0, altura = 0, area = 0, escolha = 0;
        double raio = 0, areaC = 0;
        Scanner scn = new Scanner(System.in);

        System.out.println("Esse programa calcula a area de um triangulo ou de um circulo!\n");

        System.out.println("Digite o numero da operacao desejada:");
        System.out.println("[1] Area de um Triangulo");
        System.out.println("[2] Area de um Circulo");
        escolha = scn.nextInt();

        if(escolha == 1){
            System.out.println("Digite o valor da base do triangulo: ");
            base = scn.nextInt();

            System.out.println("Digite o valor da altura do triangulo: ");
            altura = scn.nextInt();

            area = base*altura/2;

            System.out.println("\nA area do triangulo com base " + base + " e altura " + altura + " = " + area);
        }else{
            System.out.println("Digite o valor da base do raio do circulo ");
            raio = scn.nextInt();

            areaC = 3.14*Math.pow(raio,2);

            System.out.println("\nA area do circulo de raio " + raio + " = " + areaC);
        }    
    }
}