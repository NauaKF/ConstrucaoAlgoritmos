import java.util.Scanner;

public class Media{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        double num = 0.0, aux = 0.0, resultado = 0.0, cont = 0.0;

        System.out.println("Digite o valor desejado: ");
        num = scn.nextDouble();

        if(num == 0){
            System.out.println("Digite um valor diferente de zero! ");
            num = scn.nextDouble();
        }

        while(num != 0){
            aux = num;
            resultado = resultado + aux;
            cont++;

            System.out.println("Digite o valor desejado: ");
            num = scn.nextDouble();
        }
        System.out.println("\nMedia = " + (resultado/cont));
    }
}