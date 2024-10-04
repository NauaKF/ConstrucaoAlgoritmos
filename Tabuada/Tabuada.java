import java.util.Scanner;

public class Tabuada{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int i = 0, tabuada = 0, resultado = 0;

        System.out.println("Digite o numero que deseja saber a tabuada: ");
        tabuada = scn.nextInt();

        for(i=1; i<=10; i++){
            resultado = tabuada * i;
            System.out.println(i + " * " + tabuada + " = " + resultado);
        }
    }
}