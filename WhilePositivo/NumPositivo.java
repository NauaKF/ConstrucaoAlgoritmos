import java.util.Scanner;

public class NumPositivo{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int num = 0, aux = 0, resultado = 0;


        while(num >= 0){
            System.out.println("Digite o numero desejado: ");
            num = scn.nextInt();

            aux = num;
            if(num >= 0){
            resultado = resultado + aux;
            }
        }
        System.out.println("\nResultado = " + resultado);

        scn.close();
    }
}